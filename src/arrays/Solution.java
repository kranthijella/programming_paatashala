package arrays;
class Solution {
    static int dp[][];
    public static void main(String args[]){
        int mt[][] ={ {1,2,3},{4,5,6},{7,8,9}};
        int b[][] = (matrixBlockSum(mt,1));
        for(int i =0;i<b.length;i++){
            for(int j= 0;j<b[0].length;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[][] matrixBlockSum(int[][] mat, int k) {
        dp = new int[mat.length][mat[0].length];
        for(int i = 0;i<mat.length;i++){
            dp[i][0] = mat[i][0];
            for(int j = 1;j<mat[0].length;j++){
                dp[i][j] = dp[i][j-1] + mat[i][j];
            }
        }
        for(int i = 0;i<mat[0].length;i++){
            dp[i][0] = mat[i][0];
            for(int j = 1;j<mat.length;j++){
                dp[j][i] = dp[j-1][i] + dp[j][i];
            }
        }
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                int r1  = Math.max(0,i-k), c1= Math.max(0,j-k);
                int r2 = Math.min(mat.length-1,i+k),c2 = Math.min(mat[0].length-1,j+k);
                mat[i][j] = dp[r2][c2];
                if(c1-1>=0){
                    mat[i][j] = mat[i][j] - dp[r2][c1-1];
                }
                if(r1 - 1 >= 0){
                    mat[i][j] = mat[i][j] - dp[r1-1][c2];
                }
                if(r1-1 >=0 && c1-1 >= 0){

                    mat[i][j] = mat[i][j] +  dp[r1-1][c1-1];
                };

            }

        }
        return mat;
    }
}