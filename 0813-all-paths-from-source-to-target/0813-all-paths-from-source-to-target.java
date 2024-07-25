class Solution {

    public void dfs(int u , int v , int[][] graph , List<Integer>path , List<List<Integer>> res){
        if(u == v){
            res.add(new ArrayList<>(path));
        }

        int allnode[] = graph[u];
        for(int i : allnode){
           path.add(i);
            dfs(i , v , graph ,path , res);
           path.remove(path.size() -1);
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        int u = 0 , v = graph.length - 1;
        path.add(0);
        dfs(u , v , graph ,path , res);

        return res;
    }
}