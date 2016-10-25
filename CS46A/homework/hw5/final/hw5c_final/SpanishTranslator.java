
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

    /**
     * gets the english version of the spanish word
     * @return the english translation
     */
    public String getEnglish()
    {
        String the = word.substring(0,3);
        int rest = word.length();
        if (the.equals("el "))
        {
            word = word.substring(3, rest);
        }
        else if (the.equals("la "))
        {
            word = word.substring(3, rest);
        }
        if (word.equals("estudiante"))
        {
            return "student";
        }
        else if (word.equals("aprender"))
        {
            return "to learn";
        }
        else if (word.equals("entender"))
        {
            return "to understand";
        }
        else if (word.equals("verde"))
        {
            return "green";
        }
        else
        {
            return null;
        }
    }
}
