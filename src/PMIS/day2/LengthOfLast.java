package PMIS.day2;

public class LengthOfLast {
    public static void main(String[] args) {
        String s = " fly me to the moon ";
        char[] ch = s.toCharArray();
        int p = s.length()-1;
        int count =0;

        while(p>=0){
            if(ch[p]==' ' && count ==0){
                p--;
            }else if(ch[p]!=' '){
                count++;
                p--;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
