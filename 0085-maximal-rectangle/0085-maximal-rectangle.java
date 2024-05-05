//Problems of the days

// class Solution {
//     public int maximalRectangle(char[][] matrix) {

//         int max = 0;

//         int m = matrix.length;
//         int n = matrix[0].length;

//         int arr[] = new int[n];

//         for(int i = 0; i < m; i++){
//             for(int j = 0; j < n; j++){
//                 if(matrix[i][j] == '0'){
//                     arr[j] = 0;
//                 } else {
//                     arr[j] += 1;
//                 }
//             }

//             max = Math.max(max, helper(arr));
//         }

//         return max;
//     }

//     public int helper(int[] arr){
//         Deque<Pair<Integer, Integer>> st = new ArrayDeque<>();

//         int max = 0;

//         for(int i = 0; i < arr.length; i++){
//             int idx = i;

//             while(st.size() > 0 && st.peek().getKey() >= arr[i]){
//                 Pair<Integer, Integer> p = st.pop();

//                 idx = p.getValue();

//                 int area = p.getKey()*(i - idx);

//                 max = Math.max(max, area);
//             }

//             st.push(new Pair<>(arr[i], idx));
//         }

//         while(st.size() > 0){
//             Pair<Integer, Integer> p = st.pop();

//             int area = p.getKey()*(arr.length - p.getValue());

//             max = Math.max(max, area);
//         }

//         return max;
//     }
// }

// $$$$$$$$$$$$$$$$$$$$$ using stack $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

import java.util.*;

class Solution {
    public int[] prevMin(int[] height, int n) {

        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (st.isEmpty()) {
                ans[i] = -1;
                st.push(i);
            } else {
                if (height[st.peek()] >= height[i]) {

                    while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                        st.pop();
                    }

                    if (st.isEmpty()) {
                        ans[i] = -1;
                        st.push(i);
                    } else {
                        ans[i] = st.peek();
                        st.push(i);
                    }
                } else {
                    ans[i] = i - 1;
                    st.push(i);
                }
            }
        }

        return ans;
    }

    public int[] nextMin(int[] height, int n) {

        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            if (st.isEmpty()) {
                ans[i] = -1;
                st.push(i);
            } else {
                if (height[st.peek()] >= height[i]) {

                    while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                        st.pop();
                    }

                    if (st.isEmpty()) {
                        ans[i] = -1;
                        st.push(i);
                    } else {
                        ans[i] = st.peek();
                        st.push(i);
                    }
                } else {
                    ans[i] = i + 1;
                    st.push(i);
                }
            }
        }

        return ans;
    }

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        if (n == 0) return 0;
        if (n == 1) return heights[0];

        int left[] = new int[n];
        int right[] = new int[n];

        left = prevMin(heights, n);
        right = nextMin(heights, n);

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (right[i] == -1)
                right[i] = n;

            ans = Math.max(ans, heights[i] * (right[i] - left[i] - 1));
        }

        return ans;
    }

    public int maximalRectangle(char[][] matrix) {

        // finding the largest area of first row

        int[] heights = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            heights[i] = matrix[0][i] - '0';
        }
        int area = largestRectangleArea(heights);

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] != '0') {
                    matrix[i][j] = (char) (matrix[i][j] + matrix[i - 1][j] - '0');
                } else {
                    matrix[i][j] = '0';
                }
            }
            for (int j = 0; j < m; j++) {
                heights[j] = matrix[i][j] - '0';
            }
            area = Math.max(area, largestRectangleArea(heights));
        }

        return area;

    }
}
