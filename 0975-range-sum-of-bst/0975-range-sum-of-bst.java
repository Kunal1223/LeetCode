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

    public int Solve(TreeNode node , int low , int high){
        if(node == null ) return 0;

        if(node.val >= low && node.val <= high){
            System.out.print("  " + node.val);
            sum += node.val;
        }

        Solve(node.left , low , high);
        Solve(node.right , low , high);

        return sum;
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        int left = Solve(root , low , high);
        return left;
    }
}