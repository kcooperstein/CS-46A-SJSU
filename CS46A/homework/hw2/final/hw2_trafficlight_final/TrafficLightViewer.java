public class TrafficLightViewer
{
    public static void main(String[] args)
    {
        Rectangle light = new Rectangle(50, 20, 20, 60);
        light.draw();
        Ellipse red = new Ellipse(50, 20, 20, 20);
        red.setColor(Color.RED);
        red.draw();
        red.fill();
        Ellipse yellow = new Ellipse(50, 40, 20, 20);
        yellow.setColor(Color.YELLOW);
        yellow.draw();
        yellow.fill();
        Ellipse green = new Ellipse(50, 60, 20, 20);
        green.setColor(Color.GREEN);
        green.draw();
        green.fill();
    }
}