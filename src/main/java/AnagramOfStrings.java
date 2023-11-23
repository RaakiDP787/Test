import java.sql.SQLOutput;
import java.util.*;

public class AnagramOfStrings {
    public static void main(String[] args){
        String s1 = "SILENT";
        String s2 = "LISTEN";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(arr1==arr2){
            System.out.println("2 Strings are anagrams  " + arr1 + "" + arr2);
        }else{
            System.out.println("2 Strings are not anagrams");
        }
    }
}
