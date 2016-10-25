
/**
 * Write a description of class DayViewer here.
 * 
 * @author KC
 * @version 9/1/16
 */
public class DayViewer
{
    public static void main(String[] args)
    {
        Day today = new Day();
        System.out.println(today);
        today.addDays(100);
        System.out.println(today);
        Day today2 = new Day();
        System.out.println(today2);
        Day finalExam = new Day(2016, 12, 16);
        int days = finalExam.daysFrom(today2);
        System.out.println(days);
    }
}
