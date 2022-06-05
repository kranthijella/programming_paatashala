package arrays;
import java.util.*;
public class maximize_the_expression2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //long[] pr = new long[4];
       // for(int i = 0;i<4;i++){
         //   pr[i] = s.nextLong();
        //}
        long[] a = new long[4];
        for(int i = 0;i<a.length;i++){
            a[i] =  s.nextLong();
        }
     //   long p = pr[1],q = pr[2],r = pr[3];
        long[] pre = new long[a.length];
        pre[0] = a[0] ;
        long[] suf = new long[a.length];
        suf[a.length-1] = a[a.length-1];
        for(int i = 1;i<pre.length;i++){
            pre[i] = Math.min(pre[i-1],a[i]);
        }
        for(int i = a.length-2;i>=0;i--){
            suf[i] = Math.min(suf[i+1],a[i]);
        }
        long maximum = Long.MAX_VALUE;
        for(int i = 1;i<a.length-1;i++){
            maximum = Math.min(maximum,(
                    a[i]+ pre[i-1] + suf[i+1] ));
        }
        if(maximum <= 0){
            System.out.println(-1);
        }else{
            System.out.println(maximum);
        }
    }
}
