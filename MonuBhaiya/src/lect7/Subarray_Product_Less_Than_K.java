package lect7;

public class Subarray_Product_Less_Than_K {
    static void main() {
       int[] nums = {10,5,2,6};
       int k = 100;
    }
    static int Subarray_Product(int[]nums,int k){
        int ans = 0;
        int prod = 1;
       int start = 0;
       int end = 0;
       while(end < nums.length){
//           window grow
           prod *= nums[end];

//               shrink
               while(prod >= k && start<=end){
                   prod= prod/nums[start];
                   start++;
               }
               ans = ans+(end-start+1);
               end++;
       }
       return ans;
    }
}
