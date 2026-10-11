package Recursion_practise;
import java.util.*;
public class Question_29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String palindrome
        String s = sc.next();
        System.out.println(palindrome(s,0,s.length()-1));
    }
    static boolean palindrome(String s,int i,int j){
        if(i >= j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return palindrome(s,i+1,j-1);
    }
}
