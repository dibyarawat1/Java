package  lect7;
import java.util.*;
public class Kartik_BhaiyaAndString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();

        int flip_a = max_len(s, k, 'a');
        int flip_b = max_len(s, k, 'b');
        System.out.println(Math.max(flip_a, flip_b));

    }

    static int max_len(String s, int k, char ch) {
        int start = 0;
        int end = 0;
        int flip = 0;
        int ans = 0;
        while (end < s.length()) {
//            window grow
            if (s.charAt(end) == ch) {
                flip++;
            }
//            window shrink
            while (flip > k && start <= end) {
                if (s.charAt(start) == ch) {
                    flip--;
                }
                start++;
            }
//            ans calculate
            ans = Math.max(ans, (end - start + 1));
            end++;
        }
        return ans;
    }
}
