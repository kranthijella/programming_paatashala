package basic;

import java.util.Scanner;

public class heavy_weight {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int w1 = s.nextInt();
        int w2 = s.nextInt();
        int count = 0;
        while(w1 < w2){
            w1 = w1 * 3;
            w2 = w2 * 2;
            count = count + 1;
        }
        System.out.println(count);
    }
}
