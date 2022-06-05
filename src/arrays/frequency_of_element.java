package arrays;

public class frequency_of_element {
    public static void main(String args[]){
        int a[] = new int[]{3,3,3,2,2,5,2,4,2,5};
        int k = 3;
        int x = 2;
        int count = 0;
        for(int i = 0;i< k;i++) {
            if (a[i] == 2) {
                count = count + 1;
            }
        }
        System.out.println(count);
            for(int j = k;j<a.length;j++){
                if(a[j-k] == x){
                    count = count - 1;
                }
                if(a[j] == x){
                    count = count + 1;
                }
                System.out.println(count);
            }

        }
    }
