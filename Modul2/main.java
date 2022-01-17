/*
 En enkel test klasse til modul 2 for IS-110
*/
public class Human
{
  //Private datafelt for klassen
    private String name;
    private int age;
  //Constructor funksjon, kalles hver gang et objekt av denne klassen blir initialisert, man kan også gi parametre til constructor funksjonen for å gi den egne verdier ved initialisering. 
    public Human(){
        name = "john";
        age = 22;
      //Illustrere bruk av utskrift til konsollen
        System.out.println(age);
    }
    
    //Enkel funksjon for å illustrere if-setninger 
    public boolean checkAge(){
        if(age > 20){
            return true;
        }else{
            return false;
        }
    }
    //Setter funksjon for å kunne sette den private age variablen fra utenfor denne klassen
    public void setAge(int age){
        this.age = age;
    }
    
    //Getter funksjon for å kunne returnere den private age variablen fra utenfor denne klassen
    public int getAge(){
        return this.age;
    }
 
}
