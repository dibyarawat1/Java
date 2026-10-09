package lect13;

public class countVowel_UsingSubstringMethod {
    static void main() {
        String s = "codina";
        System.out.println(countVowel(s,0));
    }
    public static  int countVowel(String st ,int c){
        if(st.length()==0){
            return c;
        }
        char ch = st.charAt(0);
        if(ch =='i'|| ch=='o'||ch=='a'||ch=='e'||ch=='u'){
            c++;
        }
        return countVowel(st.substring(1),c);
    }
}
