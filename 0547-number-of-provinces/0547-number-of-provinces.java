class Solution {

    public void dfs(List<List<Integer>> adj , int visit[] , int i){
        for(int j : adj.get(i)){
            if(visit[j] != 1){
                visit[j] = 1;
                dfs(adj , visit , j);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = isConnected.length;

        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int visit[] = new int[n];
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            if(visit[i] == 0){
                count++;
                visit[i] = 1;
                dfs(adj , visit , i);
            }
        }

        return count;
    }
}