```java
package easy;
class Solution {
    //https://leetcode.com/problems/check-if-the-sentence-is-pangram
    public boolean checkIfPangram(String sentence) {
     int[] chars=new int[26];
     int l=sentence.length();
     for(int i=0;i<l;i++){
         char ch=sentence.charAt(i);
         chars[ch-97]=1;
     }   
     for(int i=0;i<26;i++){
         if(chars[i]==0) return false;
     }
     return true;
    }
}
```