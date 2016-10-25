
/**
 * Spanish translator takes a string and converts it to spanish
 * @author - Katy Cooperstein
 */
public class SpanishTranslator
{
    private String word;
    /**
     * constructor for Spanish Translator, sets up the instance variables
     * @param word is the word that will be taken
     */
    public SpanishTranslator(String word)
    {
        this.word = word;
    }
    /**
     * sets a word = to a spanish word
     * @param newSpanishWord which is the new spanish word
     */
    public void setSpanish(String newSpanishWord)
    {
        word = newSpanishWord;
    }
    /**
     * gets the spanish word
     * @return the spanish word
     */
    public String getSpanish()
    {
        return word;
    }
}
