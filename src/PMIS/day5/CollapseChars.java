package PMIS.day5;

public class CollapseChars {
    public static String findinglogsCompression(String str){
        StringBuilder result = new StringBuilder();

        int count = 1;
        for(int i = 1; i <= str.length(); i++){
            if(i < str.length() && str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                if(count >= 3){
                    result.append(str.charAt(i-1));
                }
                else{
                    for(int j = 0; j < count; j++){ //count < 3 means put loop for count at many char appended
                        result.append(str.charAt(i-1));
                    }
                }
                count = 1; //reset
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        //String str = "abbbbbbbbbbc";
        //String str = "aaabbbc";
        //String str = "abcccbbbaa";
        String str = "abcccccbba";

        System.out.println("The final output of logs compression is: " + findinglogsCompression(str));
    }
}
