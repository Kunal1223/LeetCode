class Solution {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public int helper(TreeNode root,int k){
        if(root==null){
            return 0;
        }

        int left = helper(root.left,k);
        int right = helper(root.right,k);

        if((root.left!=null && root.right==null) || (root.right!=null && root.left==null)){
            return -1;
        }

        if(left==-1 || right==-1 || left!=right){
            return -1;
        }
        
        if(pq.size()<k){
            pq.add(left+right+1);
        }else{
            if(pq.peek() < left+right+1){
                pq.poll();
                pq.add(left+right+1);
            }
        }
        return left+right+1;
    }

    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        helper(root,k);
        if(pq.size()<k){
            return -1;
        }
        return pq.peek();
    }
}