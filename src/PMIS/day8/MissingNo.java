package PMIS.day8;

public class MissingNo {
    public static void main(String[] args) {
        //int[] arr = {3,0,1};
        //int[] arr = {0,1};

        int[] arr = { 9,6,4,2,3,5,7,0,1};

        int n = arr.length;
        int[] freq = new int[n+1];

        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        for(int i=1;i<n+1;i++){
            if(freq[i]==0){
                System.out.println(i);
            }
        }


    }
}
