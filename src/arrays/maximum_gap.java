package arrays;
import java.util.Arrays;
import java.lang.Math;
public class maximum_gap {
    public static void main(String args[]){
        System.out.println(maximumGap(new int[]{3,6,9,1}));
    }
    public static int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int gap = (max- min)/(nums.length-1);
        if ((max - min) % (nums.length-1) != 0) {
            gap++;
        }
        int maximum[] = new int[nums.length];
        int minimum[] = new int[nums.length];
        Arrays.fill(maximum, Integer.MIN_VALUE);
        Arrays.fill(minimum, Integer.MAX_VALUE);
        for (int i = 0; i < nums.length; i++) {
            int bucket = (nums[i] - min) / gap;
            if (maximum[bucket] < nums[i]) {
                maximum[bucket] = nums[i];
            }
            if (minimum[bucket] > nums[i]) {
                minimum[bucket] = nums[i];
            }
        }
        if(gap == 1){
            return Math.abs(maximum[0] - minimum[0]);
        }
        int ans = Integer.MIN_VALUE;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            if (minimum[i] == Integer.MAX_VALUE) {
                continue;
            }
            if (prev == Integer.MIN_VALUE) {
                prev = maximum[i];
            } else {
                ans = Math.max(ans, Math.abs(minimum[i] - prev));
                prev = maximum[i];
            }
        }
        return ans;
    }
}