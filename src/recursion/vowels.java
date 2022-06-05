package recursion;

import java.util.ArrayList;

public class vowels {

    public static void main(String args[]){
        ArrayList<String> result = new ArrayList<>();
        String current = "";
        char a[] = new char[]{'a','e','i','o','u'};
        vowels(2 , result,current,0,a) ;
        for(String kranthi : result){
            System.out.println(kranthi);
        }
        System.out.println(result.size());
    }
    public static void vowels(int n,ArrayList<String> result,String current , int index,char[] a ){
        if(current.length() == n){
            result.add(current);
            return;
        }
        for(int i = index;i<5;i++){
            current = current + a[i];
            vowels(n,result,current,i,a);
            current = current.substring(0,current.length()-1);
        }

    }
}
