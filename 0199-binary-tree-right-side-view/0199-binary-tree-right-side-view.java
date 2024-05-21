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
    public void iterate(TreeNode root,ArrayList <Integer> arr,int level){
        if(root!=null && level==arr.size()){
            arr.add(root.val);
        }
        if(root.right!=null){
            iterate(root.right,arr,level+1);
        }
        if(root.left!=null){
            iterate(root.left,arr,level+1);
        }
        return;
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)return new ArrayList<Integer>();
        ArrayList <Integer> arr=new ArrayList<>();
        iterate(root,arr,0);
        return arr;
    }
}