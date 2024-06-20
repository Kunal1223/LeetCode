class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Stack<Double> st = new Stack<>();
        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            map.put(position[i] , speed[i]);
        }
        
        Arrays.sort(position);

        for(int i = n-1 ; i >= 0  ; i--){
            double time = (double) (target-position[i])/map.get(position[i]);
            System.out.print(" " + time);

            if(!st.isEmpty() && time <= st.peek()){
                continue;
            }
            else{
                st.push(time);
            }
        }

        return st.size();
    }
}