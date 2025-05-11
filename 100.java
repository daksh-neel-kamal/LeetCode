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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<Integer> pList = dfs(p);
        List<Integer> qList = dfs(q);
        System.out.println(pList);
        System.out.println(qList);
        if (pList == null && qList == null) {
            return true;
        } else if ((pList != null && qList == null) ||
                pList == null && qList != null) {
            return false;
        }
        return pList.equals(qList);
    }

    private List<Integer> dfs(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if (root == null) {
            return null;
        }
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode temp = s.pop();
            if (temp == null) {
                list.add(null);
            } else {
                list.add(temp.val);
            }
            if (temp != null) {
                if (temp.right != null) {
                    s.push(temp.right);
                } else {
                    s.push(null);
                }
                if (temp.left != null) {
                    s.push(temp.left);
                } else {
                    s.push(null);
                }
            }
        }
        return list;
    }
}
