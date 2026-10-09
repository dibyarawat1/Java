package lect6;
import java.util.*;
public class Freq_Array {
    public static void main(String[] args){
        String str = "dibyarawat";
        Maximum_Freq(str);
    }
    public static void Maximum_Freq(String s){
        int[] freq = new int[26];
        for(int i = 0 ; i< s.length() ; i++){
            int indx = s.charAt(i)-'a';
            freq[indx]++;
        }
        int maxi = 0;
        for(int i = 1 ;i< freq.length; i++){
            if(freq[i] > freq[maxi]){
                maxi = i;
            }
        }
        System.out.println(freq[maxi]) ;
        // this will give the maximum freq which is coming in the string
        System.out.println((char)('a'+maxi));
    }
}
