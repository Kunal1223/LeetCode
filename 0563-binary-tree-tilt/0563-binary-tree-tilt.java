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
    int sum;

    public int Traverse(TreeNode root){
        if(root == null) return 0;

        int left = Traverse(root.left);
        int right = Traverse(root.right);

        sum += Math.abs(right - left);
        return left + right + root.val;
    }

    public int findTilt(TreeNode root) {
        if(root == null) return 0;

        Traverse(root);
        return sum;
    }
}