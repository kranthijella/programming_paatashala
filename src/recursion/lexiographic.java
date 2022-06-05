package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lexiographic {
    public static  void main(String args[]){
        int a[] = new int[]{1,2,3,4};
        List<List<Integer>> l = new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();
        recursion(a,l,m , -1 ,a.length);
       // System.out.println(l.size());
        for(List<Integer> e : l){
            for(Integer d : e){
                System.out.print(d);
            }
            System.out.println();
        }
    }
    public static void recursion(int[] a, List<List<Integer>> l , List<Integer> m , int index, int n){
        if(index == a.length){
            return;
        }
        l.add(new ArrayList<>(m));
        for(int i = index+1;i<n;i++){
            m.add(a[i]);
            recursion(a,l,m,i,n);
            m.remove(m.size()-1);
        }
    }
}
