```java
class Solution {
    //https://leetcode.com/problems/plus-one/submissions/867114686/
    public int[] plusOne(int[] digits) {
        int carry=1;
        int i=digits.length-1;
        while(carry!=0&&i>=0){
             int ans=digits[i]+carry;
             digits[i]=ans%10;
             carry=ans/10;
             i--;
        }
        if(carry==1){
            int[] ans=new int[digits.length+1];
            ans[0]=carry;
            for(i=0;i<digits.length;i++){
               ans[i+1]=digits[i];
            }
            return ans;
        }
        return digits;
    }
}
```