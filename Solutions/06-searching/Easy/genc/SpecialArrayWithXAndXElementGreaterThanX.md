```java
class Solution {
    //https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
    public int specialArray(int[] nums) {
        int s=0;
        int e=nums.length;
        while(s<=e){
            int mid=s+(e-s)/2;
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=mid){
                    count++;
                }
            }
            if(count==mid){
                return mid;
            }
            if(count<mid){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}
```