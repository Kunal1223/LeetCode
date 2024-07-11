class Solution {
    public int minimumRounds(int[] tasks) {
        int ans = 0;
        int n = tasks.length;

        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            map.put(tasks[i] , map.getOrDefault(tasks[i] , 0) + 1);
        } 

        for(int num : map.keySet()){
            int val = map.get(num);

            if(val < 2){
                return -1;
            }

            while(val > 0){
                if(val % 3 == 0){
                    val = val - 3;
                    ans++;
                }
                else if(val % 2 == 0){
                    val = val - 2;
                    ans++;
                }
                else{
                    val = val - 3;
                    ans++;
                }

                if(val < 0){
                    return -1;
                }
            }
        }

        return ans;
    }
}