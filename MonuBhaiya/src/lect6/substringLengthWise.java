package lect6;

public class substringLengthWise {
    public static void main(String[] args){
        String s = "dibya";
        print(s);
    }
    static void print(String s){
        for(int i = 1 ; i<= s.length(); i++){
            for(int  j = i ; j<=s.length(); j++){
                int len = j-i;
                System.out.print(s.substring(len,j)+" ");
            }
            System.out.println();
        }
    }
}
