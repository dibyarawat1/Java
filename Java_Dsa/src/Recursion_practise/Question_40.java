package Recursion_practise;
import java.util.*;
public class Question_40{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Remove character x
        String s = sc.next();
        StringBuilder st = new StringBuilder();
        System.out.println(remove(s,0,st));
    }
    static String remove(String s, int i , StringBuilder st){
        if(i == s.length()){
            return st.toString();
        }
        if(s.charAt(i) != 'x'){
            st.append(s.charAt(i));
        }
        return remove(s, i + 1, st);
    }
}