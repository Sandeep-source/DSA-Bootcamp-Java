```java
class Solution {
    //https://leetcode.com/problems/check-if-n-and-its-double-exist/
    public boolean checkIfExist(int[] arr) {
      HashSet<Integer> map=new HashSet<Integer>();
      for(int i=0;i<arr.length;i++){
          if(map.contains(arr[i]*2) ||
          ((arr[i]/2==arr[i]/2.0)&&map.contains(arr[i]/2))){
              return true;
          }
          map.add(arr[i]);
      }
      return false;
    }
}
```