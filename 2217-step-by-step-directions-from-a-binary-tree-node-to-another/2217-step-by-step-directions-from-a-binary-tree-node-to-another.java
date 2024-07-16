class Solution {

    public boolean Traverse(TreeNode root , int val , StringBuilder sb){
        if(root.val == val){
            return true;
        }
        else if(root.left != null && Traverse(root.left , val , sb)){
            sb.append("L");
        }
        else if(root.right != null && Traverse(root.right , val , sb)){
            sb.append("R");
        } 

        return sb.length() > 0;
    }

    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder start = new StringBuilder();
        StringBuilder end = new StringBuilder();

        Traverse(root , startValue , start);
        Traverse(root , destValue , end);

        int i = 0;
        int smval = Math.min(start.length() , end.length());
        
        while(i < smval && start.charAt(start.length() - 1 - i) == end.charAt(end.length() - i - 1)){
            i++;
        }

        return "U".repeat(start.length()-i).toString() + end.reverse().toString().substring(i);
    }
}