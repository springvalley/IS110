import java.util.ArrayList;
import java.util.Iterator;

public class Shop{
    
    private ArrayList<Item> shopItems;
   public Shop(){
        shopItems = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            addItem(new Item("item" + i));
        }
       printInventory();
      
    }
    
    public void printInventory(){
          for(Item i : shopItems){
                System.out.println(i.getName());
            }
    }
    
    public void addItem(Item item){
           shopItems.add(item);
    }
    
    public Item getItem(String itemName){
           int index = 0;
           boolean found = false;
           Item itemtoReturn = null;
           while(index < shopItems.size() && !found){
                Item i = shopItems.get(index);
                if(i.getName().equals(itemName)){
                    itemtoReturn = i;
                    found = true;
                }else{
                    index++;
                }
               
            }
         return itemtoReturn;
    }
    
    public void removeItem(Item item){
        Iterator<Item> it = shopItems.iterator();
        while(it.hasNext()){
             if(it.next().getName().equals(item.getName())){
                    it.remove();
                }   
        }     
    }
}
