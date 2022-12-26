```java
package easy;

class Solution {
    //https://leetcode.com/problems/find-the-highest-altitude
    public int largestAltitude(int[] gain) {
        int current=0;
        int max=0;
        for(int i=1;i<=gain.length;i++){
              current=current+gain[i-1];
              if(current>max) max=current;
        }
        return max;
    }
}
```