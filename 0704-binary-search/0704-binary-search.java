class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        
        if(n == 0 ) return 0;
        if(n == 1 ){
            if(nums[0] == target) return 0;
            else return -1;
        }

        int st = 0 , en = n-1;

        while(st <= en){
            int mid = st + (en - st )/2;

            if(nums[mid] == target) return mid;
            if(nums[mid] < target) st = mid+1;
            else en = mid-1;
        }

        return -1;
    }
}