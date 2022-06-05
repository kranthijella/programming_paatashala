package BinarySerach;

import java.util.Scanner;

public class only_repeating_element {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = s.nextInt();
        }

        int low= 0;
        int high = a.length -1;

        while ( low <= high){
            int mid= low + (high - low)/2;
            if(a[mid] == mid){
                high = mid - 1;
            }else {
                if(a[mid] == a[mid+1]){
                    System.out.println(a[mid]);
                    break;
                }else {
                    low = mid +1;
                }
            }
        }
    }
}
