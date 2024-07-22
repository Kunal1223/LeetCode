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

    public void Traverse(TreeNode root , List<Integer> list , Map<Integer , Integer> map , int maxfreq[]){
        if(root == null) return;

        map.put(root.val , map.getOrDefault(root.val , 0) + 1);

        if(map.get(root.val) > maxfreq[0]){
            list.clear();
            list.add(root.val);
            maxfreq[0] = map.get(root.val);
        }
        else if(map.get(root.val) == maxfreq[0]){
            System.out.println(root.val + "     " + map.get(root.val));
            list.add(root.val);
        }

        Traverse(root.left , list , map , maxfreq);
        Traverse(root.right , list , map , maxfreq);
    } 

    public int[] findMode(TreeNode root) {
        int maxfreq[] = new int [1];
        List<Integer> list = new ArrayList<>();
        Map<Integer , Integer> map = new HashMap<>();

        Traverse(root , list , map , maxfreq);

        int n = list.size();
        int ans[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}