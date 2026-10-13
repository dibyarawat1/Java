package Recursion_practise;
import java.util.*;
public class Question_37{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // smallest digit
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("0");
        }else{
       System.out.println(smallest(n,Integer.MAX_VALUE));
        }
    }
    static int smallest(int n, int mini){
        if(n == 0){
            return mini;
        }
        if(mini > n%10){
            mini = n%10;
        }
        return smallest(n/10,mini);
    }
}