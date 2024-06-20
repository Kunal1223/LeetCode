class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        int n = position.length;

        int ans = 0;
        int low = 1;
        int high = position[n-1] - position[0];

        while(low <= high){
            int mid = low + (high - low)/2;

            if(canWePlace(position , mid , m)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid -1;
            }
        }

        return ans;
   
    }

    public boolean canWePlace(int a[] , int mid , int m){
        int last = a[0];
        int count = 1;

        for(int i  = 0 ; i < a.length ; i++){
            if(a[i] - last >= mid){
                count++;
                last = a[i];
            }

            if(count  >= m)
                return true;
        }

        return false;
    }
}