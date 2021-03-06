/*
 * @Author: Goog Tech
 * @Date: 2020-07-29 00:07:21
 * @Description: https://leetcode-cn.com/problems/symmetric-tree/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\101.对称二叉树.java
 */ 

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    /**
     * 递归法: 解题思路如下
     * 有个超大的坑啊: 记得首先判断 left == null && right == null
     * 而不是 left == null || right == null,不然无论什么结果都会一直返回 False
     * 1. 若左右子树中的两节点都非空,则对称
     * 2. 若左右子树中的两节点其有一个为空,则不对称
     * 3. 若左右子树中的两节点不相同,则不对称
     * 4. 继续递归比较左节点的左孩子和右节点的右孩子
     */
    public boolean isSymmetric(TreeNode root) {
        // if(root == null) return true;
        // return dfs(root.left, root.right);
        return root == null ? true : dfs(root.left, root.right); // 若根节点不为空则传入左右子树的根节点
    }
    private boolean dfs(TreeNode left, TreeNode right) {
        // if(left == null && right == null) return true;
        // if(left == null || right == null || left.val != right.val) return false;
        // return dfs(left.left, right.right, left.right, right.left);
         return left == null && right == null ? true : left == null || right == null || left.val != right.val ? false : dfs(left.left, right.right) && dfs(left.right, right.left);
    }
}
// @lc code=end
