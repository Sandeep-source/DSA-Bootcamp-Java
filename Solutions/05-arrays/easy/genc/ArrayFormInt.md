```java
package easy;
import java.util.*;
class Solution {
    //https://leetcode.com/problems/add-to-array-form-of-integer
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry=0;
        ArrayList<Integer> list=new ArrayList<>(num.length+10);
        for(int i=num.length-1;i>=0;i--){
            int ans=k%10+carry+num[i];
            k/=10;
            carry=ans/10;
            list.add(0,ans%10);
        }
        while(k>0){
           int ans=k%10+carry;
            k/=10;
            carry=ans/10;
            list.add(0,ans%10);
        }
        if(carry>0)
        list.add(0,carry);
        return list;
    }
}
```