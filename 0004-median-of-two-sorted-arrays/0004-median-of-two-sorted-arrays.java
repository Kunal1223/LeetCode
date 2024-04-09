class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length ;
        int k = 0;
        
        int a[] = new int[n+m];
        
        for(int i = 0 ; i< n ;i++){
            a[k++] = nums1[i];
        }
        
        for(int i = 0 ; i< m ;i++){
            a[k++] = nums2[i];
        }
        
        Arrays.sort(a);
        
        int totalLength = n + m;
        if (totalLength % 2 != 0) {
            return a[totalLength / 2];
        } else {
            int mid = totalLength / 2;
            return (a[mid - 1] + a[mid]) / 2.0;
        }
        
    }
}