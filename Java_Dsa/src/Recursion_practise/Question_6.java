package Recursion_practise;
import java.util.*;
public class Question_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n,0));
    }
    static int count(int n,int ans){

        if(n == 0) {
            return ans;
        }

       return count(n/10,ans+1);

    }
}
