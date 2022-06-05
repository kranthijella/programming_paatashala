package basic;

import java.util.Scanner;

public class primeornot {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int arr[] = new int[b];
        for(int i = 0;i<b;i++){
            arr[i]= s.nextInt();
        }
        int sum = 0;
        for(int i = 0;i<arr.length;i++) {
            int count = 0;
            while (b != 0) {
                count = count + 1;
                b = b / 10;
            }
            sum = sum + count;
        }
        if(isprime(sum)){
           System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
    static boolean  isprime(int sum){
        for(int i = 2;i<=sum/2;i++) {
            if (sum % i == 0) {
                return false;
            }
            }
        return true;
        }
    }
