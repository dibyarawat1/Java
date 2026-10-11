package Recursion_practise;
import java.util.*;
public class Question_26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        count zeroes in a number
        int n = sc.nextInt();
         if(n == 0){
             System.out.println("1");
         }else {
             System.out.println(count(n, 0));
         }
    }
   public static int count(int n,int count){
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        return count(n/10,count);
   }
}
