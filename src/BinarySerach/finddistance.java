package BinarySerach;

import java.util.Arrays;

public class finddistance {
    public static void main(String args[]) {
        Solution s = new Solution();
        int a[] = new int[]{1,4,2,3};
        int b[] = new int[]{-4,-3,6,10,20,30};
        int d = 3;
        System.out.println(s.findTheDistanceValue(a,b,d));
    }
}
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for(int i = 0;i<arr1.length;i++){
            int low = 0;
            int high = arr2.length-1;
            int flag = 0;
            while(low <= high){
                int mid = low + (high - low)/2;
                if((arr2[mid] <= arr1[i] + 2 && arr2[mid] >= arr1[i] - 2) ){
                    flag = 1;
                    break;
                }
                else if(arr2[mid] < arr1[i] - 2){
                    low  = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
            if(flag == 0){
                count = count + 1;
            }
        }
        return count;
    }
}