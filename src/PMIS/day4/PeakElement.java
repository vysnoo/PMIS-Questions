package PMIS.day4;

public class PeakElement {
    public static void main(String[] args) {

        int[] nums = {1,2,1,3,5,6,4};
        //int[] nums = {1,2,1,3,5,6,4};


        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]> nums[mid+1]){
                System.out.println(mid);
                return;
            }else if(nums[mid-1]<nums[mid] && nums[mid]< nums[mid+1]){
                s= mid+1;
            }else{
                e=mid-1;
            }
        }
        System.out.println(-1);
    }
}
