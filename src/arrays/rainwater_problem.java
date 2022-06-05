package arrays;

public class rainwater_problem {
    public static void main(String[] args) {
        int a[] = {0,2,0};
        System.out.println(trap(a));
    }
        public static int trap(int[] height) {
            int prefix[] = new int[height.length];
            int suffix[] = new int[height.length];
            prefix[0] = height[0];
            suffix[height.length-1] = height[height.length-1];
            for(int i = 1;i<height.length;i++){
                prefix[i] = Math.max(prefix[i-1],height[i]);
            }
            for(int i = height.length-2;i>=0;i--){
                suffix[i] = Math.max(suffix[i+1],height[i]);
            }

            int sum = 0;
            for(int i = 1;i<height.length-1;i++){
                int height_on_left = prefix[i-1];
                int height_on_right = suffix[i+1];
                int water =  Math.min(height_on_left , height_on_right);
                if(water > height[i]){
                    sum = sum + water - height[i];
                }
            }
            return sum;
        }
    }


