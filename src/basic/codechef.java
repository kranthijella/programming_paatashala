package basic;

import java.util.*;
import java.lang.*;
import java.io.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here

            Scanner s = new Scanner(System.in);
            int test_cases = s.nextInt();
            int array[] = new int[test_cases];
            int p = 0;
            int noofstudents = s.nextInt();
            for(int i = 0;i<test_cases;i++){
                int[] timeend = new int[noofstudents];
                int[] timestart = new int[noofstudents];
                for(int k = 0;k<noofstudents;k++){
                    timeend[k] = s.nextInt();
                }
                for(int j = 0;j<noofstudents;j++){
                    timestart[j] = s.nextInt();
                }
                int noofstudentscooked = 0;
                for(int b= 0;b<timeend.length;b++){
                    if(b == 0){
                        if(timeend[b] >= timestart[b]){
                            noofstudentscooked =noofstudentscooked + 1;
                        }
                    }else{
                        int timeleft = timeend[b] - timeend[b-1];
                        if(timeleft > timestart[b]){
                            noofstudentscooked =noofstudentscooked + 1;
                        }
                    }
                }
                array[p++] = noofstudentscooked;

            }
            for(int n : array){
                System.out.print(n+" ");
            }
        }
    }


