/**
 * 
 * @author Katy Cooperstein
 */
import java.util.Scanner;
public class Trianlgle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many rows in the triangle? ");
        int i = 0;
        int newInt;
        while (i == 0)
        {
            if (in.hasNextInt())
            {
                newInt = in.nextInt();
                if (newInt > 0)
                {
                    i = newInt;
                }
                else
                {
                    System.out.print("How many rows in the triangle? ");
                }
            }
            else 
            {
                System.out.print("How many rows in the triangle? ");
                in.next();
            }
        }
        System.out.println(i);
    }
}
