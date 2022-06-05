package arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
public class sieve {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
       // int test_case = s.nextInt();
        long[] primes = new long[1000000 + 1];
        for(int i = 0;i<1;i++){
            long number = 3;
            long ans = 0;

            for(int j = 1;j<primes.length;j++){
                primes[j] = 1;
            }
            primes[1] = 0;

            for(int k = 2;k<=number;k++){
                if(primes[k] == 1){
                    for(int l = k; (long) k *l <=number; l++ ){
                        primes[k*l] = 0;
                    }
                }
            }
            for(int m = 2;m<=number;m++){
                if(primes[m] == 1){
                    ans = ans + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
