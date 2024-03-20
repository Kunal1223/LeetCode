class Solution {
    
    int solve(Map<Integer , Integer> mp , int n){

        if(n == 0 || n == 1){
            return 1;
        }
        
        if(!mp.containsKey(n)){
            mp.put(n , solve(mp , n-1) + solve(mp,n-2));
        }
        
        return mp.get(n);
    
    }
    
    
    public int climbStairs(int n) {
        
        Map<Integer , Integer> mp = new HashMap<>();
        
        return solve(mp , n);
        
    }
}