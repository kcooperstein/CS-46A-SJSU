
/**
 *Tip Calculator calculates the amount of tip you should give based on the cost of the bill and the quality of the service
 *
 *@author Katy Cooperstein
 */
import java.util.Scanner;
public class TipCalculator
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        String cost;
        System.out.print("What was the cost of your cruise? ");
        cost = user_input.next();
        String quality;
        System.out.print("What was quality of service? 0 is poor and 3 is excellent: ");
        quality = user_input.next();
        System.out.println(cost + " " + quality);
    }
}
