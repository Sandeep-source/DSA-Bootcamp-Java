```java
package easy;
class Solution {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int d_c=0;
            int tem=nums[i];
            while(tem>0){
                d_c++;
                tem/=10;
            }
            if((d_c&1)!=1){
               count++;
            }
        }
        return count;
    }
}
```