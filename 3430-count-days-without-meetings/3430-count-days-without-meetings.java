class Solution {
    public int countDays(int days, int[][] meetings) {
        int n = meetings.length;
        int count = 0;

        Arrays.sort(meetings , (a , b) -> a[0] - b[0]);
        count += meetings[0][0] - 1;

        for(int i = 1 ; i < n ; i++){
            if(meetings[i][0] <= meetings[i-1][1]){
                if(meetings[i][1] < meetings[i-1][1]){
                    meetings[i][1] = meetings[i-1][1];
                }
            }else{
                int day = meetings[i][0] - meetings[i-1][1];
                count += day -1;
            }
        } 

        count += Math.abs(meetings[n-1][1] - days);
        return count;
        
    }
}