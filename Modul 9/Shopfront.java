import java.util.ArrayList;
import java.util.Iterator;
/**
 * Shopfront for Module 9 IS-110
 */
public class Shopfront
{
    private ArrayList<Item> inventory;

    /**
     * Constructor for objects of class Shopfront
     */
    public Shopfront()
    {
       this.inventory = new ArrayList<>();
    }

    public Item getItem(String itemName){
            int index = 0; 
            boolean found = false;
            Item itemToReturn = null;
            while(index < inventory.size() && !found){
                Item i = inventory.get(index);
                if(i.getName().equals(itemName)){
                    itemToReturn = i;
                    found = true;
                }else{
                    index ++;
                }
            }
            return itemToReturn;
    }
    
    public void InitItems(){
        addItem("Sykkel", 100);
        addItem("Båt", 1000);
    }
    
    public void printItems(){
        for(Item i : inventory){
            System.out.println(i.getName());
        }
    }
    
    
    public int getPriceOfItem(String itemName){
           return getItem(itemName).getPrice();
    }
    
    public void addItem(String name, int price){
        inventory.add(new Item(price, name));
    }
    public void addItem(Item item){
        inventory.add(item);
    }
}
