package BinarySerach;

public class findPeak {
    public static void main(String args[]){
        Solution2 s =new Solution2();
        System.out.println(s.findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
}
class Solution2 {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(mid == 0){
                if(nums[mid] > nums[mid+1]){
                    return mid;
                }else {
                    low = mid + 1;
                }
            }
            else if(mid == nums.length -1){
                if(nums[mid] > nums[mid-1]){
                    return mid;
                }else {
                    high = mid - 1;
                }
            }else {
                if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                    return mid;
                }else if(nums[mid] < nums[mid+1]) {
                    low  = mid + 1;
                }else {
                    high = mid -1;
                }
            }
        }
        return - 1;
    }
}