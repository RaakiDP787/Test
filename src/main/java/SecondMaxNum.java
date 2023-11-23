public class SecondMaxNum {
    public static void main(String[] args) {
        int[] numbers = {2,4,5,35,6,43,24,23};

        int max = 0;
        int second = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                second = max;
                max = numbers[i];
            }
        }

        System.out.println("Second largest number " + second);
    }
}
