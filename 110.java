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
    public boolean isBalanced(TreeNode root) {
        
       int height = dfs(root);
       if(height == -1){
        return false;
       }
       return true;
    }

    private int dfs(TreeNode root){

        if(root == null){
            return 0;
        }
        int lh = dfs(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = dfs(root.right);
        if(rh == -1){
            return -1;
        }
        int diff = Math.abs(lh - rh);
        if(diff > 1){
            return -1;
        }
        return Math.max(lh, rh) + 1;
    }
}
