package cricket.model.match;

//import org.w3c.dom.Node;

import org.w3c.dom.Node;

/**
 * Subclass of Match which is currently upcoming
 * This will override the base
 *
 * @author Aditya Prakash
 */
public class Player extends Match {
    public Player() {
        current = "upcoming";
    }

    @Override
    public void populateSpecificDetails(Node matchNode) {

    }

    @Override
    public void printSpecificDetails() {

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
}