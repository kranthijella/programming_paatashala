package recursion;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static  void main(String args[]){
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        List<Integer> permut = new ArrayList<>();
        int a[] = new int[]{1,2,3};
        permutation(l,permut,a);
        for(List<Integer> m : l){
            for(Integer e : m){
                System.out.print(e);
            }
            System.out.println();
        }
    }

    public static void permutation(List<List<Integer>> l , List<Integer> permut,int a[]){
        if(permut.size() == 3){
            l.add(new ArrayList<>(permut));
            return;
        }else {
            for (int i = 0; i < a.length; i++) {
                if(permut.contains(a[i])){
                    continue;
                }
                permut.add(a[i]);
                permutation(l, permut , a);
                permut.remove(permut.size() - 1);
            }
        }
    }
}
