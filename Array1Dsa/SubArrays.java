
public class SubArrays {
    public static void PrintSub(int numbers[]){
        int ts=0;
        int sum=0;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            int start = i;
            for(int j=i+1; j<numbers.length; j++){
                int end = j;
                for(int k=start;  k<=end; k++){
                    sum+=numbers[k];
                    System.out.print(numbers[k]+" ");
            }
                System.out.println("Sum Of Subarrays is:"+sum);

                if(sum>max){
                    max=sum;
                }  
                if(sum<min){
                    min=sum;
                }    
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays :" + ts);
        System.out.println("Maximum Sum Of Subarray:" + max );
        System.out.println("Minimum Sum of Subarray: " + min);
    }

     public static void main(String args[])
        {
            int numbers[] ={2,4,6,7,8,9,10};
            PrintSub(numbers);

        }
}
