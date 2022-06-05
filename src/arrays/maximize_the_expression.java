package arrays;

import java.util.Arrays;

public class maximize_the_expression {
    static int a[] = {50,2,30,4,8,9};
    static int p =1 , q = 2, r= 3;
    public static void main(String args[]){
        int maximum = 0;
        int pre[] = new int[a.length];
        pre[0] = a[0] * p;
        int suf[] = new int[a.length];
        suf[a.length-1] = a[a.length-1] * r;
        for(int i = 1;i<a.length;i++){
            pre[i] = Math.max(pre[i-1],a[i]*p);
        }
        for(int i = a.length-2;i>=0;i--){
            suf[i] = Math.max(suf[i+1],a[i]*r);
        }
        for(int i = 1;i<a.length-1;i++){
            maximum = Math.max(maximum,pre[i-1] + a[i] * q+ suf[i+1] );
        }
        System.out.println(maximum);

    }
}
