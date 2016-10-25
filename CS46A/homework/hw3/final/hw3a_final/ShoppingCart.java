
/**
 * Adds items to the shopping cart and increases the subtotal
 * 
 * @author - Katy Cooperstein
 */
public class ShoppingCart
{
    private double subtotal;
    /**
     * constructs a shopping cart
     * 
     */
    public ShoppingCart()
    {
        subtotal = 0;
    }
    /**
     * adds the cost to the subtotal
     * 
     * @param cost cost of the good
     */
    public void add(double cost)
    {
        subtotal = subtotal + cost;
    }
    /**
     * removes the cost of the good from the subtotal
     * 
     * @param cost cost of the good
     */
    public void remove(double cost)
    {
        subtotal = subtotal - cost;
    }
    /**
     * gets the subtotal of the Shopping Cart
     * 
     * @return the subtotal of the Shopping Cart
     */
    public double getSubtotal()
    {
        return subtotal;
    }
}
