package Recursion_practise;
import java.util.*;
public class Question_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[]arr = {5,9,6,7,5,67};
        System.out.println(check(arr,1));
    }
    static boolean check(int []arr, int i){
        if(i == arr.length){
            return true;
        }
        if(arr[i] < arr[i-1]){
            return false;
        }
        return check(arr,i+1);
    }
}
