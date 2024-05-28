class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1)
            return true;
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        
        return true;
    }
}
