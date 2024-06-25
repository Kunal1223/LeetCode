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
    public int sum = 0;

    public void Solve(TreeNode node){
        if(node == null) return;

        Solve(node.right);

        sum += node.val;
        node.val = sum;

        Solve(node.left);
    }


    public TreeNode bstToGst(TreeNode root) {
        Solve(root);
        return root;
    }
}