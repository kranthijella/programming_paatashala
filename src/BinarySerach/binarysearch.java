package BinarySerach;

public class binarysearch {
    public static void main(String args[]){
        int arr[] = new int[]{2,2,2,2,2,3,4};
        int key = 4;
        int low = 0;
        int high = arr.length-1;
        int first_occur = 0;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key && mid != 0 && arr[mid-1] ==key){
                first_occur = mid-1;
            }
            if(arr[mid] ==key && mid != 0 &&arr[mid-1] !=key){
                first_occur = mid;
            }
            else{
                first_occur = mid;
            }
            if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high  = mid - 1;
            }
        }
        System.out.println(first_occur);
    }
}
