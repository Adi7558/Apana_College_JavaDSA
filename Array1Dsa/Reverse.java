public class Reverse {
    public static void ReverseArray(int numbers[])
    {
        int start=0; 
        int end=numbers.length-1;

        while(start<end){

            int temp = numbers[end];
            numbers[end]=numbers[start];
            numbers[start]= temp;

            start++;
            end--;
        }

   }

   public static void main(String args[]){
    int numbers[]={2,4,5,6,8,5,7};
    ReverseArray(numbers);
    for(int i=0; i<numbers.length; i++){
        System.out.println("The Reverse Array is :"+numbers[i]);
    }

    System.out.println();
    
   }


}
