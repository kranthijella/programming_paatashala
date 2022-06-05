package arrays;
import java.util.Scanner;
public class starsky {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int start = s.nextInt();
        int view = s.nextInt();
        int brightnes = s.nextInt();
        int stars[][] = new int[start][3];

        for(int i = 0;i<stars.length;i++){
            for(int j = 0;j<stars[0].length;j++){
                stars[i][j] = s.nextInt();
            }
        }
        for(int i = 0;i<view;i++){
            long t = s.nextInt();
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int x2 = s.nextInt();
            int y2  = s.nextInt();
            long ans = 0;
            for(int k = 0;k<stars.length;k++){
                    if(stars[k][0] >= x1 && stars[k][0] <= x2
                       && stars[k][1] >= y1 && stars[k][1] <= y2){
                        ans = ans + ((stars[k][2] + t) % brightnes+1);
                    }
            }
            System.out.println(ans);
        }
    }
}
