```java
class Solution {
    //https://leetcode.com/problems/richest-customer-wealth
    public int maximumWealth(int[][] accounts) {
        int max=-99999;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(max<sum){
                max=sum;
            }
            
        }
        return max;
    }
}
```