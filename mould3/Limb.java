public class Limb
{
    private boolean isArm;
    public Limb(boolean isArm)
    {
        this.isArm = isArm;
    }

    public void grab(){
        if(this.isArm){
            System.out.println("GRABBED!");
        }
    }
}
