package Recursion_practise;
import java.util.*;
public class Question_1 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = 5;
//       print all the number from 1 to n
       print(5);
   }
   static void print(int n){
       if(n == 0){
           return;
       }
       print(n-1);
       System.out.println(n);

    }
}
