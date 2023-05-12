package cricket;

import cricket.model.match.Match;
import cricket.model.match.UpcomingMatch;
import cricket.model.team.Team;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class where all the work happens.
 * <ul>
 * <li>1. Access the CricBuzz API to get live matches/score of desired
 * match
 * <li>2. Parses the XML content using JAXP
 * <li>3. Also maps the content to appropriate model class, so that
 * objects are
 * created with match details by parsing XML
 * <li>4. Finally it has methods to display the details to console too
 * </ul>
 */
public class CricBuzz {
    private static final String LIVE_MATCHES_URL = "http://synd.cricbuzz.com/j2me/1.0/livematches.xml";

    /**
     * 1. Consumes the live match API
     * 2. Parses the result and converts #{Match} objects from the same
     * 3. Finally, returns List of live matches
     *
     * @return List of live matches
     * @throws IOException
     */
    public List<Match> getLiveMatches() throws IOException {
        List<Match> matches = new ArrayList<>();
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(LIVE_MATCHES_URL);
            NodeList nList = doc.getElementsByTagName("match");
            for (int i = 0; i < nList.getLength(); i++) {
                Node matchNode = nList.item(i);
                matches.add(Match.getMatchObjectFromXML(matchNode));
            }
        } catch (Exception e) {
            System.out.println("Error in fetching LIVE_MATCHES");
            e.printStackTrace();
        }
        return matches;
    }

    /**
     * 1. Searches for a particular match
     * 2. Parses the XML and creates the #{Match} object
     * 3. Returns the Match object
     *
     * @param matchID - ID of desired match (Must be valid)
     * @return - #{Match} object containing all the details
     * @throws IOException
     */
    public Match getMatchById(String matchID) throws IOException {
        List<Match> liveMatches = getLiveMatches();
        for (Match m : liveMatches) {
            if (m.getId().equals(matchID)) {
                return m;
            }
        }
        throw new IllegalArgumentException(String.format("No match found for ID : %s", matchID));
    }

    /**
     * This method provides Match details in a greater depth
     * ie Teams, Scores, Innings
     *
     * @param matchID
     * @return
     * @throws Exception
     */
    public Match getMatchDetails(String matchID) throws Exception {
        Match match = getMatchById(matchID);
        final String commentaryURL = match.getCommentaryURL();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.
                newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(commentaryURL);
        Node matchNode = doc.getElementsByTagName("match").item(0);
        Element matchElement = (Element) matchNode;
        setTeams(match, matchElement);
        match.populateSpecificDetails(matchNode);
        return match;
    }

    /**
     * Determines based on toss and decision post toss
     * that which team is batting and the one which is bowling
     *
     * @param match
     * @param matchElement
     */
    private void setTeams(final Match match, Element matchElement) {
        Element scores = (Element) matchElement.getElementsByTagName("mscr").item(0);
        Node team1Node = matchElement.getElementsByTagName("Tm").item(0);
        Node team2Node = matchElement.getElementsByTagName("Tm").item(1);
        Team team1 = Team.generateTeamObject(team1Node);
        Team team2 = Team.generateTeamObject(team2Node);
        if (match instanceof UpcomingMatch) {
            // we don't know batting and bowling teams. Set in random order
            match.setBattingTeam(team1);
            match.setBowlingTeam(team2);
            return;
        }

        Node battingTeamNode = scores.getElementsByTagName("btTm").
                item(0);
        Node bowlingTeamNode = scores.getElementsByTagName("blgTm").
                item(0);

        if (match.getTossWonBy().equalsIgnoreCase(team1.getFullName())) {
            // TEAM 1 won the toss
            if (match.getDecisionOfTeamWinningToss().equalsIgnoreCase("Fielding")) {
                match.setBattingTeam(team2);
                match.setBowlingTeam(team1);
            } else {
                match.setBattingTeam(team1);
                match.setBowlingTeam(team2);
            }
            team1.setInnings(battingTeamNode);
            team2.setInnings(bowlingTeamNode);
        } else {
            // TEAM 2 won the toss
            if (match.getDecisionOfTeamWinningToss().equalsIgnoreCase
                    ("Fielding")) {
                match.setBattingTeam(team1);
                match.setBowlingTeam(team2);
            } else {
                match.setBattingTeam(team2);
                match.setBowlingTeam(team1);
            }
            team2.setInnings(battingTeamNode);
            team1.setInnings(bowlingTeamNode);
        }
    }

    /**
     * Prints the score of selected Match in detail
     *
     * @param matchId
     * @throws Exception
     */
    public void printScoreOfSelectedMatch(String matchId) throws Exception {
        Match m = getMatchDetails(matchId);
        m.printMatchDetails();
    }

    /**
     * Prints the summary of live ongoing matches
     *
     * @throws IOException
     */
    public void printLiveMatches() throws IOException {
        System.out.println("=============LIVE MATCHES===============");
        List<Match> matches = getLiveMatches();
        int i = 1;
        for (Match m : matches) {
            m.printMatchSummary(i++);
        }
        System.out.println("=======================================");
    }
}