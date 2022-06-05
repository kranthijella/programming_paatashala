package BinarySerach;

import java.util.Scanner;

public class pairsumsorted {
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        int index = -1;
        int second = 0;
        for(int i = 0;i<n;i++) {
            int low = 0;
            int high = arr.length - 1;
            int key = target - arr[i];
            while (low <= high) {
                int mid = low + (high - low )/2;
                if(arr[mid] == key){
                     index = mid;
                    second = i;
                    break;
                }
                else if(arr[mid] > key){
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
        }
        System.out.print(index+1);
        System.out.println(second+1);
    }
}
