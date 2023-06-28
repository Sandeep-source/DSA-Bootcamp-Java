//https://leetcode.com/problems/set-matrix-zeroes/
class Solution {
    public void setZeroes(int[][] matrix) {
        int[] cols = new int[matrix[0].length];
        int[] rows = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            if(rows[i]==1){
                continue;
            }
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
        for(int i=0;i<rows.length;i++){
            if(rows[i]==1){
                for(int j=0;j<matrix[i].length;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<cols.length;i++){
            if(cols[i]==1){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            }
        }
    }
}