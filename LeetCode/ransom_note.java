// Ransom Note [Easy]
// https://leetcode.com/problems/ransom-note/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> count=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char c= magazine.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(int j=0;j<ransomNote.length();j++){
            char c=ransomNote.charAt(j);
            if(!count.containsKey(c)||count.get(c)==0){
                return false;
            }
        count.put(c, count.get(c) - 1);
        }
        return true;
    }
}