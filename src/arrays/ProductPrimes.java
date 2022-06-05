package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductPrimes {
    public static void main(String args[]){
        int mod = 1000000007;
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();

        for(int i = 0;i<testcases;i++){
            long ans = 1;
            long left = scanner.nextLong();
            long right = scanner.nextLong();
            List<Long> list = primes(left,right);
            int value = (int)(right - left);
            boolean isprime[] = new boolean[value+1];
            Arrays.fill(isprime,true);
            for(int k = 0;k<list.size();k++){
                long c = (int)Math.ceil( (left * 1.0/list.get(k)));
                for(long m = Math.max(2,c);list.get(k) * m <= right;m++){
                    isprime[(int) ((m * list.get(k)) - left)] = false;
                }
            }
            for(int e = 0;e<isprime.length;e++) {
                if (isprime[e]) {
                    ans = (ans % mod * (e + left) % mod ) % mod;
                }
            }
            System.out.println(ans);
        }
    }
    public static List<Long>  primes(long left ,long right){
        int sieve[] = new  int[(int)right+1];
        Arrays.fill(sieve,-1);
       // right = (long) Math.sqrt(right);
        List<Long> list = new ArrayList<Long>();
        for (int i = 2;i<=Math.sqrt(right);i++){
            if(sieve[i] == -1){
                for(int j = i;  j *i <= right; j++){
                    sieve[i*j] = 0;
                }
            }
        }
        for(long i = 2;i<=right;i++) {
            if (sieve[(int)i] == -1) {
                list.add(i);
            }
        }
        return list;

    }
}
