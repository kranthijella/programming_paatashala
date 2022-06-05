package arrays;

import java.util.Scanner;

public class Tprime {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        long count = 0;
        long a[] = new long[100000+1];
        for(int i = 1;i<=100000;i++) {
            long sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                for (int j = 1; j <= sqrt; j++) {
                    if (i % j == 0) {
                        if ((long) j * j == i) {
                            count = count + 1;
                        }
                    }
                }
            }
            a[i] = (int)count + 2;
        }
        int ans = 0;
        for(int i = 0;i<number;i++){
            long value = s.nextLong();
            if(a[(int)value] == 3){
                    ans = ans + 1;
            }
        }
        System.out.println(ans);
    }
}
