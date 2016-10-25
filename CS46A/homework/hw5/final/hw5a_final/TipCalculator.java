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
        final double EXCELLENT_TIP = .25;
        final int EXCELLENT_SERVICE = 3;
        final double GOOD_TIP = .20;
        final int GOOD_SERVICE = 2;
        final double FAIR_TIP = .10;
        final int FAIR_SERVICE = 1;
        final double POOR_TIP = .05;
        final int POOR_SERVICE = 0;
        double cost;
        System.out.print("What was the cost of your cruise? ");
        cost = user_input.nextDouble();
        int quality;
        System.out.print("What was quality of service? 0 is poor and 3 is excellent: ");
        quality = user_input.nextInt();
        if (cost > 0)
        {
            if (quality == 0)
            {
                System.out.printf("The tip should be $%.2f%n", (cost * POOR_TIP)); 
            }
            else if (quality == 1)
            {
                System.out.printf("The tip should be $%.2f%n", (cost * FAIR_TIP)); 
            }
            else if (quality == 2)
            {
                System.out.printf("The tip should be $%.2f%n", (cost * GOOD_TIP)); 
            }
            else if (quality == 3)
            {
                System.out.printf("The tip should be $%.2f%n", (cost * EXCELLENT_TIP)); 
            }
            else
            {
                System.out.println("The quality rating must be 0, 1, 2, or 3");
            }
        }
        else
        {
            System.out.println("The cost must be a positive number");
        }
    }
}
