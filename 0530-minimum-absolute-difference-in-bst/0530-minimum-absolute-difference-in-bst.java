// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
    
//     public void find(TreeNode root , List<Integer> list){

//         if(root == null) return;
        
//         list.add(root.val);
//         find(root.left , list);
//         find(root.right , list);
//     }
    
//     public int getMinimumDifference(TreeNode root) {
        
//         if(root == null) return 0;
        
//         List<Integer> list = new ArrayList<>();
//         find(root , list);
        
//         Collections.sort(list);
        
//         int min = Integer.MAX_VALUE;
//         int n = list.size();

//         for(int i = 0 ; i < n-1 ; i++){
//             min = Math.min(min , (list.get(i+1) - list.get(i)));
//         }

//         return min;

//     }
// }


class Solution {
    public int min = Integer.MAX_VALUE;
    public TreeNode prev = null; 
    public int getMinimumDifference(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        inOrder(root);
        return min;
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        if (root.left != null) inOrder(root.left);
        if (prev != null) min = Math.min(min, Math.abs(root.val - prev.val));
        prev = root;
        if (root.right != null) inOrder(root.right);
    }
}