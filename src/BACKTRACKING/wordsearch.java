package BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class wordsearch {
    public static void main(String args[]){
        String word = "BA";
        char[][] board ={{'A','B'}};
        Solutions s = new Solutions();
        System.out.println(s.exist(board,word));

    }
}
class Solutions {
    List<String> l = new ArrayList<>();
    public boolean exist(char[][] board, String word) {
        String kranthi = "";
        //int row = 0,col = 0;
        for(int i= 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                words(board,word,kranthi,i,j,0);
            }
        }
         if(l.size() > 0) {
             if (l.get(0).equals(word)) {
                 return true;
             } else {
                 return false;
             }
         }else {
             return false;
         }
    }
    public void words(char [][] board, String word,String kranthi,int row,int col,int i ){
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length){
            return;
        }
        if(board[row][col] == '*'){
            return;
        }
        if(board[row][col] == word.charAt(i)){
            kranthi = kranthi + word.charAt(i);
            i++;
        }else{
            return;
        }
        if(kranthi.length() == word.length()){
            l.add(kranthi);
            return;
        }
        char old = board[row][col];
        board[row][col] = '*';
        words(board,word,kranthi,row+1,col,i);
        words(board,word,kranthi,row-1,col,i);
        words(board,word,kranthi,row,col+1,i);
        words(board,word,kranthi,row,col-1,i);
        board[row][col] = old;
    }
}
