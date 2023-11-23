import java.util.*;

public class ArrangeOddAndEven {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] newarr = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int i = left;
        int j = right;
        while (left<right){
            if(arr[left]%2 == 0){
                newarr[i++] = arr[left];
            }else{
                newarr[j--] = arr[left];
            }

            if(arr[right]%2 == 0){
                newarr[i++] = arr[right];
            }else{
                newarr[j--] = arr[right];
            }
            right--;
            left++;
        }

        for(int n : newarr){
            System.out.println(n + " ");
        }
    }
}
