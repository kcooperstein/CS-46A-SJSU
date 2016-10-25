public class SolsticePrinter
{
    public static void main(String[] args)
    {
        Day today = new Day();
        System.out.println("Today is " + today);
        Day winterSolstice = new Day(2016, 12, 21);
        System.out.println(winterSolstice.daysFrom(today));
        today.addDays(100);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
    }
}
