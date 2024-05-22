class Solution {
    public int SolveByDynamic(int n, HashMap<Integer, Integer> memo) {
        if (n == 1) return 0;

        if (memo.containsKey(n)) return memo.get(n); 

        int result;
        if (n % 2 == 0) {
            result = 1 + SolveByDynamic(n / 2, memo);
        } else {
            int inc = 1 + SolveByDynamic(n + 1, memo);
            int dec = 1 + SolveByDynamic(n - 1, memo);

            result = Math.min(inc, dec);
        }

        memo.put(n, result); 
        return result; 
    }

    public int integerReplacement(int n) {
        if(n >= Integer.MAX_VALUE) return 32;
        HashMap<Integer, Integer> memo = new HashMap<>(); 
        return SolveByDynamic(n, memo); 
    }
}