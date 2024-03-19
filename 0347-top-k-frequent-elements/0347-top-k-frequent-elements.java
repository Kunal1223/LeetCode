class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
       
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int n : nums){

            if(map.containsKey(n)){
                map.put(n , map.get(n)+1);
            }else{
                map.put(n , 1);
            }
        }
        
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a , b) -> map.get(b) - map.get(a));
        
        int res[] = new int[k];
        
        for(int i =0 ; i < k ; i++)
            res[i] = list.get(i);
            
            
        return res;
        
    }
}