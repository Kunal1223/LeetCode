import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        if (n < 4) return ans;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}


// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         Arrays.sort(nums);
//         Set<List<Integer>> s = new HashSet<>();
//         List<List<Integer>> output = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 int k = j + 1;
//                 int l = nums.length - 1;
//                 while (k < l) {
//                     long sum = nums[i];
//                     sum += nums[j];
//                     sum += nums[k];
//                     sum += nums[l];
//                     if (sum == target) {
//                         s.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
//                         k++;
//                         l--;
//                     } else if (sum < target) {
//                         k++;
//                     } else {
//                         l--;
//                     }
//                 }
//             }
//         }
//         output.addAll(s);
//         return output;
//     }
// }