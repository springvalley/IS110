
/**
 * Write a description of class Journal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Journal extends Book
{
    private String name;
   private boolean writtenIn;
    public Journal(String name, boolean writtenIn)
    {
        super(name);
        this.name = super.getName();
        this.writtenIn = writtenIn;
    }
    
    @Override
    public String getName(){
        return this.name + "123";
    }
}
