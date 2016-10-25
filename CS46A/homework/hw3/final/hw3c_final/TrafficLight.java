
/**
 * Traffic Light takes in an x and y and draws a box then will draw a traffic light
 * 
 * @author Katy Cooperstein
 */
public class TrafficLight
{
    private double x;
    private double y;
    
    /**
     * constructs a traffic light 
     * 
     * @param x2 takes in a specific x coordinate
     * @param y2 takes in a specific y coordinate
     */
    public TrafficLight(int x2, int y2)
    {
        x = x2;
        y = y2;   
    }   
    /**
     * draws whatever it is told to draw
     */
    public void draw()
    {
        Rectangle light = new Rectangle(x, y, 20, 60);
        light.draw();
        Ellipse red = new Ellipse(x, y, 20, 20);
        red.setColor(Color.RED);
        red.draw();
        red.fill();
        Ellipse yellow = new Ellipse(x, y + 20, 20, 20);
        yellow.setColor(Color.YELLOW);
        yellow.draw();
        yellow.fill();
        Ellipse green = new Ellipse(x, y + 40, 20, 20);
        green.setColor(Color.GREEN);
        green.draw();
        green.fill();
    }
}
