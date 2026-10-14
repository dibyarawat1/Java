package Recursion_practise;
import java.util.*;
public class Question_41{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // sum of the alternate digits
      String s = sc.next();
      System.out.println(sum(s,0,0));
      

    }
    static int sum(String s,int i, int sum){
         if( i >= s.length()){
            return sum;
         }
        sum = sum + s.charAt(i)-'0';
         return sum(s,i+2,sum);
    }
}