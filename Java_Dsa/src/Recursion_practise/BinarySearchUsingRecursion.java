package Recursion_practise;
import java.util.*;
public class BinarySearchUsingRecursion {
    public static void main(String[] args){
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
       System.out.println( rec(arr,target,0,arr.length-1));
    }
    static int  rec(int[] arr, int target,int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            end = mid-1;

        }
        else{
            start = mid+1;
        }
         return rec(arr,target, start, end);
    }
}
