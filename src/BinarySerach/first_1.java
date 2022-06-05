package BinarySerach;
import java.util.Scanner;
public class first_1 {
    public static void main(String args[]){
        int test_case;
        Scanner s = new Scanner(System.in);
        test_case = s.nextInt();
        int a[] = new int[test_case];
        for(int i = 0;i<test_case;i++){
            a[i] = s.nextInt();
        }
        int low = 0;
        int high = a.length-1;
        int index = -1;
        while (low <=high){
            int mid = low + (high - low)/2;
            if(a[mid] < 1){
                low = mid + 1;
            }else if( a[mid] > 1){
                high = mid - 1;
            }
            else {
                if(mid == 0){
                    index = mid;
                    break;
                }else if(a[mid] != a[mid-1]) {
                    index = mid;
                    break;
                }else{
                    high =  mid -1;
                }
            }
        }
        System.out.println(index);
    }
}
