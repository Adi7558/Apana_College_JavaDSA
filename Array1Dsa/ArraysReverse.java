public class ArraysReverse {

    public static void Reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while(first<last) {
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }

        

    }
    public static void main(String args[]){
        int numbers[] ={2,4,5,6,8,7,10};

        Reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
