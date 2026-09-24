package lect11;

public class Fact_Tail {
    static void main() {
        int n = 5;

        System.out.print(Fact(n,1));
    }
    public static int Fact(int n,int ans){
        if(n==0){
            return ans;
        }
        return Fact(n-1,ans*n);
    }
}
