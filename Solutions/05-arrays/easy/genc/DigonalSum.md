```java
package easy;

class Solution {
    //https://leetcode.com/problems/matrix-diagonal-sum
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        for(int i=0,j=mat.length-1;i<mat.length&&j>=0;i++,j--){
            sum+=mat[i][j];
        }
        if((mat.length&1)==1){
        int m=mat.length/2;
        sum-=mat[m][m];
        }
        return sum;
    }
}
```