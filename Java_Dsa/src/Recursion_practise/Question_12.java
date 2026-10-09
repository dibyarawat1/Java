package Recursion_practise;
import java.util.*;
public class Question_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,5,3};
        System.out.println(mini(1,arr[0],arr));
    }
    static int mini(int i, int min,int[] arr){
        if(i == arr.length){
            return min;
        }
        min = Math.min(min,arr[i]);
        return mini(i+1,min,arr);
    }
}
