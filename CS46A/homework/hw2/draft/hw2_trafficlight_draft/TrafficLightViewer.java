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
    }
}
