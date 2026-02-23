package PMIS.day7;

public class ClosestMultiple {
    public static void main(String[] args) {
        //int n =13,m=4;
        int n =15,m=6;
        int start = 0;
        int end = 0;
        for(int i=1;;i++){
            if(i*m==n){
                System.out.println(0);
                return;
            }
            if(i*m>n){
                end = i*m;
                break;
            }else{
                start = i*m;
            }
        }
        int closest = Math.abs(start-n)<Math.abs(end-n)? start : end;
        System.out.println(closest);

    }
}
