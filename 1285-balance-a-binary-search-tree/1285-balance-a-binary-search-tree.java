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

    public void inorder(TreeNode node ,List<Integer> list){
        if(node == null) return;

        inorder(node.left , list);
        list.add(node.val);
        inorder(node.right , list);
    }

    public TreeNode Construct(TreeNode node , List<Integer> list , int st , int en){
        if(st > en) return null;

        int mid = st + (en - st)/2;
        TreeNode curr = new TreeNode(list.get(mid));
        curr.left = Construct(node , list , st , mid -1);
        curr.right = Construct(node , list , mid+1 , en);

        return curr;
    }


    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root , list);
        
        return Construct(root , list , 0 , list.size() - 1);
    }
}