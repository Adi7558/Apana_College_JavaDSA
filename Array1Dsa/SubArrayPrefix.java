public class SubArrayPrefix {
public static void kadens(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs=0;
    /*boolean allNegative = true;
    for(int i=0; i<numbers.length; i++){
        if(numbers[i]>=0){
            allNegative = false;
            break;
        }
    }

    if(allNegative){
        System.out.println("-1");
        return;
    } */

    for(int i=0; i<numbers.length; i++){
        
        cs+=numbers[i];
        
            if(cs<0){
                cs = -1;
            }
            ms = Math.max(cs, ms);
        }
        
        
        System.out.println("Maximum Sum of SubArrays:" + ms);
    }
      

    public static void main(String args[]){
    {
        int numbers[] = {-1,-2,-3,-4};
        kadens(numbers);
    }
 }
}
