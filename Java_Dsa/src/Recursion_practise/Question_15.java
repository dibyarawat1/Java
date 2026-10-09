package Recursion_practise;
import java.util.*;
public class Question_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
// count element occurences
        int[] arr = {1,2,2,3};
        int key = 2;
        System.out.println(count(arr,0,key,0));
    }
    static int count(int[] arr, int i, int key,int count){
        if(i == arr.length){
            return count;
        }
        if(key == arr[i]){
            count++;
        }
        return count(arr,i+1,key,count);
    }
}
