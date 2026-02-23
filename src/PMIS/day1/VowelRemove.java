package PMIS.day1;

public class VowelRemove {
    public static void main(String[] args) {
        //String str = "cat";
        String str = "compuuter";
        int n = str.length();
        char[] ch = str.toCharArray();
        for(int i=0;i<n;i++){
            if(isVowel(ch[i])){
                if(i+1<n && !isVowel((ch[i+1]))){
                    ch[i]='\u0000';
                }else if(i==n-1){
                    ch[i] ='\u0000';
                }else{
                    i+=1;
                }
            }
        }
        String res = "";
        for(char c : ch){
            if(c!='\u0000'){
                res += c;
            }
        }
        System.out.println(res);
    }
    private static boolean isVowel(char ch) {
        String vowel = "aeiouAEIOU";
        return vowel.contains(ch+"");
    }
}
