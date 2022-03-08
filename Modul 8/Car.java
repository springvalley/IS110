public class Car{

private CarBrand brand;


public Car(CarBrand brand, Human driver){
    this.brand = brand;
   
    start();
}

public void start(){
   System.out.println("Vroom"); 
}

public CarBrand getBrand(){
    return this.brand; 
}
 
}
