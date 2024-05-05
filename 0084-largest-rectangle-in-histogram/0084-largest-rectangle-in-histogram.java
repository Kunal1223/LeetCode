// ############### Solve By O(n2) time complexity &&&&&&&&&&&

// class Solution {
//    public static int largestRectangleArea(int[] height) {
       
//     if (height == null || height.length == 0) {
//         return 0;
//     }
       
//     int[] lessFromLeft = new int[height.length]; 
//     int[] lessFromRight = new int[height.length]; 
//     lessFromRight[height.length - 1] = height.length;
//     lessFromLeft[0] = -1;

//     for (int i = 1; i < height.length; i++) {
//         int p = i - 1;

//         while (p >= 0 && height[p] >= height[i]) {
//             p = lessFromLeft[p];
//         }
//         lessFromLeft[i] = p;
//     }

//     for (int i = height.length - 2; i >= 0; i--) {
//         int p = i + 1;

//         while (p < height.length && height[p] >= height[i]) {
//             p = lessFromRight[p];
//         }
//         lessFromRight[i] = p;
//     }

//     int maxArea = 0;
//     for (int i = 0; i < height.length; i++) {
//         maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
//     }

//     return maxArea;
// }
// }



// ############### Solve By O(N) time complexity &&&&&&&&&&&

class Solution {

    public int[] prevMin(int []height , int n ){

        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < n ; i++){

            if(st.isEmpty()){
                ans[i] = -1;
                st.push(i);
            }

            else{
                if(height[st.peek()] >= height[i]){
                    
                    while(!st.isEmpty() && height[st.peek()] >= height[i]){
                        st.pop();
                    }

                    if(st.isEmpty()){
                        ans[i] = -1;
                        st.push(i);
                    }

                    else{
                        ans[i] = st.peek();
                        st.push(i);
                    }
                }
                else{
                    ans[i] = i-1;
                    st.push(i);
                }
            }
        }

        return ans;
    }


    public int[] nextMin(int []height , int n ){

        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1 ; i >= 0 ; i--){

            if(st.isEmpty()){
                ans[i] = -1;
                st.push(i);
            }

            else{
                if(height[st.peek()] >= height[i]){
                    
                    while(!st.isEmpty() && height[st.peek()] >= height[i]){
                        st.pop();
                    }

                    if(st.isEmpty()){
                        ans[i] = -1;
                        st.push(i);
                    }

                    else{
                        ans[i] = st.peek();
                        st.push(i);
                    }
                }
                else{
                    ans[i] = i+1;
                    st.push(i);
                }
            }
        }

        return ans;
    }



    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        if(n == 0) return 0;
        if( n == 1) return heights[0];

        int left[] = new int[n];
        int right[] = new int[n];

        left = prevMin(heights , n);
        right = nextMin(heights , n);

        int ans = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){

            if(right[i] == -1)
                right[i] = n;

            ans = Math.max(ans , heights[i] * (right[i] - left[i] - 1));
        }

        return ans;
    }
}