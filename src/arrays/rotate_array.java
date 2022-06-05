package arrays;

public class rotate_array {
    public static void main(String args[]){
        int a[] = {1,2,3,5,6,7,9};
        int k = 3;
        int[] temp = new int[a.length];
        for(int i = 0;i<temp.length;i++) {
            if (i + k >= 7) {
                temp[(i + k) % a.length] = a[i];
            } else {
                temp[i+k] = a[i];
            }
        }
        for(int value : temp){
            System.out.print(value);
        }
    }
}
