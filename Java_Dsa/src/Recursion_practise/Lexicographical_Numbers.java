package Recursion_practise;
import java.util.*;
public class Lexicographical_Numbers {
    public static void main(String[] args) {
        int n = 1000;
        List<Integer> ll = new ArrayList<>();
        Lexicographical(n, 0, ll);
        System.out.println(ll);
    }
    static void Lexicographical(int n , int curr , List<Integer> ll){
        if(curr > n){
            return;
        }
//        when you dont want to print 0 instead want to start from 1 as said in leetcode.
            if(curr != 0){
                ll.add(curr);
            }
//        ll.add(curr);
        int i = 0;
        if(curr == 0){
            i = 1;
        }
        for(; i<= 9; i++) {
            Lexicographical(n, curr*10 + i, ll);
        }
    }
}
