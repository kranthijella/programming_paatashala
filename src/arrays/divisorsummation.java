package arrays;

import java.util.Scanner;

public class divisorsummation {
    public static void main(String args[]){
        /* package codechef; // don't place package name! */
        /* Name of the class has to be "Main" only if the class is public. */
                // your code goes here
                Scanner s = new Scanner(System.in);
                int testcase = 1;
                int count = 0;
                long a[] = new long[1000];
                for(int i = 2;i <= 100;i++){
                    int sum = 0;
                    for(int j = 1;j*j <= i;j++){
                        if(i%j == 0){
                            if(j *j == i){
                                sum = sum + j;
                            }else{
                                sum = sum + j + i/j;
                            }
                        }
                    }
                    sum = sum - i;
                    a[i] = sum;
                }
                for(int i = 0;i<testcase;i++){
                    int b = 100;
                    System.out.println(a[b]);
                }
            }
        }