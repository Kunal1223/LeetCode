class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a[] = new int[n];

        int i = 1 , j = n-1;
        while(i < n ){
            a[i] = nums[j];
            i += 2;
            j--;
        }

        i = 0;
        while(i < n){
            a[i] = nums[j];
            i += 2;
            j--;
        }

        for(int m = 0 ; m < n ; m++){
            nums[m] = a[m];
        }

    }
}