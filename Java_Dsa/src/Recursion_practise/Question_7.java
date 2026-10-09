package Recursion_practise;
import java.util.*;
public class Question_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
        }else {
            System.out.println(prod(n, 1));
        }
    }
    static int prod(int n, int ans){
        if(n== 0){
            return ans;
        }
         return prod(n/10,ans*(n%10));
    }
}
