// ################## Method correct but time limit exceed ########################

// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

//         int n = nums.length;
//         int m = n - k + 1;

//         int ans[] = new int [m];
        
//         for(int i = 0 ; i < k ; i++){
//             pq.add(nums[i]);
//         }

//         int p = 0;
//         ans[p++] = pq.peek();

//         for(int i = k ; i < n ; i++){
//             pq.remove(nums[i-k]);
//             pq.add(nums[i]);
//             ans[p++] = pq.peek();
//         }
 
//         return ans;
//     }
// }

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dp = new LinkedList<>();
        int n = nums.length;
        int m = n - k + 1;

        int ans[] = new int[m];
        int p = 0;

        for(int i = 0 ; i < n ; i++){
            if(!dp.isEmpty() && dp.peekFirst() < i - k + 1){
                dp.pollFirst();
            } 

            while(!dp.isEmpty() && nums[dp.peekLast()] < nums[i]){
                dp.pollLast();
            }

            dp.addLast(i);

            if(i >= k  - 1){
                ans[p++] = nums[dp.peekFirst()] ;
            }
        }

        return ans;
    }
}