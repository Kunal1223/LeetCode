class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j<n ;j++){
                int multi = nums[i]*nums[j];
                map.put(multi , map.getOrDefault(multi , 0) + 1);
            }
        }

        int ans = 0;
        for(int a : map.values()){
            int val = ((a * (a-1))/2) * 8;
            System.out.print(" " + val);
            ans += val;
        }

        return ans;
    }
}