class Solution {
     //https://leetcode.com/problems/spiral-matrix-ii/
    public int[][] generateMatrix(int n) {
     int[][] ans=new int[n][n];
     int lb=0;
     int rb=n;
     int tb=0;
     int bb=n;
     int count=1;
     while(lb<rb&&tb<bb){
         for(int i=lb;i<rb;i++){
             ans[lb][i]=count++;
         }
         for(int i=tb+1;i<bb;i++){
             ans[i][rb-1]=count++;
         }
         for(int i=rb-2;i>lb&&(bb-1)!=tb;i--){
             ans[bb-1][i]=count++;
         }
         for(int i=bb-1;i>tb&&(rb-1!=lb);i--){
             ans[i][lb]=count++;
         }
         lb++;
         rb--;
         bb--;
         tb++;
     }
     return ans;
    }
}