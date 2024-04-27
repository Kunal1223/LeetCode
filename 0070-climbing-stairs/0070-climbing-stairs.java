// ############### Solve By Using HashMap ######################################

// class Solution {
    
//     int solve(Map<Integer , Integer> mp , int n){

//         if(n == 0 || n == 1){
//             return 1;
//         }
        
//         if(!mp.containsKey(n)){
//             mp.put(n , solve(mp , n-1) + solve(mp,n-2));
//         }
        
//         return mp.get(n);
    
//     }
    
    
//     public int climbStairs(int n) {
        
//         Map<Integer , Integer> mp = new HashMap<>();
        
//         return solve(mp , n);
        
//     }
// }


// ################  Solve By Using Dynamic Programing #################

class Solution {

    public int SolveByDynamic(int dp[] , int n){
        if(n == 1 || n == 0) return 1;

        if(dp[n] != -1)
            return dp[n];

        return dp[n] = SolveByDynamic(dp , n-1) + SolveByDynamic(dp , n-2);
    }

    public int climbStairs(int n) {
        if(n == 1 || n == 0 ) return 1;

        int dp[] = new int [n+1];
        Arrays.fill(dp , -1);

        return SolveByDynamic(dp , n);
        
    }
}