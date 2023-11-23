import java.util.Arrays;

public class Merge2ArraysinOrder {
    public static void main(String[] args){
        int arr1[] = { 1, 10, 20, 40, 50 };
        int arr2[] = { 20, 3, 2, 12 };
        int n = arr1.length;
        int m = arr2.length;

        // Final merge list
        int res[]=new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n) {
            res[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            res[k] = arr2[j];
            j++;
            k++;
        }

        Arrays.sort(res);
        for(int c : res){
            System.out.println(c + " ");
        }
    }
}
