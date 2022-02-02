import java.util.*;
public class Shop
{
   private ArrayList<Item> inventory;
   private Item item1;
   private Item item2;
   private Item item3;
   
   public Shop(){
        inventory = new ArrayList<>();
        item1 = new Item("Kopp", 10, 3);
        item2 = new Item("Pute", 15, 2);
        item3 = new Item("Bok", 25, 3);
        addItem(item1);
        addItem(item2);
        addItem(item3);
    }
    
    public void printInventory(){
        for(Item i : inventory){
            System.out.println(i.getName());
        }
    }
    
    public void addItem(Item item){
        inventory.add(item);
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
                index++;
            }
        }
        
        return itemToReturn;
    }
    
    public void removeItem(Item item){
        Iterator<Item> it = inventory.iterator();
        while(it.hasNext()){
            Item i = it.next();
            String itemName = i.getName();
            if(itemName.equals(item.getName())){
                it.remove();
            }
        }
    }
}
