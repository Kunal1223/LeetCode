class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> res= new ArrayList<>();
        if (root == null) return res;

        qu.add(root);

        while (!qu.isEmpty()) {
            int levelSize = qu.size();
            List<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = qu.poll();
                list.add(temp.val);

                if (temp.left != null) qu.add(temp.left);
                if (temp.right != null) qu.add(temp.right);
            }
            
            res.add(list);
        }

        return res;
    }
}
