package Recursion_practise;
import java.util.*;
public class Question_36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // print arr in reverse order
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
    
        reverse(arr,(n-1));
    }
        static void reverse(int[] arr,int i){
            if(i < 0){
                return;
            }
            System.out.print(arr[i]);
             reverse(arr,i-1);
        
    }
}