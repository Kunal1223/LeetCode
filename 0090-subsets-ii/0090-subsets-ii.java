import java.util.*;

class Solution {
    public void SolveByRecursion(List<List<Integer>> res, List<Integer> list, int start, int[] nums) {
        res.add(new ArrayList<>(list));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; 
            list.add(nums[i]);
            SolveByRecursion(res, list, i + 1, nums);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) return res;

        Arrays.sort(nums); 
        SolveByRecursion(res, new ArrayList<>(), 0, nums);

        return res;
    }
}
