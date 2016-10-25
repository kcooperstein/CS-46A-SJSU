public class StringPrinter
{
    public static void main(String[] args)
    {
        String word = "seperate";
        System.out.println(word.length() * 2);
        System.out.println(word.toUpperCase());
        String newWord = word.replace("t", "7");
        newWord = newWord.replace("a", "4");
        newWord = newWord.replace("e", "3");
        System.out.println(newWord);
        System.out.println(word);
    }
}
