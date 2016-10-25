
/**
 * Insurance class is the insurance for a certain client/person
 * 
 * @author Katy Cooperstein
 */
public class Insurance
{   
    private Person client;
    /**
     * constructor for Insurance class
     * @param p is the client
     */
    public Insurance(Person p)
    {
        client = p;
    }
    /**
     * gets the clients age from the person class
     * @return the clients age
     */
    public int clientAge()
    {
        return client.getAge();
    }
    /**
     * gets the clients gender from the person class
     * @return the clients gender
     */
    public String clientGender()
    {
        return client.getGender();
    }
    /**
     * adds 1 to the age of the client
     */
    public void incrementAge()
    {
        client.birthday();
    }
    /**
     * gets the monthly premium based on gender and age
     * @return the price
     */
    public double monthlyPremium()
    {
        double price = 0;
        if (client.getAge() >= 16)
        {
            if (client.getGender().equals("m"))
            {
                if (client.getAge() < 25)
                {
                    price = 85.50;
                }
                else if (client.getAge() == 25)
                {
                    price = 55.00;
                }
                else if (client.getAge() < 85)
                {
                    price = 55.00;
                }
                else if (client.getAge() >= 85)
                {
                    price = 92.00;
                }
            }
            else
            {
                if (client.getAge() < 25)
                {
                    price = 79.25;
                }
                else if (client.getAge() == 25)
                {
                    price = 45.00;
                }
                else if (client.getAge() < 85)
                {
                    price = 45.00;
                }
                else if (client.getAge() >= 85)
                {
                    price = 90.00;
                }
            }
            return price;
        }
        else
        {
           return (-1);
        }
    }
}
