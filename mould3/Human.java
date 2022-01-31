
public class Human
{
    private String name;
    private int age;
    private Head head;
    private Limb arm1;
    private Limb arm2;
    
    public Human (String name, int age){
        this.name = name;
        this.age = age;
        this.head = new Head();
        this.arm1 = new Limb(true);
        this.arm2 = new Limb(true);
        sayName();
    }
    
    public void sayName(){
        head.say("Hi my name is " + name);
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
 
}
