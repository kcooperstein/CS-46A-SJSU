/**
 * @author katy cooperstein
 */
public class SomeLoops
{
    public String countSJSU(int count)
    {
        int i = 1;
        String sentence = "";
        for (i = 1; i <= count; i++)
        {
            sentence = "SJSU " + sentence;
        }
        return sentence;
    }
    public int sumEveryThird(int limit)
    {
        int i;
        int sum = 0;
        for (i = 3; i < limit; i = i + 3)
        {
            if (i % 5 != 0)
            {
                sum = i + sum;
            }
        }
        return sum; 
    }
    public String noXYZ(String s)
    {
        String sentence = "";
        int i = 0;
        do
        {
            String letter = s.substring(i, i + 1);
            if (!"xyz".contains(letter))
            {
                sentence = sentence + letter;
            }
            i++;
        }while (i < s.length());
        return sentence;
    }
}

