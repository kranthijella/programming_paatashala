package hashing;

import java.util.Arrays;

public class largestConescutive {
    public static void main(String args[]){

        int a[] = new int[]{10,3,8,9,5,4,16,20,6,5,19};
        Arrays.sort(a);
        int b[] = new int[a.length];
        b[0] = a[0];
        int j = 1;
        for(int i = 1;i<a.length;i++){
            if(a[i] != b[j-1]){
                b[j] = a[i];
                j++;
            }
        }
        for(int i = 0;i<j;i++){
            System.out.print(b[i]+" ");
        }
        int count = 1;
        int maximum = Integer.MIN_VALUE;
        for(int i = 1;i<j;i++){
            if(b[i] == b[i-1]+1){
                count = count + 1;
            }
            else {
                count = 0;
            }
            maximum = Math.max(maximum,count);
        }
        System.out.println(maximum);
    }
}
