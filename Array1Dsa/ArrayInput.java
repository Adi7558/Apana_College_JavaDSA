import java.util.Scanner;

public class ArrayInput {

    public static void update(int mark[]){
         for(int i=0; i<mark.length; i++)
        {
            System.out.println(mark[i]+1);
        }
    }
    
    public static void main(String args[]){
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<marks.length; i++)
        {
            System.out.println("Enter the Marks:");
            marks[i]=sc.nextInt();
        }

        System.out.println();
        update(marks);
    }
}

