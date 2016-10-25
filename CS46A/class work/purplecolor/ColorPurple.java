
/**
 * Write a description of class ColorPurple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ColorPurple
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pick a color    ");
        String color1 = scan.next();
        System.out.print("Pick another color    ");
        String color2 = scan.next();
        if (color1.equals("red") && color2.equals("blue") || color1.equals("blue") && color2.equals("red"))
        {
            System.out.println("Purple");
        }
    }
}
