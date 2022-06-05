package recursion;

import java.util.ArrayList;
import java.util.List;

public class subset {
    static int count = 0;
    public static void main(String args[]) {
            int nums[] = new int[]{1,2,3};
            List<List<Integer>> ll = new ArrayList<>();
            generate(nums, 0, new ArrayList<>(), ll);
            for(List<Integer> l : ll){
                for(int m : l) {
                    System.out.print(m);
                }
                System.out.println();
        }
            System.out.println(count);
    }
        public static void generate(int[] nums,int i,List<Integer> ls,List<List<Integer>> ll){
            if(i==nums.length){
                int sum = 0;
                ArrayList<Integer> n = new ArrayList<>(ls);
                for(int j = 0;j<n.size();j++){
                    sum = sum + n.get(j);
                }
                if(sum == 3){
                    count = count + 1;
                }
                ll.add(n);
                return;
            }
            generate(nums,i+1,ls,ll);
            ls.add(nums[i]);
            generate(nums,i+1,ls,ll);
            ls.remove(ls.size()-1);
        }
    }

