package Recursion_practise;
import java.util.*;
public class Question_42{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //   Check string contains only digits 
        String s = sc.next();
        System.out.println(digits(s,0));
    }
    static boolean digits(String s,int i){
        if( i == s.length()){
            return true;
        }
        char ch  = s.charAt(i);
        if(!(ch >='0' && ch <= '9')){
            return false;
        }
        return digits(s,i+1);
    }
}