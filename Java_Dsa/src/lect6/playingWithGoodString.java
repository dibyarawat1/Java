package lect6;
import java.util.*;
public class playingWithGoodString {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int ans = 0;
            int c = 0;
            for(int i = 0 ; i < s.length() ; i++  ){
                if( isVowel(s.charAt(i))){
                    c++;
                    ans = Math.max(ans,c);
                }else{
                    c = 0;
                }

            }
            System.out.println(ans);
        }
        static boolean isVowel(char ch){
            if(ch == 'a'|| ch == 'e'|| ch== 'i'||ch=='o'|| ch=='u'){
                return true;
            }
            return false;
        }
    }

