
/**
 * Models a small cylinder package 
 * filled with crude oil 
 */
public class OilPackage
{
    //instance variables
    // define the instance variables 
    private double radius;
    private double height;
    private double volume;
    
    //constants
    //define a constant for price of a barrel of oil($47)
    public static final double PRICE_OF_OIL = 47;
    //define a constant for cubic inches in a barrel (9,702)
    public static final double INCHES_IN_BARREL = 9702;
    //define a constant for the cost of the cylinder itself ($3.50)
    public static final double COST_OF_CYLINDER = 3.50;
    

    /**
     * Constructor for objects of class OilPackage
     * @param theRadius the radius of the cylinder
     * @param theHeight the height of the cylinder
     */
    public OilPackage(double theRadius, double theHeight)
    {
        radius = theRadius;
        height = theHeight;
    }
    
    /**
     * Gets the volume of the cylinder
     * @return the volume of the cylinder
     */
    public double getVolume()
    {
        volume = Math.PI * Math.pow(radius,2) * height;
        return volume;
    }
    
    /**
     * Gets the cost of the cylinder of oil plus 
     * cylinder package
     * @return the cost including oil and packaging
     */
    public double getCost()
    {
        //do not recaluclate the volume here
        return COST_OF_CYLINDER + (PRICE_OF_OIL / INCHES_IN_BARREL) * volume;
    }
    
    /**
     * Sets a new radius for this package
     * @param newRadius the new radius to set.
     */
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
}
