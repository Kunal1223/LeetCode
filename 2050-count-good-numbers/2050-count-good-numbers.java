class Solution {

    public long myPow(long x, long n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            long a = myPow(x, n / 2);
            return (a * a) % 1000000007;
        }

        return (x * myPow(x, n - 1)) % 1000000007;
    }

    public int countGoodNumbers(long n) {
        long odd  , even , ans = 1;
        long mod = 1000000007;
        odd = n/2;
        even = n/2 + n%2;

        long primev = 4 , evenv = 5;

        ans = (ans * myPow(4 , odd) % mod ) % mod;
        ans = (ans * myPow(5 , even) % mod ) % mod;

        return (int) ans;

    }
}










//#################### got TLE in this approch ##############################
// public int countGoodNumbers(long n) {
//         int even = 5 , prime = 4 , mod = 1000000007;
//         long ans = 1;
//         int count = 0;

//         if(n == 0) return prime;
//         if(n == 1) return even;

//         for(int i = 0 ; i < n ; i++){
            
//             if(count % 2 == 0){
//                 ans = (ans * even) % mod;
//             }else{
//                 ans = (ans * prime) % mod;
//             }

//             count++;
//         }

//         return (int)ans;
        
//     }