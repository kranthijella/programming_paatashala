package BinarySerach;

public class findtheoccurance {
    public static void main(String args[]){
        int a[] = new int[]{4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        int key = 42;
        int low = 0;
        int high = a.length -1;
        int first_occur = 0;
        int last_occur = 0;
        while (low <= high){
           int mid = low + (high -low)/2;
           if(a[mid] < key){
               low = mid +1;
           }else  if (a[mid] > key){
               high = mid -1 ;
           }else {
               if(mid == 0){
                   first_occur = mid;
                   break;
               }else if( a[mid] != a[mid-1]){
                   first_occur = mid;
                   break;
               }else {
                   high = mid - 1;
               }
           }
        }
            low = 0;
        high = a.length-1;
        while (low <= high){
            int mid = low + (high -low)/2;
            if(a[mid] < key){
                low = mid +1;
            }else  if (a[mid] > key){
                high = mid -1 ;
            }else {
                if(mid == a.length-1){
                    last_occur = mid;
                    break;
                }else if( a[mid] != a[mid+1]){
                    last_occur = mid;
                    break;
                }else {
                    low = mid + 1;
                }
            }
        }

        System.out.println(first_occur);
        System.out.println(last_occur);
        System.out.println(last_occur-first_occur+1);
    }
}
