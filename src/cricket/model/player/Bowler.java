package cricket.model.player;

import cricket.Constants;
import cricket.model.match.Player;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Bowler extends Player {
    private String wickets;
    private String overs;
    private String maidens;

    public static Bowler getFromXML(Node batsmanNode) {
        Element e = (Element) batsmanNode;
        Bowler bowler = new Bowler();
        bowler.setId(e.getAttribute(Constants.PLAYER.ID));
        bowler.setName(e.getAttribute(Constants.PLAYER.NAME));
        bowler.setRuns(e.getAttribute(Constants.PLAYER.RUNS));
        bowler.setOvers(e.getAttribute(Constants.BOWLER.OVERS));
        bowler.setMaidens(e.getAttribute(Constants.BOWLER.MAIDENS));
        bowler.setWickets(e.getAttribute(Constants.BOWLER.WICKETS));
        return bowler;
    }

    public String getWickets() {
        return wickets;
    }

    public void setWickets(String wickets) {
        this.wickets = wickets;
    }

    public String getOvers() {
        return overs;
    }

    public void setOvers(String overs) {
        this.overs = overs;
    }

    public String getMaidens() {
        return maidens;
    }

    public void setMaidens(String maidens) {
        this.maidens = maidens;
    }

    @Override
    public String toString() {
        return "Bowler [wickets=" + wickets + ", overs=" + overs + ", maidens=" + maidens + ", getId()= " + getId() + ", getName()=" + getName() + ", getRuns()=" + getRuns() + "]";
    }
}