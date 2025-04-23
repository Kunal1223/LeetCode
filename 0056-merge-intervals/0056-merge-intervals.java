class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []> list = new ArrayList<>();

        if(intervals == null || intervals.length == 0)
        return list.toArray(new int [0][]);

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int a[] : intervals){
            if(a[0] <= end){
                end = Math.max(end , a[1]);
            }

            else{
                list.add(new int[]{start , end});
                start = a[0];
                end = a[1];
            }
        }

        list.add(new int[]{start, end});
        return list.toArray(new int [0][]);
    }
}