class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        int sum = 0 , ans = 0 , count = 1;

        for(int i = 0 ; i < n ; i++){
            count = 1 ; sum = 0;

            for(int j = i ; j < n ; j++){
                sum += arr[j];
                if(count % 2 != 0){
                    ans += sum;
                }

                count++;
            }
        }

        return ans;
        
    }
}