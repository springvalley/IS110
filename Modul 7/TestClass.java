public class TestClass{
    
     int[] numbers;
     
    public TestClass(){
         numbers = new int[10];
         
         for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
            }
    }
    
    public void PrintOddOrEven(){
        String output = "";
        for(int i = 0; i < numbers.length; i++){
            output = i % 2 == 0 ? "Partall" : "Oddetall";
            System.out.println(output);
        }
    }
    
  

}
