// class Solution {
//     public int firstUniqChar(String s) {
        
//         Map<Character, Integer> map = new HashMap<>();

//         for (char c : s.toCharArray()) {
//           map.put(c , map.getOrDefault(c , -1)+1);
//         }
        
//         for(int i = 0 ; i < s.length() ; i++){
            
//             if(map.get(s.charAt(i)) == 0)
//                 return i;
        
//         }
        
//         return -1;
        
//     }
// }


//################## Solve usign Queue ############################################
class Solution {
    public int firstUniqChar(String s) {
        Map<Character , Integer> map = new HashMap<>();
        Queue<Integer> qu = new LinkedList<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            map.put(c , map.getOrDefault(c , 0)+1);
            qu.add(i);
        }

        while(!qu.isEmpty()){
            int ans = qu.peek();
            if(map.get(s.charAt(qu.poll())) == 1){
                return ans;
            }
        }
        return -1;
    }
}