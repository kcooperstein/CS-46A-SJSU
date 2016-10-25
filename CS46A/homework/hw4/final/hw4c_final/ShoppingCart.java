
/**
 * Adds items to the shopping cart and increases the subtotal
 * 
 * @author - Katy Cooperstein
 */
public class ShoppingCart
{
    private double subtotal;
    public static final double TAX = .085;
    private String contents;
    /**
     * constructs a shopping cart
     * 
     */
    public ShoppingCart()
    {
        subtotal = 0;
        contents = "";
    }
    /**
     * adds the cost to the subtotal
     * 
     * @param cost cost of the good
     */
    public void add(double cost)
    {
        subtotal = subtotal + cost;
        String newContents = ("Add Item: " + cost + "\n");
        this.contents = contents + newContents; 
    }
    /**
     * removes the cost of the good from the subtotal
     * 
     * @param cost cost of the good
     */
    public void remove(double cost)
    {
        subtotal = subtotal - cost;
        String newContents = ("Remove Item: " + cost + "\n");
        this.contents = contents + newContents; 
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
    /**
     * gets the total of the Shopping Cart including tax
     * 
     * @return the total of the Shopping Cart
     */
    public double getTotal()
    {
        return subtotal + (subtotal * TAX);
    }
    /**
     * gets the contents of the shopping cart
     * @return the string representation of what is actually in the shopping cart
     */
    public String getContents()
    {
        return contents + "Total: " + this.getTotal() + "\n";
    }
    /**
     * resets the object to its original state where no items are in the cart
     */
    public void reset()
    {
        contents = "";
        subtotal = 0;
    }
}
