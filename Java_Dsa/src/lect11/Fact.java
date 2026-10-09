package lect11;

public class Fact {
    static void main() {
        int  n = 5;
        System.out.println(Fac(n));
    }
    public static int Fac(int n){
        if(n ==0){
            return 1;
        }
        int f = Fac(n-1);//sp
        return f*n;//self work
    }
}
