package cricket.model.match;

import org.w3c.dom.Node;

/**
 * Subclass of Match which is currently upcoming
 * This will override the base
 *
 * @author Aditya Prakash
 */
public class UpcomingMatch extends Match {
    public UpcomingMatch() {
        current = "upcoming";
    }

    /**
     * Prints details which are specific to UPCOMING Match
     */
    @Override
    public void printSpecificDetails() {
        // Nothing specific here
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
     * Populates the details for the UPCOMING MATCH
     */
    @Override
    public void populateSpecificDetails(Node matchNode) {
        // Nothing specific here
    }
}