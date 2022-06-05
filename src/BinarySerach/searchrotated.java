package BinarySerach;

public class searchrotated {
    public static void main(String args[]){
        int a[] = new int[]{3,5};
        int target = 1;
        Solution1 solution = new Solution1();
        System.out.println(solution.search(a,5));
        System.out.println(solution.searchs(a,5));
    }
}
class Solution1 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int pivot = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] <= nums[nums.length-1]){
                high = mid - 1;
            }
            else {
                if(nums[mid] > nums[mid+1]){
                    pivot = mid;
                    break;
                }else{
                    low = mid + 1;
                }
            }
        }

        int index = -1;
        if(target > nums[nums.length-1]){
            low = 0;
            high = pivot;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(nums[mid] == target){
                    index =   mid;
                    break;
                }
                else if(nums[mid] > target){
                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }
        }
        else{
            low = pivot+1;
            high = nums.length-1;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(nums[mid] == target){
                    index =   mid;
                    break;
                }
                else if(nums[mid] > target){
                    high = mid - 1;
                }else{
                    low = mid +1 ;
                }
            }
        }
        return index;

    }
    public int searchs(int[] nums, int target) {

        int l = 0;
        int h = nums.length-1;


        while(l<=h){
            int mid = (l + h)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if( nums[mid] > target){
                h = mid -1;

            }else{
                l = mid +1;
            }
        }
        return -1;
    }

}
