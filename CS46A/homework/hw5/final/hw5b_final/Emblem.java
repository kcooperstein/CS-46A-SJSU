
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
        if (theMiddle.length() <= 1)
        {
            middle = theMiddle;
        }
        else
        {
            middle = theMiddle.substring(0,1);
        }
        last = theLast;

    }
    /**
     * the constructor for the second constructor in the Emblem class
     * @param theFirst the first name
     * @param theLast the last name
     */
    public Emblem(String theFirst, String theLast)
    {
        first = theFirst;
        middle = "";
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
    /**
     * method for getting the length of the whole name without spaces
     * 
     * @return the length of the first, middle initial, and the last name all added together
     */
    public int characterCount()
    {
        return first.length() + middle.length() + last.length();
    }
    /**
     * method for getting the full name returning with spaces
     * @return the full name, first name, middle inital, and then the last name in proper form with spacing
     */
    public String getFullName()
    {
        if (middle.equals(""))
        {
            return first + " " + last;
        }
        else
        {
            return first + " " + middle + " " + last;
        }
    }
    /**
     * method for getting the initials for the Emblem
     * @return the first character of the first name, the middle initial and then the first character of the last name
     */
    public String getEmblem()
    {
        return first.charAt(0) + middle + last.charAt(0);
    }
    
}
