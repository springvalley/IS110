public class Item
{
   private String name;
   private int value;
   private int weight;
   
   public Item(String name, int value, int weight){
       this.name = name;
       this.value = value;
       this.weight = weight;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    
}
