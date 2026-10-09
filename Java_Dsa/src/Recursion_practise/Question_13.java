package Recursion_practise;
import java.util.*;
public class Question_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3};
        System.out.println(sum(1,arr[0],arr));
    }
    static int  sum(int i, int sami, int[]arr){
        if(i == arr.length){
            return sami;
        }
      sami = sami+arr[i];
        return sum(i+1,sami, arr);
    }
}
