//package Recursion_practise;
//import java.util.*;
//public class Question_28 {
   // public static void main(String[] args){
       // Scanner sc = new Scanner(System.in);
//        StringBuilder st = new StringBuilder();

//        int n = sc.nextInt();
//        System.out.println(Integer.parseInt(binary(n,st)));
//
//    }
//    static String binary(int n,StringBuilder st){
//        if(n == 0){
//            return st.reverse().toString();
//        }
//        if(n%2 == 0){
//            st.append("0");
//        }else{
//            st.append("1");
//        }
//        return binary(n/2,st);
       //}
//}

//        another method and this is the optimal one
        package Recursion_practise;
           import java.util.*;

        public class Question_28 {
            public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                // Handle 0 edge case
                if (n == 0) {
                    System.out.println(0);
                    return;
                }

                System.out.println(binary(n));
            }

            // Optimal mathematical recursion (not tail recursive, but much faster)
            static long binary(int n) {
                if (n == 0) {
                    return 0;
                }
                // Multiply recursive result by 10 to shift digits left, then add the current bit
                return (n % 2) + 10 * binary(n / 2);
            }
        }

