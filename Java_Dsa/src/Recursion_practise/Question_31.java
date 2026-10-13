 package Recursion_practise;
import java.util.*;
public class Question_31{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Replace the character
        String s = sc.next();
        StringBuilder st = new StringBuilder();
        System.out.println(replace(s,st,0));
    }
    static String replace(String s,StringBuilder st, int i){
        if(i == s.length()){
            return st.toString();
        }
        if(s.charAt(i) == 'a'){
            st.append('o');
        }else{
            st.append(s.charAt(i));
        }
        return replace(s,st,i+1);
    }
}