import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "QABKDBASKBASKDC";
        char[] arr = s.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char c : arr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("Repeated character is " + entry.getKey());
                break;
            }
        }
    }
}
