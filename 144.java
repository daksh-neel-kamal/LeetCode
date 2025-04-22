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

        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        while (curr != null || !stack.isEmpty()) {
            res.add(curr.val);
            if(curr.right != null){
                stack.push(curr.right);
            }
            curr = curr.left;
            if (curr == null && !stack.isEmpty()) {
                curr = stack.pop();
            }
        }
        return res;
    }
}
