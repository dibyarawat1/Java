package lect6;

public class validAnagram {
   public  static void main() {
         String str1 =  "anagram";
         String str2 = "nagaram";
         System.out.println(Anagram2(str1,str2));
    }
    public static boolean Anagram2(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
         int[]a = new int[26];
        int [] b = new int[26];

        for(int i = 0 ; i< s.length(); i++){
           int  indx = s.charAt(i)-'a';
            a[indx]++;
        }

        for(int i = 0 ; i< t.length(); i++){
            int  indx = s.charAt(i)-'a';
            b[indx]++;
        }
          for(int i = 0 ;i< 26; i++){
            if(b[i] != a[i]){
                return false;
            }
          }
          return true;
    }
}
