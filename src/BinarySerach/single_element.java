package BinarySerach;

import java.util.Scanner;

public class single_element {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int low= 0;
        int high = a.length -1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if(mid == 0){
                if(a[mid] != a[mid+1]){
                    System.out.println(a[mid]);
                    break;
                }
                else {
                    low = mid + 1;
                }
            }
            else if(mid == a.length-1){
                if(a[mid] != a[mid-1]){
                    System.out.println(a[mid]);
                    break;
                }else{
                    high = mid -1;
                }
            }
            else if(a[mid] != a[mid+1] && a[mid] != a[mid-1]){
                    System.out.println(a[mid]);
                    break;
                    }
            else {
                    int first = 0;
                    int second = 0;
                    if(a[mid] == a[mid+1]){
                        first = mid;
                        second = mid +1;
                    }else {
                        first = mid-1;
                        second = mid ;
                    }
                    if(first % 2 == 0){
                        low = mid + 1;
                    }else {
                        high = mid - 1;
                    }
                }
            }
        }

    }

