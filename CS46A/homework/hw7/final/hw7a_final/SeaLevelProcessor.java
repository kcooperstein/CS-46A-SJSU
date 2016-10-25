
/**
 * 
 * @author Katy Cooperstein
 */
import java.util.Scanner;
public class SeaLevelProcessor
{
    /**
     * Constructor for objects of class SeaLevel
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int lowest = 0;
        double average = 0;
        int count = 0;
        int below = 0;
        System.out.print("Enter the sea level or Q to quit: ");
        while (in.hasNextInt())
        {
            int sea = in.nextInt();
            if (count == 0)
            {
                lowest = sea;
            }
            if (lowest > sea)
            {
                lowest = sea;
            }
            if (sea < 0)
            {
                below++;
            }
            average = average + sea;
            count++;
            System.out.print("Enter the sea level or Q to quit: ");
        }
        if (count > 0)
        {
            System.out.println(below);
            System.out.println(lowest);
            if (count > 0)
            {
                System.out.println(average / count);
            }
            else
            {
                System.out.println("0");
            }
        }
        else
        {
            System.out.println("No values entered");
        }
    }
}
