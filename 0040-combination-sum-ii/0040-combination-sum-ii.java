class Solution {
    
   private void find(int i, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        // Sorting the array to handle duplicates
        Arrays.sort(arr);

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int j = i; j < arr.length; j++) {
            // Avoid duplicates
            if (j > i && arr[j] == arr[j - 1]) {
                continue;
            }

            if (arr[j] > target) {
                break;  // As the array is sorted, further elements will also be greater
            }

            ds.add(arr[j]);
            find(j + 1, arr, target - arr[j], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        find(0, candidates, target, ans, new ArrayList<>());
        return ans;
        
    }
}