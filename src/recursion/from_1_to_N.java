package recursion;

import java.util.Scanner;

public class from_1_to_N {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        recursion(n);
    }
    public static void recursion(int n){
        if(n <= 0){
            return;
        }
        System.out.println(n);
        recursion(n-1);
    }

}
