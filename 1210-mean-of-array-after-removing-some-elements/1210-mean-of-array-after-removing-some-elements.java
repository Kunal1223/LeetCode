class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        int orignaln = n/20;

        int sum = Arrays.stream(arr).sum();
        Arrays.sort(arr);

        int i = 0;
        while(orignaln > 0){
            sum -= arr[i];
            sum -= arr[n-i-1];
            orignaln--;
            i++;
        }
        
        double ans = (double)  sum/(n - (n/20)*2);
        return ans;
    }
}