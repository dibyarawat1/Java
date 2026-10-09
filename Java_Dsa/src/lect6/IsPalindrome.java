package lect6;

public class IsPalindrome {
    public static void main(String[]args){
        String s = "cnc";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){
        int  start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
