
/**
 * Write a description of class StringActivity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringActivity
{
    public static void main(String[] args)
    {
        String word = "University";
        System.out.println(word.toLowerCase());
        String newWord = word.replace("s", "$");
        String newWord2 = newWord.replace("i", "1");
        String newWord3 = newWord2.replace("e", "3");
        System.out.println(newWord3.toLowerCase());
        System.out.println(word);
    }
    
}
