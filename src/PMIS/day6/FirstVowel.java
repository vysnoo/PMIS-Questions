package PMIS.day6;

public class FirstVowel {
    public static void main(String[] args) {
        String s = "engineering";
        int[] freq = new int[128];
        int n = s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)]++;
        }

        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i)) && freq[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                return;
            }
        }

        System.out.println(-1);


    }

    public static boolean isVowel(char ch){
        return "AEIOUaeiou".contains(ch+"");
    }

}
