// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         if (root == null)
//             return true;

//         Deque<TreeNode> deque = new LinkedList<>();
//         deque.addFirst(root.left);
//         deque.addLast(root.right);

//         while (!deque.isEmpty()) {
//             TreeNode leftNode = deque.removeFirst();
//             TreeNode rightNode = deque.removeLast();

//             if (leftNode == null && rightNode == null) {
//                 continue;
//             }
//             if (leftNode == null || rightNode == null) {
//                 return false;
//             }
//             if (leftNode.val != rightNode.val) {
//                 return false;
//             }

//             // Enqueue children in opposite order
//             deque.addFirst(leftNode.left);
//             deque.addFirst(leftNode.right);
//             deque.addLast(rightNode.right);
//             deque.addLast(rightNode.left);
//         }

//         return true;
//     }
// }


class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        return check(root.left , root.right);
    }
    
    public boolean check(TreeNode node1 , TreeNode node2){
        
        if(node1 == null && node2 == null){
            return true;
        }
        
        if(node1 == null || node2 == null){
            return false;
        }
        
        if(node1.val != node2.val) return false;
        
        return (node1.val == node2.val && check(node1.left , node2.right) && check(node1.right , node2.left) );
    }
}
