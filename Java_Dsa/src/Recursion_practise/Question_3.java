package Recursion_practise;
import java.util.*;
public class Question_3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
//        sum of first natural numbers

        System.out.println(sum(5));
    }
    static int sum(int n){
       int ans = n;
        if(n== 0){
            return ans;
        }
         return ans + sum(n-1);

    }
}
