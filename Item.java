
/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String description;
    private double peso;

    /**
     * Constructor for objects of class Item
     */
    public Item(String description, double peso)
    {
        // initialise instance variables
        this.description = description;
        this.peso = peso;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getLongDescription()
    {
        // put your code here
        return description +"  " +(peso + " kg");
    }
}
