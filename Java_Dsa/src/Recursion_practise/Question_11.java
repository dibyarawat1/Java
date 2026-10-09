package Recursion_practise;
import java.util.*;
public class Question_11 {
    public static void main(String[] args){
//        maximum element in a array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
       System.out.println(maxi(1,arr[0],arr));
    }
    static int maxi(int i,int max,int[] arr){
        if(i == arr.length){
            return max;
        }
        max = Math.max(max,arr[i]);
        return maxi(i+1,max,arr);
    }
}
