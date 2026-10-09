package lect6;
import java.util.Map;
import java.util.HashMap;
public class IsomorphicStrings {
    public static void main(String[]args){
        String s = "f11";
        String t = "b23";
        System.out.println(isIsomorphic(s,t));
    }
    static boolean isIsomorphic(String s,String t){
        Map<Character,Character> map = new HashMap<>();
        if(s.length()!= t.length()){
            return false;
        }
        for(int i = 0 ; i< s.length() ; i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(!map.containsKey(a)){
                if(!map.containsValue(b)){
                    map.put(a,b);
                }else{
                    return false;
                }
            }else{
                char ch = map.get(a);
                if(ch != b){
                    return false;
                }
            }
        }
        return true;
    }
}
