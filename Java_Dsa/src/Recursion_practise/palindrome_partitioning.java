package Recursion_practise;
import java.util.*;
public class palindrome_partitioning {
    public static void main(String[] args){
       String ques = "nitin";
       List<List<String>> ll=  new ArrayList<>();
       List<String> l  =  new ArrayList<>();
        Partition(ques,"", ll,l);
        System.out.println(ll);
    }
    static void Partition(String ques, String ans, List<List<String>> ll,  List<String> l ){
        if(ques.length() == 0){
           ll.add(new ArrayList(l));
            return;
        }
        for(int i = 1 ; i<=  ques.length(); i++){
            String s= ques.substring(0,i);
            if(isPalindrome(s)) {
                l.add(s);
                Partition(ques.substring(i), ans + s ,ll,l);
                l.remove(l.size()-1);
            }
        }
    }
    static  boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;

            }
            start++;
            end--;
        }
        return true;
    }
}
