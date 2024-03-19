class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
          if (map.containsKey(c)) {
             map.put(c, map.get(c) + 1);
          } else {
             map.put(c, 0);
            }
        }

        
        
        for(int i = 0 ; i < s.length() ; i++){
            
            if(map.get(s.charAt(i)) == 0)
                return i;
        
        }
        
        return -1;
        
    }
}