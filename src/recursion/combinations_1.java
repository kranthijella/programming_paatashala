package recursion;

import java.util.ArrayList;
import java.util.List;

public class combinations_1 {

    public static void main(String args[]){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();
        combinations(list,current,3,7,1);
        for(List<Integer> e : list){
            for (Integer m : e){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
    public static void combinations(List<List<Integer>> list , List<Integer> current , int k , int n , int index){
            if(n == 0 && current.size() == k){
                list.add(new ArrayList<>(current));
                return;
            }
            for(int i = index;i<=9;i++){
                current.add(i);
                combinations(list,current,k,n-i,i+1);
                current.remove(current.size()-1);
            }
    }
}

