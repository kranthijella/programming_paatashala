package hashing;

import java.util.HashMap;

public class consecutive {
    public static void main(String args[]){
        int a[] = new int[]{4,5,6,6,7};
        System.out.println(consecutive(a));

    }
    public static boolean consecutive(int ar[]){

        int minimum = Integer.MAX_VALUE;
        HashMap<Integer,Integer> l = new HashMap<>();
        for(int i = 0;i< ar.length;i++){
            l.put(ar[i],0);
            minimum = Math.min(minimum,ar[i]);
        }
        for(int i = minimum;i<minimum+ar.length;i++){
            if(!l.containsKey(i)){
                return false;
            }
        }
        return true;
    }
}
