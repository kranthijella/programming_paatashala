package basic;/* package codechef; // don't place package name! */

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef_2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        for(int i = 0;i<b;i++){
            int[] arr = new int[100+1];
            int[] values = new int[3];
            for(int z = 0;z<3;z++){
                values[z] = s.nextInt();
            }
            int[] houses = new int[values[0]];
            for(int j =0 ;j<values[0];j++){
                houses[i] = s.nextInt();
            }
            int no_ofhouses = 0;
            int upper = 0;
            int lower  = 0;
            for(int k = 0;k<houses.length;k++){
                 upper = houses[k] + 7 * 8;
                 lower = houses[k] - 7 * 8;
                if(lower <= 1){
                    lower = 1;
                }
                if(upper >= 100){
                    upper = 100;
                }
                System.out.print(lower + " "+ upper+" ");
                for(int p = lower; p<=upper;p++){
                    if(arr[p] != 1) {
                        arr[p] = 1;
                    }
                }
            }
            for(int q = 1; q < arr.length;q++) {
                if (arr[q] != 1) {
                    no_ofhouses = no_ofhouses + 1;
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(no_ofhouses);
        }
    }
}
