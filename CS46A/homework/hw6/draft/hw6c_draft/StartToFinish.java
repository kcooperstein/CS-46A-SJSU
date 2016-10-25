/**
 * Processes first and last letters of words
 */
public class StartToFinish
{
    private String phrase;
    /**
     * Constructs a StartToFinish object
     * @param myString the phase for this object
     */
    public StartToFinish(String myString)
    {
        phrase = myString;
    }
    /**
     * gets the first letter of the first word
     * @return either an empty string or the letter of the word
     */
    public String firstLetters()
    {
        if (phrase.substring(0).equals(""))
        {
            return ("");
        }
        else
        {
            return phrase.substring(0,1);
        }
    }
    /**
     * gets the last letter
     * @return last letter of word
     */
    public String lastLetters()
    {
        return null;
    }
}
