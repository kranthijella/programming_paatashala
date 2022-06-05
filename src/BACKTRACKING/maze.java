package BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class maze {
   static boolean visited[][];
    public static void main(String args[]){
        visited = new boolean[4][4];
        int[][] grid = {{1,0,0,0},{1,1,0,1},{0,1,0,0},{0,1,1,1}};
        List<String> characterList = new ArrayList<>();
        String string = "";
        mazes(grid,0,0,characterList,string," ");
        for(String s : characterList){
            System.out.println(s);
        }
    }
    public static void mazes(int[][] grid,int row,int col,List<String> characterList,String string,String current){
        if(grid[row][col] == 0){
            return;
        }
        if(row ==  3 && col == 3){
            string = string+current;
            characterList.add(string);
            return;
        }
        string = string + current;
        visited[row][col] = true;
           if( isSafe(grid,row+1,col)&&!visited[row+1][col]) {
               mazes(grid, row + 1, col, characterList, string, "D");
           }
           if(isSafe(grid,row-1,col) &&!visited[row-1][col]){
               mazes(grid, row - 1, col, characterList,string,"U");
           }
            if(isSafe(grid,row,col+1)&&!visited[row][col+1]){
                mazes(grid, row, col + 1, characterList,string,"R");
            }
            if(isSafe(grid,row,col-1) &&!visited[row][col-1]){
                    mazes(grid, row, col - 1, characterList,string,"L");
        }
        string = string.substring(0,string.length()-1);
        visited[row][col] = false;
    }
    public static boolean isSafe(int[][] grid,int row,int col){
        if(row >= grid.length || row < 0 || col < 0 || col >= grid[0].length ) {
            return false;
        }
        return true;
    }
}
