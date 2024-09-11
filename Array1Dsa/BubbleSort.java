public class BubbleSort {

    public static void BubbleS(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int swaps=0;
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++; 
                }
            }

            if(swaps==0)
            {
                break;
            }
        }
    }

    public static void printArr(int arr[])
    {
        
        System.out.println("Sorted unsortedArray:");

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }

        System.out.println();
    }

    public static void printSArr(int Sortedarr[])
    {
        System.out.println("Sorted Array:");
        
        for(int i=0; i<Sortedarr.length; i++)
        {
            System.out.print(Sortedarr[i] +" ");
        }
    }


    public static void InsertionSort(int Inserarr[])
    {
        for(int i=1; i<Inserarr.length; i++)
        {
            int curr = Inserarr[i];
            int prev =  i-1;

            // Finding Out Correct Position To Insert .

            while(prev>=0 && Inserarr[prev]> curr)
            {
                Inserarr[prev+1] = Inserarr[prev];
                prev--;
            }

            Inserarr[prev+1] = curr;
        }
    }

    public static void print(int Inserarr[])
    {
        for(int i=0; i<Inserarr.length; i++)
        {
            System.out.print(Inserarr[i]+" ");
        }
    }


    


    public static void main(String args[])
    {
        int arr[] ={5,6,7,8,9} ;
        BubbleS(arr);
        printArr(arr);

        printSArr(arr);

    }
}