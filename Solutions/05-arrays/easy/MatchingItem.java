import java.util.List;
class Solution {
    //https://leetcode.com/problems/count-items-matching-a-rule
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int s=items.size();
        for(int i=0;i<s;i++){
            if(
                (ruleKey.equals("type")&&ruleValue.equals(items.get(i).get(0))) ||
                (ruleKey.equals("color")&&ruleValue.equals(items.get(i).get(1))) ||
                (ruleKey.equals("name")&&ruleValue.equals(items.get(i).get(2)))
            ){
                  count++;
            }
        }
        return count;
    }
}