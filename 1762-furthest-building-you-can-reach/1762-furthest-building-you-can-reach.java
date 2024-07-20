// class Solution {
//     public int furthestBuilding(int[] heights, int bricks, int ladders) {
//         int i = 0;
//         int n = heights.length;

//         while(i < n-1 && (bricks > 0 || ladders > 0)){

//             if(heights[i+1] > heights[i]){
//                 if(bricks >= (heights[i+1] - heights[i])){
//                     bricks -= (heights[i+1] - heights[i]);
//                 }
//                 else if(ladders > 0){
//                     ladders--;
//                 }
//                 else{
//                     break;
//                 }
//             }

//             i++;
//         }

//         while(i < n-1 && heights[i+1] < heights[i]){
//             i++;
//         }

//         return i;
//     }
// }




// ####################### By Priority Queue $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int i;
        for (i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            
            if (diff > 0) {
                minHeap.add(diff);
            }

            if (minHeap.size() > ladders) {
                bricks -= minHeap.poll();
            }

            if (bricks < 0) {
                return i;
            }
        }
        
        return i;
    }
}
