class Solution {
    public int heightChecker(int[] heights) {
        int expec[] = new int[heights.length];

        for(int i = 0 ; i < heights.length ; i++){
            expec[i] = heights[i];
        }

        Arrays.sort(expec);
        int count = 0;

        for(int i = 0 ; i < heights.length ; i++){
            if(expec[i] != heights[i]){
                count++;
            }
        }

        return count;
    }
}