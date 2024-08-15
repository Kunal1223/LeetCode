// class Solution {

//     public int calculate(int []nums , int i , int k){
//         int l = k , r = k;
//         long sum = nums[i];
//         int j = i-1;

//         while(l > 0){
//             sum += nums[j];
//             l--;
//             j--;
//         }

//         System.out.println("sum: " + sum);

//         j = i+1;
//         while(r > 0){
//             sum += nums[j];
//             j++;
//             r--;
//         } 

//         long val = sum / (2*k + 1);

//         // System.out.println("sum: " + sum + " val: " + val);
//         return (int) val;

//     }

//     public int[] getAverages(int[] nums, int k) {
//         int n = nums.length;
//         int ans[] = new int[n] ;

//         if(n <  2*k + 1) {
//             Arrays.fill(ans , -1);
//             return ans;
//         }

//         for(int i = 0 ; i < n ; i++){
//             if(i < k  || n - k - i <= 0){
//                 ans[i] = -1;
//             }
//             else{
//                 ans[i] = calculate(nums , i , k);
//             }
//         }

//         return ans;
//     }
// }

// ################### time limit exceed $$$$$$$$$$$$$$$$$

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n];

         if(n <  2*k + 1) {
            Arrays.fill(ans , -1);
            return ans;
         }

        long sum[] = new long[n];
        sum[0] = nums[0];

        for(int i = 1 ; i < n ; i++){
            sum[i] = sum[i-1] + nums[i];
        }

        for(int i = 0 ; i < n ; i++){
            if(i < k || n - k - i <= 0){
                ans[i] = -1;
            }
            else{
                long rsum = sum[i+k];
                long lsum = 0;
                
                if(i-k > 0){
                    lsum = sum[i - k - 1];
                }

                long val = (rsum - lsum) / (2*k + 1);

                ans[i] =  (int) val;
            }
        }
        

        return ans;
    }
}