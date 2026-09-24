package lect13;

public class First_Occ {//tail recursion
    static void main() {
        int[] arr = {2,1,4,6,4};
        int item = 4;
        System.out.println(Index(arr,item,arr.length-1));
    }
    public static int Index(int[] arr ,int item,int i){
        if(arr[i] == item){
            return i;
        }
        if(i  <  0 ){
            return -1;
        }
        return Index(arr,item,i-1);
    }
}
