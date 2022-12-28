```java
public abstract class RemoveDubFromSortedArray {
    class Solution {
        //https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/867126938/
        public int removeDuplicates(int[] nums) {
            int cur=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[cur]){
                    continue;
                }else{
                    nums[++cur]=nums[i];
                }
            }
            return cur+1;
        }
    }
}

```