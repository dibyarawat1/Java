package Recursion_practise;
import java.util.*;
public class Question_34{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // print all the idexes of the key
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        print(arr,key,0);
    }
    static void print(int[] arr, int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
         print(arr,key, i+1);
    }
}