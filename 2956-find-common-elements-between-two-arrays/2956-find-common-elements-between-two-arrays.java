class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res = new int[2];
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            set2.add(num);
        }

        for(int num : nums1){
            res[0] += set2.contains(num) ? 1 : 0;
        }

        for(int num : nums2){
            res[1] += set1.contains(num) ? 1 : 0;
        }
        return res;
    }
}