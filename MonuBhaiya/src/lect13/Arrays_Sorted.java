package lect13;

public class Arrays_Sorted {
    static void main() {
        int[] arr = {2,3,4,5,6,7,8};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int[] arr,int i){
        if(arr[i] > arr[i+1]){
            return false;
        }
        if(i == arr.length-2 ){
            return true;
        }
        return isSorted(arr,i+1);
    }
}
