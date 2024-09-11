import java.util.Scanner;
public class linear {   
    public static int linearSearch(int search[],int key){
        for(int i=0; i<search.length; i++){
            if(search[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int search[]=new int[5];
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Element in array :");
        for(int i=0; i<search.length; i++){
            search[i]=sc.nextInt();
        }

        System.out.println();

        System.out.println("Enter a Key :");
        int key=sc.nextInt();
        int index= linearSearch(search, key);

        if (index==-1){
            System.out.println("Element is not found:");
        }
        else
        System.out.println("Element is found at index:" +index);        
    }
}
