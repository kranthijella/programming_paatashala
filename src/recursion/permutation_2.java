package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class permutation_2 {
    public static void main(String args[]){
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        r.add(1);r.add(1);r.add(2);
        int index= 0;
        int a[] = new int[]{1,2,3};
        permutation1(l,r,index,a);
        HashSet<List<Integer>> hashSet = new HashSet<>(l);
        for(List<Integer> m : hashSet){
            for(Integer e : m){
                System.out.print(e);
            }
            System.out.println();
        }
    }
    public static void permutation1(List<List<Integer>> l, List<Integer> r,int index , int a[] ){
        if(index == a.length){
            l.add(new ArrayList<>(r));
            return;
        }
        for(int i = index;i<a.length;i++){
            Collections.swap(r,index,i);
            permutation1(l,r,index+1,a);
            Collections.swap(r,index,i);
        }
    }

}
