package lect6;

public class substringPrint {
    public static void main() {
        String s = "Dibya";
        print(s);
    }
    static void print(String s){
        for(int i = 0 ; i< s.length(); i++){
            for(int j = i+1; j<= s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
