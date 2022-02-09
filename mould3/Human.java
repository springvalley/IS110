
public class Human
{
    private String name;
    private int age;
    private Head head;
    private Limb arm1;
    private Limb arm2;
    private Limb leg1;
    private Limb leg2;
    
    public Human (String name, int age){
        this.name = name;
        this.age = age;
        this.head = new Head();
        this.arm1 = new Limb(true);
        this.arm2 = new Limb(true);
        this.leg1 = new Limb(false);
        this.leg1 = new Limb(false);
        sayName();
        sayAge();
        head.laugh();
    }
    
    public void sayName(){
        head.say("Hi my name is " + name);
    }
    
    public void sayAge(){
        head.say("Hi I am " + age + " Years old" );
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
 
}
