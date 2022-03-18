
/**
 * Item class for items being sold in the storefront.
 */
public class Item
{
    private int price;
    private String name;

    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        this.price = 10;
    }
    public Item (int price, String name){
        this.price = price;
        this.name = name;
    }
    
    public Item(int price){
        this.price = price;
        this.name = "New Item";
    }
    
    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}
