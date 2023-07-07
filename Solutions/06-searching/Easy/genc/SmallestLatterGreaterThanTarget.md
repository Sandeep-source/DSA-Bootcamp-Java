```java
class Solution {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/988242898/
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(letters[mid]<=target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        if(s<letters.length)
        return letters[s];
        return letters[0];
    }
}
```