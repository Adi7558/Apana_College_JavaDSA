public class Pairs {
    public static void printpairs(int numbers[]){
        int tp=0;
        for(int i=0; i<numbers.length; i++){
            int current=numbers[i];
            {
                for(int j=i+1; j<numbers.length; j++ ){
                    System.out.print("(" +current + "," + numbers[j]+ ")");
                    
                }
                System.out.println();
            }
            
        }
        System.out.println("Total Pairs: " +tp);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,5,6,8,4,6,9,3};
        printpairs(numbers);
    }
}
