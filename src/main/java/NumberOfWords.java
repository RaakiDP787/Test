public class NumberOfWords {

    public static void main(String[] args){
        String str = "One two      three\n four\tfive";

        String[] str2 = str.split("\\s+");
        //StringBuilder newstr = new StringBuilder();
        System.out.println(str2.length);
    }
}
