public class SwappingString {

    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "mnq";

        int length1 = s1.length();
        int length2 = s2.length();

        s1 = s1+s2;
        // System.out.println(s1);

        s2 = s1.substring(0,length1);
        s1 = s1.substring(length1,s1.length());
        System.out.println("Swapped strings are " + s1 + " " + s2);
    }
}
