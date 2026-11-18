package Sorting;
import java.util.*;
public class Merge_two_sorted_array {
    public static void main(String[] args){
        int[] arr1 = {2,3,5,7};
        int[] arr2 = {1,3,5,8,9,11};
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];
        ans = Merge(arr1,arr2);
        for(int i = 0 ; i< ans.length; i++){
            System.out.print(ans[i]);
        }
    }
    static int[] Merge(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j =0;
        int k = 0;
        int[]ans = new int[n+m];
        while(i <n && j < m){
            if(arr1[i] < arr2[j]){
                ans[k++] = arr1[i++];
            }else{
                ans[k++] = arr2[j++];
            }
        }
        while(i < n){
            ans[k++] = arr1[i++];
        }
        while(j< m){
            ans[k++] = arr2[j++];
        }
        return ans;
    }
}
