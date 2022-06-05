package arrays;

import java.util.Scanner;

public class Teammebers {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a[][] = new int[61][61];
        a[0][0] = 1;
        for(int i = 1;i<61;i++){
            for(int j = 0;j<=i;j++){
                if(j == 0 || j == i){
                    a[i][j] = 1;
                }
                else{
                    a[i][j] = a[i-1][j] + a[i-1][j-1];
                }
            }
        }
        int testcase = s.nextInt();
        for(int i = 0;i<testcase;i++){
            int n = s.nextInt();
            int m = s.nextInt();
            int x = s.nextInt();
            long ans = a[n+m][x];

            if(x<=m){
                ans = ans - a[m][x];
            }
            if(x-1 <= m){
                ans = ans - n * a[m][x-1];
            }
            if(x-2 <= m){
                ans = ans - a[n][2] * a[m][x-2];
            }
            if(x -3 <=m){
                ans = ans - a[n][3] * a[m][x-3];
            }
            if(x<=n){
                ans = ans - a[n][x];
            }

            System.out.println(ans);

        }
    }
}
