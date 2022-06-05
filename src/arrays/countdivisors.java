package arrays;

import java.util.*;

public class countdivisors {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int test_case = s.nextInt();
        long[] primes = new long[1000001];
        long[] spf = new long[1000001];
        for(int i = 1;i<1000001;i++){
            primes[i] = 1;
            spf[i] = -1;
        }
        primes[1] = 0;
        for(int i = 2;i*i <= 1000000;i++){
            if(primes[i] == 1) {
                for (int j = i; i * j <= 1000000; j++) {
                    if (primes[i * j] == 1) {
                        primes[i * j] = 0;
                        spf[i * j] = i;
                    }
                }
            }
        }
        for(int i = 0;i<test_case;i++){
           int length = s.nextInt();
           int a[] = new int[length];
           for(int l = 0;l<length;l++){
               a[l] = s.nextInt();
           }

           for(int m = 0;m<a.length;m++){
               Set<Integer> set = new LinkedHashSet<>();
               while(spf[a[m]] != -1){
                   set.add((int) spf[a[m]]);
                   a[m] = (int) (a[m]/spf[a[m]]);
               }
               if(a[m] != -1){
                   set.add((int) a[m]);
               }
               System.out.println(set.size());
           }
        }
    }
}
