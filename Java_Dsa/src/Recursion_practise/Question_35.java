package Recursion_practise;
import java.util.*;
public class Question_35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // check strictly increasing 
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=  0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
         System.out.println(incr(arr,1));
    }
    static  boolean incr(int[] arr,int i){
        if(i == arr.length){
            return true;
        }
        if(arr[i-1] >= arr[i]){
            return false;
        }
       return incr(arr,i+1);
    }
}