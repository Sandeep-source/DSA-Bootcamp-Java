import java.util.*;
class Solution {
    //
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int idx=0;
            for(int j=0;j<matrix[i].length;j++){
              if(matrix[i][j]<matrix[i][idx]){
                  idx=j;
              }
            }
            int rdx=0;
            for(int row=0;row<matrix.length;row++){
                 if(matrix[row][idx]>matrix[rdx][idx]){
                     rdx=row;
                 }
            }
            if(rdx==i)
            list.add(matrix[i][idx]);
        }
        return list;
    }
}