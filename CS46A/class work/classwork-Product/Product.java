/**
 * Models a product that changes(increases/decreases) in price
 */

public class Product
{
    private String name;
    private double price;
   /**
    * constructs a product 
    * 
    * @param theName the name of this Product
    * @param thePrice the price of this Product
    */
    public Product(String theName, double thePrice)
    {
        price = thePrice;
        name = theName;
    }
    
   /**
    * Gets the price of this Product
    * 
    * @return the price
    */
   public double getPrice()
   {
       return price;
   }
   /**
    * Gets the name of this Product
    * 
    * @return the name of the product
    */
   public String getName()
   {
        return name;
   }
   /**
     * Reduces the price by the given amount
     * 
     * @param percent the percent to reduce the price by
    */
   public void reducePrice(double percent)
   {
       double amountToReduce = price * percent / 100.0;
       price = price - amountToReduce;
   }
   
   public void increasePrice(double percent)
   {
       double amountToIncrease = price * percent / 100.0;
       price = price + amountToIncrease;
   }

}