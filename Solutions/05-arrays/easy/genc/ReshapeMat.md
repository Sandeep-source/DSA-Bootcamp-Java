```java
class Solution {
    //https://leetcode.com/problems/reshape-the-matrix/submissions/866486699/
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans=new int[r][c];
        int ic=0;
        int ir=0;
        int ele_count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(ir>=r){
                    return mat;
                }
                ans[ir][ic]=mat[i][j];
                ic++;
                ele_count++;
                if(ic>=c){
                    ir++;
                    ic=0;
                }
            }
        }
        if(ele_count==(r*c))
        return ans;
        return mat;
    }
}
```