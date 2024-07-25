class Solution {

    public void Merge(int nums[] , int st , int mid , int ed){
        int n = mid - st + 1;
        int m = ed - mid;

        int L[] = new int[n];
        int R[] = new int[m];

        for(int i = 0 ; i < n ; i++){
            L[i] = nums[st + i];
        }

        for(int i = 0 ; i < m ; i++){
            R[i] = nums[mid+1+i];
        }

        int i = 0 , j = 0;
        int k = st;

        while(i < n && j < m){
            if(L[i] <= R[j]){
                nums[k] = L[i];
                i++;
            }
            else{
                nums[k] = R[j];
                j++;
            }

            k++;
        }

        while(i < n){
            nums[k] = L[i];
            i++;
            k++;
        }

        while(j < m){
            nums[k] = R[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int nums[] , int st , int ed){
        if(st < ed){
            int mid = st + (ed - st)/2;
            mergeSort(nums , st , mid);
            mergeSort(nums , mid + 1 , ed);
            Merge(nums , st , mid , ed);
        }
    }

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums , 0 , n-1);
        return nums;
    }
}