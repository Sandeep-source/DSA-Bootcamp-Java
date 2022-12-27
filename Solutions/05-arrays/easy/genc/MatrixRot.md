```java
class Solution {
    //https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/submissions/866452468/
    public boolean findRotation(int[][] mat, int[][] target) {
        
       c: for(int i=0;i<4;i++){
            boolean T=true;
            for(int j=0;j<mat.length;j++){
                for(int k=j;k<mat[j].length;k++){
                    int temp=mat[j][k];
                    mat[j][k]=mat[k][j];
                    mat[k][j]=temp;
                }
            }
            for(int j=0;j<(mat.length/2);j++){
                int[] temp=mat[j];
                mat[j]=mat[mat.length-1-j];
                mat[mat.length-1-j]=temp;
            }
            for(int j=0;j<mat.length;j++){
                for(int k=0;k<mat[j].length;k++){
                   if(mat[j][k]!=target[j][k]){
                       continue c;

                   }
                }
            }

            return true;
        }
        return false;
    }
}
```