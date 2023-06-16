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
    int maxLength = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxLength;
    }

    private int dfs(TreeNode root){
        int left = 0;
        int right = 0;
        if(root.left != null){
            left = dfs(root.left);
        }
        if(root.right != null){
            right = dfs(root.right);
        }

        maxLength = Math.max(maxLength, left + right);
        return Math.max(left, right) + 1;
    }
}
