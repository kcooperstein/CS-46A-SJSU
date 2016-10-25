
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
}
