```java
package easy;

class Solution {
    //https://leetcode.com/problems/cells-with-odd-values-in-a-matrix
    public int oddCells(int m, int n, int[][] indices) {
       int[][] ans=new int[m][n];
       for(int i=0;i<indices.length;i++){
           for(int j=0;j<n;j++){
               ans[indices[i][0]][j]++;
           }
           for(int j=0;j<m;j++){
               ans[j][indices[i][1]]++;
           }
       } 
       int count=0;
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if((ans[i][j]&1)==1){
                   count++;
               }
           }
       }
       return count;
    }
}
```