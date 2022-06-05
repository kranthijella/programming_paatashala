package arrays;
import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public static void main(String args[]){
        int matrix[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> l = spiralOrder(matrix);
        for(Integer e : l){
            System.out.println(e);
        }
    }
        public static List<Integer> spiralOrder(int[][] matrix) {
            int top = 0;
            int bottom = matrix.length-1;
            int left = 0;
            List<Integer> l = new ArrayList<Integer>();
            int right = matrix[0].length-1;
            int dir = 0;
            while(top <= bottom && left <= right){
                if(dir == 0){
                    for(int i = left ;i<=right;i++){
                        l.add(matrix[top][i]);
                    }
                    top++;
                }
                else if(dir == 1){
                    for(int i = top;i<=bottom;i++){
                        l.add(matrix[i][right]);
                    }
                    right--;
                }
                else if(dir == 2){
                    for(int i = right; i>=left;i--){
                        l.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                else{
                    for(int i = bottom ;i>=top;i--){
                        l.add(matrix[i][left]);
                        left++;
                    }

                }
                dir = (dir+1)%4;
            }
            return l;
        }
    }
