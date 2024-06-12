class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1)
            return 1;

        HashMap<Integer, Integer> indegree = new HashMap<>();
        HashMap<Integer, Integer> outdegree = new HashMap<>();

        for (int[] i : trust) {
            int trusts = i[0];
            int trusted = i[1];

            indegree.put(trusted, indegree.getOrDefault(trusted, 0) + 1);
            outdegree.put(trusts, outdegree.getOrDefault(trusts, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : indegree.entrySet()) {
            int node = entry.getKey();
            int in = entry.getValue();
            if (in == n - 1 && outdegree.getOrDefault(node, 0) == 0)
                return node;
        }

        return -1;
    }
}