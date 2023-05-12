package cricket.model.match;

import cricket.Constants;
import cricket.model.player.Batsman;
import cricket.model.player.Bowler;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * Subclass of Match which is currently ongoing This will override the base
 * class behaviour (Eg : display match stats) as well as extend it (add
 * more
 * attributes indicating the live score)
 *
 * @author hemant
 */
public class LiveMatch extends Match {
    private List<Batsman> batsmen = new ArrayList<>();
    private List<Bowler> bowlers = new ArrayList<>();

    public LiveMatch() {
        current = "inprogress";
    }

    public List<Batsman> getBatsmen() {
        return batsmen;
    }

    public void setBatsmen(List<Batsman> batsmen) {
        this.batsmen = batsmen;
    }

    public List<Bowler> getBowlers() {
        return bowlers;
    }

    public void setBowlers(List<Bowler> bowlers) {
        this.bowlers = bowlers;
    }

    public void setCurrentPlayers(LiveMatch match, Node matchNode) {
        Element e = (Element) matchNode;
        NodeList batsmenNodes = e.getElementsByTagName(Constants.MATCH_XML.BATSMEN);
        for (int i = 0; i < batsmenNodes.getLength(); i++) {
            Node batsmanNode = batsmenNodes.item(i);
            this.batsmen.add(Batsman.getFromXML(batsmanNode));
        }
        NodeList bowlerNodes = e.getElementsByTagName(Constants.MATCH_XML.BOWLERS);
        for (int i = 0; i < bowlerNodes.getLength(); i++) {
            Node bowlerNode = bowlerNodes.item(i);
            this.bowlers.add(Bowler.getFromXML(bowlerNode));
        }
    }

    /**
     * Prints details which are specific to Live Match
     * Here they are
     * 1. Current batsmen at crease and their score stats
     * 2. Current bowlers at crease and their stats
     */
    @Override
    public void printSpecificDetails() {
        System.out.println("--------Current batsmen at crease --------");
        final String format = "%-30s%-15s%-15s%-15s%-15s %n";
        System.out.printf(format, "Name", "Runs", "Balls", "Fours",
                "Sixes");
        for (Batsman bat : batsmen) {
            System.out.printf(format, bat.getName(), bat.getRuns(), bat.getBalls(), bat.getFours(), bat.getSixes());
        }

        System.out.println("--------Current bowlers at crease --------");
        System.out.printf(format, "Name", "Overs", "Runs", "Wickets",
                "Maidens");
        for (Bowler bowl : bowlers) {
            System.out.printf(format, bowl.getName(), bowl.getOvers(), bowl.getRuns(), bowl.getWickets(), bowl.getMaidens());
        }
    }

    @Override
    protected void setRuns(String attribute) {

    }

    @Override
    protected void setName(String attribute) {

    }

    @Override
    protected Object getName() {
        return null;
    }

    @Override
    protected Object getRuns() {
        return null;
    }

    /**
     * Populate specific attributes for a Live match
     * ie list of current batsmen and bowlers
     */
    @Override
    public void populateSpecificDetails(Node matchNode) {
        setCurrentPlayers(this, matchNode);
    }
}