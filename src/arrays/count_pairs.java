package arrays;

public class count_pairs {

    public static void main(String args[]){

        int k = 7;
        int arr[] = new int[]{4 ,5 ,6 ,5, 9 ,4, 3};
        int count[] = new int[k];
        for(int i = 0;i<arr.length;i++){
            count[arr[i] % k]++;
        }
        long ans = 0;
        ans = (count[0] * (count[0]-1))/2;
        for(int i = 1;i<k/2;i++) {
            ans = ans + count[i] * count[k - i];
        }
            if( k % 2 == 0){
                ans = ans + (count[k/2] * (count[k/2]-1))/2;
            }else{
                ans = ans + count[k/2] * count[k/2 + 1];
            }

        System.out.println( ans);

    }
}
