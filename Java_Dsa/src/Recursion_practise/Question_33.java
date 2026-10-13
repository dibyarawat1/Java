package Recursion_practise;
import java.util.*;
public class Question_33{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // count words in the string
        String s = sc.nextLine();
       System.out.println(count(s,1,0));
    }
    static int count(String s,int count,int i){
        if(i== s.length()){
            return count;
        }
        if(s.charAt(i) == ' '){
            count++;
        }
        return count(s,count,i+1);
    }
}