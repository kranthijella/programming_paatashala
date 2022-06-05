package arrays;

import java.util.Scanner;

public class flowers {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int numofelements = s.nextInt();
        int testcases = s.nextInt();
        int a[] = new int[numofelements];
        for(int i =0;i<a.length;i++){
            a[i] =s.nextInt();
        }
        int presum[] = new int[a.length];
        presum[0] = a[0];
        for (int i = 1; i < presum.length; i++) {
            presum[i] = presum[i - 1] + a[i];
        }
        int totalsum = 0;
        for (int i = 0; i < testcases; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            if (x == 1) {
                int z = presum[y - 1];
                if (z > 0) {
                    totalsum = totalsum + z;
                }
            }
            else  {
                int e = presum[y - 1] - presum[x - 2];
                if (e > 0) {
                    totalsum = totalsum + e;
                }
            }
        }
        System.out.println(totalsum);
    }
}
