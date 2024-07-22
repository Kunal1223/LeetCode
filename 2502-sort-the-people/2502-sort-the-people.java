class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer , String> map = new HashMap<>();
        int n = names.length;

        for(int i = 0 ; i < n ; i++){
            map.put(heights[i] , names[i]);
        }

        Arrays.sort(heights);
        String ans[] = new String[n];

        for(int i = 0 ; i < n ; i++){
            // System.out.print(" " + heights[n-1-i]);
            ans[i] = map.get(heights[n-i-1]);
        }

        return ans;
    }
}