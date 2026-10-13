package Recursion_practise;
import java.util.*;
public class Question_30 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
    System.out.println(count(s,0,0));
    }
    static int count(String s,int count,int i){
        if(i == s.length()){
            return count;
        }

         count++;
        

      return count(s,count, i + 1);
    }
}
