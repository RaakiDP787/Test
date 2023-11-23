import java.util.HashMap;
import java.util.Map;

public class DistinctCharactersCount {

    public static void main(String[] args){
        String s = "BAHDTYCJCJDKKS";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.printf(entry.getKey() + "" + entry.getValue() + " ");
        }

    }
}
