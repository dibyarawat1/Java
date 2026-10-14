package Recursion_practise;
import java.util.*;
public class Question_39{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(count(s,0,0));
    }
    static int count(String s,int i,int count){
        if(i == s.length()){
            return count;
        }
        char ch = s.charAt(i);
        if(ch != 'a' && ch != 'e'&& ch != 'i'&& ch != 'o' && ch != 'u'){
            count++;
        }
        return count(s,i+1,count);
    }
}