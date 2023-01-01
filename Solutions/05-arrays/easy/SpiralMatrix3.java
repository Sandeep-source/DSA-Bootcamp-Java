class Solution {
    //https://leetcode.com/problems/spiral-matrix-iii/submissions/869124239/
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
     int[][] ans = new int[rows*cols][2];
     int count = 1;
     int maxD = rows>cols?rows:cols;
     int index=1;
     ans[0][0]=rStart;
     ans[0][1]=cStart;
     for(int i=1;i<maxD&&index<(rows*cols);i++){
          int l=cStart-i;
          int r=cStart+i;
          int t=rStart-i;
          int b=rStart+i;
          for(int j=rStart-i+1;j<=b&&index<(rows*cols);j++){
              if(j>=0&&j<rows&&r<cols&&r>=0){
                ans[index][0]=j;
                ans[index][1]=r;
                index++;
              }
          } 
          for(int j=r-1;j>=l&&index<(rows*cols);j--){
              if(b>=0&&b<rows&&j<cols&&j>=0){
                ans[index][0]=b;
                ans[index][1]=j;
                index++;
              }
          } 
          for(int j=b-1;j>=t&&index<(rows*cols);j--){
              if(j>=0&&j<rows&&l<cols&&l>=0){
                ans[index][0]=j;
                ans[index][1]=l;
                index++;
              }
          } 

          for(int j=l+1;j<=r&&index<(rows*cols);j++){
              if(t>=0&&t<rows&&j<cols&&j>=0){
                ans[index][0]=t;
                ans[index][1]=j;
                index++;
              }
          } 
          
     }    
     return ans;
    }
}public class SpiralMatrix3 {
    
}
