package lect6;

public class StringCommpression {
     public static void main(String[] args) {

    }
    public static void Compression(String s){
         char prev = s.charAt(0);
         int c = 1;
         for(int i = 1; i<s.length();i++){
             char ch = s.charAt(i);
             if(prev == ch){
                 c++;
             }else{
                 System.out.print(ch);
                 System.out.print(c);
                 prev = ch;
                 c=1;
             }
         }
    }
}
