```java
class Solution {
    //https://leetcode.com/problems/excel-sheet-column-title/description/
    public int reachNumber(int target) {
        int sum=0;
        int step=0;
        target=Math.abs(target);
        while(sum<target){
            sum+=step;
            step++;
        }
        while((sum-target)%2!=0){
            sum+=step;
            step++;
        }
        return step-1;
    }
}
```