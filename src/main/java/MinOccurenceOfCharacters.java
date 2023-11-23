import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MinOccurenceOfCharacters {
    public static void main(String[] args){
        String s = "abdjenswbcjdbcbd";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        int minOccurence=Integer.MAX_VALUE;
        char ch = 'a';
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(minOccurence > entry.getValue()){
                minOccurence = entry.getValue();
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(minOccurence == entry.getValue()){
                System.out.println(entry.getKey());
            }
        }
    }
}
