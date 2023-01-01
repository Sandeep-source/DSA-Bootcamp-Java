```java
class Solution {
    //https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/submissions/868167968/
    public int minCostToMoveChips(int[] position) {
        int evenPos=0;
        int oddPos=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                evenPos++;
            }else{
                oddPos++;
            }
        }
        return evenPos>oddPos?oddPos:evenPos;
    }
}
```