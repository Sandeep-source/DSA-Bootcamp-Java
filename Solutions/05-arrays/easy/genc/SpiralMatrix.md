```java
class Solution {
    //https://leetcode.com/problems/spiral-matrix
    public List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> ans = new ArrayList<>();
     int lb=0;
     int rb=matrix[0].length;
     int tb=0;
     int bb=matrix.length;
     while(lb<rb&&tb<bb){
         for(int i=lb;i<rb;i++){
             ans.add(matrix[lb][i]);
         }
         for(int i=tb+1;i<bb;i++){
             ans.add(matrix[i][rb-1]);
         }
         for(int i=rb-2;i>lb&&(bb-1)!=tb;i--){
             ans.add(matrix[bb-1][i]);
         }
         for(int i=bb-1;i>tb&&(rb-1!=lb);i--){
             ans.add(matrix[i][lb]);
         }
         lb++;
         rb--;
         bb--;
         tb++;
     }
     return ans;
    }
}
```