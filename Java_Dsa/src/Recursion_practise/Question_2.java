package Recursion_practise;
import java.util.*;
public class Question_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = 5;
        print(5);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
