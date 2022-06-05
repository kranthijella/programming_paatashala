package BACKTRACKING;

public class uniquepaths {
    public static void main(String args[]){
        Solution s = new Solution();
        int grid[][] = new int[4][4];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                //grid[i][j] =
            }
        }
        s.uniquepath(grid);
    }
}
class Solution{
    boolean[][] visited;
    public int uniquepath(int[][] grid){
        visited = new boolean[grid.length][grid[0].length];
        int row = 0,col=0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        return uniquepath(grid,row,col);
    }
    public int uniquepath(int[][] grid, int row, int col){
        if(grid[row][col] == 2){
            return 1;
        }
        visited[row][col] = true;
        int sum = 0;
        if(isSafe(grid,row+1,col) && !visited[row+1][col]){
            sum = sum + uniquepath(grid,row+1,col);
        }
        if(isSafe(grid,row,col-1) && !visited[row][col-1]){
            sum = sum + uniquepath(grid,row,col-1);
        } if(isSafe(grid,row,col+1) && !visited[row][col+1]){
            sum = sum + uniquepath(grid,row,col+1);
        } if(isSafe(grid,row-1,col) && !visited[row-1][col]){
            sum = sum + uniquepath(grid,row-1,col);
        }
        return sum;
    }
    public boolean isSafe(int[][] grid,int i , int j){
        if(i > grid.length-1 || i< 0 || j > grid[0].length-1 || j < 0){
            return false;
        }
        return grid[i][j] != -1;
    }
}
