public class Human{

    int age;
    public Car car;
    private boolean canDrive; 
    
   public Human(int age, Car car){
        this.age = age;
       
        if(this.age > 18){
            canDrive = true; 
             this.car = car;
        }else{
            canDrive = false;
            this.car = null; 
        }
    } 
    
    
    
    public void SayWhatCarIAmDriving(){
        CarBrand myCarbrand = this.car.getBrand();

        if(myCarbrand != CarBrand.VOLVO){
            System.out.println("I'm Driving a " + myCarbrand); 
        }
    }
    
}
