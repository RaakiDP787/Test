import java.util.HashSet;

public class SumOfPairs {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 3, 9, -1, 11};
        HashSet<Integer> hash = new HashSet<>();
        int sum = 10;

        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];
            if (hash.contains(complement)) {
                System.out.println(arr[i] + " " + complement);
                break;
            }
            hash.add(arr[i]);
        }
    }
    }
