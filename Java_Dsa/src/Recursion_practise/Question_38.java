package Recursion_practise;
import java.util.*;
public class Question_38{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // largest digit
        int n = sc.nextInt();
        System.out.println(largest(n,Integer.MIN_VALUE));
    }
    static int largest(int n,int largi){
        if(n == 0){
            return largi;
        }
        if(largi < n%10){
            largi = n%10;
        }
        return largest(n/10,largi);
    }
}