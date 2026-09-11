package lect7;

public class Maximum_sub_array_sum_window_size_k {
    public static void main(String[] args){
        int[] arr = {2,3,1,4,5,7,9,2,1,4};
        int k = 3;
        System.out.println(Maximum_SubArray_sum(arr,k));
    }
    public static int Maximum_SubArray_sum(int[] arr,int k){
        int ans = 0,sum = 0;
        for(int i =0 ;i< k; i++){
            sum += arr[i];
        }
        ans = sum;
        for(int i = k;i<arr.length;i++){
            sum += arr[i];//window grow
            sum -=arr[i-k];//window shrink
            ans  = Math.max(ans,sum);//ans calculate
        }
        return ans;
    }
}
