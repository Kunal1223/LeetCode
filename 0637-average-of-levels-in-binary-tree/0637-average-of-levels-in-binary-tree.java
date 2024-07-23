/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();

        qu.add(root);
        
        while(!qu.isEmpty()){
            long size = qu.size();
            long sum = 0;

            for(int i = 0 ; i < size ; i++){
                TreeNode curr = qu.poll();
                sum += curr.val;

                if(curr.left != null){
                    qu.add(curr.left);
                }

                if(curr.right != null){
                    qu.add(curr.right);
                }
            }

            double val = (double) sum / size;
            list.add(val);
        }

        return list;
    }
}