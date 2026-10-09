package Recursion_practise;
import java.util.*;
public class Question_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        int ans =  n%10;
        if(n==0){
            return ans;
        }

        return sum(n/10)+ans;
    }
}
