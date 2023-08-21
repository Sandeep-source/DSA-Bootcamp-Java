```java
class Solution {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=(s+e)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return e;
    }
}
```