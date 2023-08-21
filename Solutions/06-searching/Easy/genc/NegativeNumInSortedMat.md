```java
class Solution {
    //https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
    public int countNegatives(int[][] grid) {
       int count=0;
       int row=0;
       int col=grid[0].length-1;
       while(row<grid.length&&col>=0){
          if(grid[row][col]<0&&col!=0){
              col--;
          }else{
              count+=(grid[0].length-col-1);
              if(grid[row][col]<0){
                  count++;
              }
              row++;
          }
       }
       return count;
    }
}
```