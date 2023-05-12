package cricket.model.match;

import cricket.Constants;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Subclass of Match which is currently completed This will override the
 * base
 * class behaviour (Eg : display match completion stats) as well as extend
 * it
 * (add more attributes indicating)
 *
 * @author Aditya Prakash
 */
public class CompletedMatch extends Match {
    private String manOfTheMatch;

    public CompletedMatch() {
        current = "complete";
    }

    public String getManOfTheMatch() {
        return manOfTheMatch;
    }

    public void setManOfTheMatch(String manOfTheMatch) {
        this.manOfTheMatch = manOfTheMatch;
    }

    /**
     * Prints details which are specific to Completed Match Here they are 1.
     * Man Of
     * the Match
     */
    @Override
    public void printSpecificDetails() {
        System.out.println("Man Of the Match =" + manOfTheMatch);
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
     * Populates the details for the COMPLETED MATCH
     * ie ManOfTheMatch
     */
    @Override
    public void populateSpecificDetails(Node matchNode) {
        Element matchElement = (Element) matchNode;
        Element momElement = (Element)
                matchElement.getElementsByTagName(Constants.MATCH_XML.MOM_PARENT).item(0);
        if (null != momElement) {
            Element momChild = (Element)
                    momElement.getElementsByTagName(Constants.MATCH_XML.MOM_CHILD).item(0);
            if (null != momChild) {
                this.setManOfTheMatch(momChild.getAttribute("Name"));
            }
        }
    }
}