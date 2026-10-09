package lect13;

public class count_vowel_in_string {
    static void main() {
        String s = "aodiuo";
        int sum = 0;
        System.out.println(countVowel(s,0,sum));

    }
    static int countVowel(String s,int i,int sum){

        if(i == s.length()){
            return sum;
        }
        if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='i'){
            sum++;
        }
        return countVowel(s,i+1,sum);
    }
}
