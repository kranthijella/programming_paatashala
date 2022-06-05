package BACKTRACKING;

import java.util.Arrays;

public class n_queens2 {
    public static void main(String args[]){

        Solution_nqueen nqueen = new Solution_nqueen();
        System.out.println(nqueen.totalNQueens(4));
    }

}
class Solution_nqueen {
    int count= 0;
    int arr[][];
    public int totalNQueens(int n) {
        arr = new int[n][n];
        int row = 0;
        nqueens(row,n);
        return count;
    }

    public void nqueens(int r,int n){
        if(r == n){
            count   = count + 1;
            return ;
        }
        for(int c = 0; c < n; c++){
            if(isSafe(arr,r,c)){
                arr[r][c] = 1;
                nqueens(r+1,n);
                arr[r][c] = 0;
            }
        }
    }
    public boolean isSafe(int arr[][],int row,int column){
        int x = row - 1;
        while (x >=0){
            if(arr[x][column] ==1){
                return false;
            }
            x--;
        }
         int xx = row - 1;
        int y = column - 1;
        while (xx >= 0 && y >= 0){
            if(arr[xx][y] ==1){
                return false;
            }
            xx--;
            y--;
        }
        int xxx = row - 1;
        int yyy = column + 1;

        while (xxx >= 0 && yyy<=arr.length-1){
            if(arr[xxx][yyy] == 1){
                return false;
            }
            xxx--;
            yyy++;
        }
        return true;
    }

}