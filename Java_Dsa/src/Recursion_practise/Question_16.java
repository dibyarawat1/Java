package Recursion_practise;
import java.util.*;
public class Question_16 {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
//        first occurence in an array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(firstOcc(arr,0,key));
    }
    static int firstOcc(int[] arr, int i, int key){
        if (i == arr.length) {
            return i;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr,i+1,key);
    }
}
