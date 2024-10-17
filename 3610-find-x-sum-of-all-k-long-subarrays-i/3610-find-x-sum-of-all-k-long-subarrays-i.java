class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int ans[] = new int[n-k+1];

        for(int i = 0 ; i < n-k+1 ; i++){
            int sum = 0;
            Map<Integer, Integer> map = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();

            for(int j = i ; j < i+k ; j++){
                sum += nums[j];
                map.put(nums[j] , map.getOrDefault(nums[j] , 0)+1);
                set.add(nums[j]);
            }

            if(set.size() < x) ans[i] = sum;
            else{
                PriorityQueue<Integer> pq = new PriorityQueue<>((a , b) -> {
                    if(map.get(a) == map.get(b)) return b - a;
                    return map.get(b) - map.get(a);
                });

                for(int a : set){
                    pq.add(a);
                }

                int count = x;

                while(count > 0){
                    int top = pq.remove();
                    ans[i] +=(top* map.get(top));
                    count--;
                }
            }
        }

        return ans;
    }
}