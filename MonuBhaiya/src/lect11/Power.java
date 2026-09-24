package lect11;

public class Power {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(pow(a,b));
    }
    public static int pow(int a,int n){

        if(n == 0) {
            return 1;
        }
      int  prod = pow(a,n-1);
      return prod*a;
    }
}
