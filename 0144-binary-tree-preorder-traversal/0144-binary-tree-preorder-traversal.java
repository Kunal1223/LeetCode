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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }else{
            Helper(root , list);
        }

        return list;
        
    }

    public void Helper(TreeNode root , List<Integer> list){

        if(root != null){
            list.add(root.val);
            Helper(root.left , list);
            Helper(root.right , list);
        }
    }
}