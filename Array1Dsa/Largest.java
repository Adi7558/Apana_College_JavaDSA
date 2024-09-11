public class Largest{
    public static int GetNumbers(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
           
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(largest>numbers[i]){
                Smallest=numbers[i];
            }
        }

        System.out.println("Smallest Value is "+Smallest);
        return largest;
    }
    
    public static void main(String args[]){
        
        int numbers[] ={2,4,5,6,8,7,9,2};

        System.out.println(GetNumbers(numbers));
    }
}