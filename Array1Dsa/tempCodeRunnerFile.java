public class BubbleSort {

    public static void BubbleS(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
               
            }
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String args[])
    {
        int arr[]= {5,3,8,4,2};
        BubbleS(arr);

    }
}
