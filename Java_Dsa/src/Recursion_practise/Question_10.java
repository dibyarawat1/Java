package Recursion_practise;
import java.util.*;
public class Question_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       System.out.println(power(a,b,1));
    }
    static int power(int a , int b,int ans){
        if(b == 0){
            return ans;
        }

       return power(a,b-1,ans*a);

    }
}
