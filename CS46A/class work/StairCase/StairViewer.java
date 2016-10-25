public class StairViewer
{
    public static void main(String[] args)
    {
        Rectangle topBox = new Rectangle(20, 10, 20, 20);
        topBox.draw();
        Ellipse red = new Ellipse(20, 10, 20, 20);
        red.setColor(Color.RED);
        red.draw();
        red.fill();
        Rectangle middleBox = new Rectangle(20, 30, 40, 20);
        middleBox.draw();
        Ellipse green = new Ellipse(20, 30, 40, 20);
        green.setColor(Color.GREEN);
        green.draw();
        green.fill();
        Rectangle bottomBox = new Rectangle(20, 50, 60, 20);
        bottomBox.draw();
        Ellipse blue = new Ellipse(20, 50, 60, 20);
        Color blue2 = new Color(0, 0, 153);
        blue.setColor(blue2);
        blue.draw();
        blue.fill();
    }
}
