public class Robot
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private Picture pic;
    /**
     * Constructor for objects of class Robot
     */
    public Robot(int initialX, int initialY)
    {
        // initialise instance variables
        initialX = x;
        initialY = y;
        pic = new Picture("myrobot.jpeg");
        pic.draw();
    }

    /**
     * This method has an image move to the right
     * 
     * @param  movement by x,y
     *
     */

    public void moveRight()
    {
        //pic.translate(pic.getWidth(), 0);
        this.moveHorizontally(1);
    }
    
    public void moveDown()
    {
        this.moveVertically(1);
    }
    
    /**
     * This method has an image move horizontally by the images width multiplied by a user input
     * 
     * @param y - user input on how much the user wants the image to move 
     */
    
    public void moveHorizontally(int y)
    {
        x = pic.getWidth()*java.lang.Math.abs(y);
       // x = x + y;
        pic.translate(pic.getWidth() * y, 0);
    }
    
    public void moveVertically(int x)
    {
        y = pic.getHeight() * java.lang.Math.abs(x); 
        pic.translate(0, pic.getHeight() * x);
    }
    
    /** 
     * Gets the horizontal grid location of this robot
     * @return the horizontal grid location
     * 
     */
    public int getX()
    {
        return pic.getX() / pic.getWidth();
    }
    
    public int getY()
    {
        return pic.getY() / pic.getHeight();
    }
}
