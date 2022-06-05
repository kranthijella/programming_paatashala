package arrays;

import java.util.Scanner;

public class valid_paranthesis {
    public static void main(String args[]){
        int mod = 1000000007;
        Scanner s= new Scanner(System.in);
        int test_case  = s.nextInt();
        int a[] = new int[1001];
        a[0] = 1;
        a[1] = 1;
        long t = 0;
        for(int i = 2;i<1000;i++){
            for(int j = 0; j<i;j++){
                t = t +  ((long) a[j] % mod * a[i-1-j] % mod)%mod;
            }
            a[i] = (int) (t %mod);
        }

        for(int i  = 0;i<test_case;i++){
            int value =s.nextInt();
            if(value % 2  != 0){
                System.out.println("-1");
            }else{
                value = value/2;
                    System.out.println(a[value]);
            }
        }
    }
}
