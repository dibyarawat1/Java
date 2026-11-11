package Recursion_practise;
import java.util.*;
public class LetterCombinationOfaPhoneNumber {
    static String[] st = {"","","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = "23";
        print(str,"");


    }
    static void print(String s,String ans){

        if(s.length() == 0 ){
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(0);
        String press = st[ch-'0'];
        for(int i = 0 ; i< press.length(); i++) {

            print( s.substring(1), ans + press.charAt(i));
        }
    }
}
