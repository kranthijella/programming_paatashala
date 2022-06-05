package recursion;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation_three{
    public static void main(String args[]){
        kittu k = new kittu();
        System.out.println(k.getPermutation(3,3));

    }
}
class kittu {
    public String  getPermutation(int n, int k) {
        int freq[] = new int[n];
        Arrays.fill(freq,0);
        List<String> l = new ArrayList<String>();
        char a[] = new char[n];
        for(int i = 0;i<n;i++){
            a[i] = Character.forDigit(i+1,10);
        }
        permutation(l,n,freq,a,0);
        return l.get(k-1);
    }
    public void permutation(List<String> s,int n , int[] freq, char a[],int index){
        if(index == a.length){
            s.add(new String(a));
            return;
        }
        for(int i = index;i<a.length;i++){
                rightrotate(i,index,a);
                permutation(s,n,freq,a,index+1);
                leftrotate(i,index,a);
            }
    }

    public void rightrotate(int j , int i , char[] string){
        if( i == j){
            return;
        }
        char temp = string[j];
        for(int m = j-1; m>=i;m--){
            string[m+1] = string[m];
        }
        string[i] =  temp;

    }
    public void leftrotate(int j, int i , char[] string){
        if(i == j){
            return;
        }
        char temp = string[i];
        for(int m = i+1;m<=j;m++){
            string[m-1] = string[m];
        }
        string[j] = temp;

    }

}