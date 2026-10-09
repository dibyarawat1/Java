package Recursion_practise;
import java.util.*;
public class Question_4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//    factorial of n
    System.out.println(fact(n));
}
static int fact(int n){
        if(n == 0){
            return 1;
        }
       return n*fact(n-1);
}
}
