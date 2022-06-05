package arrays;

public class sub_array {
    public static void main(String args[]){
        int a[] = new int[]{1,2,3,4};
        int totalsum = 0;
        for(int i = 0;i<a.length;i++){
            int sum = 0;
            for(int j = i;j<a.length;j++) {
                sum = sum + a[j];
                totalsum = totalsum + sum;
            }
        }
        System.out.println(totalsum);
    }
}
