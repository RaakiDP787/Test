public class MissingNumberInSeries {

    public static void main(String[] args){
        int n = 6;
        int[] arr = {1,4,3,5,2};

        int sum = (n * (n+1))/2;
        int actualsum = 0;

        for(int i:arr){
            actualsum += i;
        }

        int missingNum = sum - actualsum;

        System.out.println("Missing Number is " + sum + " " + actualsum + " " + missingNum);
    }
}
