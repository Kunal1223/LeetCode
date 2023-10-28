public class Solution {
    public int maxArea(int[] height) {
        int start = 0; 
        int last = height.length - 1;
        int max = 0;

        while (start < last) {
            int svalue = height[start];
            int lvalue = height[last];
            int min_height = Math.min(svalue, lvalue);
            int leng = last - start;
            int current_area = min_height * leng;

            max = Math.max(max, current_area);
            if (svalue < lvalue) 
                start++;
            else 
                last--;
        }

        return max;
    }
}