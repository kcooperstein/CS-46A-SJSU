
/**
 * @author Katy Cooperstein
 */
public class Emblem
{
    private String first;
    private String middle;
    private String last;
    /**
     * constructor for the emblem class
     * @param theFirst the first name
     * @param theMiddle the middle name
     * @param theLast the last name
     */
    public Emblem(String theFirst, String theMiddle, String theLast)
    {
        first = theFirst;
        middle = theMiddle;
        last = theLast;
    }
    /**
     * gets the first name
     * @return the first name
     */
    public String getFirst()
    {
        return first;
    }
    /**
     * gets the middle name
     * @return the middle name
     */
    public String getMiddleInitial()
    {
        return middle;
    }
    /**
     * gets the last name
     * @return the last name
     */
    public String getLast()
    {
        return last;
    }
}
