package arrays;

import java.util.Scanner;

public class four_divisors {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int testcase = s.nextInt();
        for(int t = 0;t<testcase;t++){
            int length = s.nextInt();
            int a[]  = new int[length];
            for(int i = 0;i<a.length;i++){
                a[i] = s.nextInt();
            }
            int sum = 0;
            for(int e = 0;e<a.length;e++){
                int count  = 0;
                int value = (int)Math.sqrt(a[e]);
                if(value * value != a[e]){
                 for(int i = 1;i<Math.sqrt(a[e]);i++){
                     if(a[e] % i == 0){
                         count = count + 2;
                         sum = sum + (i+(a[e] / i));
                     }
                 }
                }
                if(count == 4){
                    System.out.println(sum);
                }

            }
        }
    }
}
