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
    public boolean isValidBST(TreeNode root) {

        List<Integer> nodes = new ArrayList<>();
        inorder(root, nodes);
        int current = nodes.get(0);
        for (int i = 1; i < nodes.size(); i++) {
            if(current >= nodes.get(i)){
                return false;
            }
            current = nodes.get(i);
        }

        return true;
    }

    private void inorder(TreeNode root, List<Integer> nodes) {

        if (root == null) {
            return;
        }
        inorder(root.left, nodes);
        nodes.add(root.val);
        inorder(root.right, nodes);
    }
}
