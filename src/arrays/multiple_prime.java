package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class multiple_prime {
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
            Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
            long ele = s.nextInt();
            while(spf[(int) ele] != -1){
                if(hashmap.containsKey((int)spf[(int)ele])){
                    int value = hashmap.get((int)spf[(int)ele]);
                    hashmap.put((int)spf[(int) ele],value+1);
                }
                else{
                    hashmap.put((int)spf[(int) ele],1);
                }
                ele =  (ele / spf[(int) ele]);
            }
            if(ele != 1){
                if(hashmap.containsKey((int)ele)){
                    int value = hashmap.get((int)ele);
                    hashmap.put((int) ele,value+1);
                }else{
                    hashmap.put((int) ele,1);
                }

            }
            for(Map.Entry<Integer,Integer> entry : hashmap.entrySet()){
                System.out.println(entry.getKey() + " "+ entry.getValue());
            }
        }
    }
}
