class Solution {
    public int countPrimes(int n) {
        
        if(n <= 2)
            return 0;

        int []res = new int[n];
        Arrays.fill(res , 0);

        for(int i = 2 ; i*i < n ; i++){
            if(res[i] == 0){
                for(int j = i * i ;  j < n ; j+=i){
                    res[j] = 1;
                }
            }
        }

        int count  = 0;
        for(int i = 2 ; i < n ; i++){
            if(res[i] == 0)
                count++;
        }

        return count;
    }
}