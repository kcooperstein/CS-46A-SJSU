
/**
 * @author Katy Cooperstein
 */
public class JavaBuilding
{
    private double sideOfTheCube;
    public static final int SQUARE_FEET_PER_GALLON = 400;
    public static final double PRICE_PER_GALLON = 32.27;
    /**
     * constructor for the javabuilding class
     * @param x the length of the side of the cube
     */
    public JavaBuilding(double x)
    {
        if (x >= 0)
        {
            sideOfTheCube = x;
        }
        else
        {
            sideOfTheCube = 0;
        }
    }
    /**
     * gets the exposed surface area in order to tell how much paint is needed
     * @return the surface area
     */
    public double getSurfaceArea()
    {
        return 10*Math.pow(sideOfTheCube,2);
    }
    /**
     * gets the cost of painting the building by multiplying the price of the paint by the surface area
     * @return the cost of painting the building
     */
    public double getCost()
    {
        return (this.getSurfaceArea() * PRICE_PER_GALLON) / SQUARE_FEET_PER_GALLON;
    }
    /**
     * increases the side length of the building
     * @param amount the amount that the side will be increased by
     */
    public void increaseSide(double amount)
    {
        if (amount > 0)
        {
            sideOfTheCube = sideOfTheCube + amount;
        }
    }
}
