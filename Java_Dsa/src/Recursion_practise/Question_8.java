package Recursion_practise;
import java.util.*;
public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
    }
    static void reverse(int n){
        if(n==0){
            return;
        }
       System.out.print(n%10);
       reverse(n/10);


    }
}

