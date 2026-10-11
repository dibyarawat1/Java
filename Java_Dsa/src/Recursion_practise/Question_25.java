package Recursion_practise;
import java.util.*;
public class Question_25 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
//        remove zeroes from the number
        StringBuilder st = new StringBuilder();
        int n = sc.nextInt();
        System.out.println(Integer.parseInt(remove(n,st)));
    }
    public static String  remove(int n,StringBuilder st){
        if(n== 0){
            return (st.reverse()).toString();
        }
        if(n%10 != 0){
            st.append(n%10);
        }
          return remove(n/10,st);
    }
}
