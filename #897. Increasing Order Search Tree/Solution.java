/*
 * @Author: Goog Tech
 * @Date: 2020-09-13 14:40:43
 * @LastEditTime: 2020-09-13 14:40:56
 * @Description: https://leetcode-cn.com/problems/increasing-order-search-tree/
 * @FilePath: \leetcode-googtech\#897. Increasing Order Search Tree\Solution.java
 * @WebSite: https://algorithm.show/
 */

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
    // 查找树也称搜索树或排序树,其特性为: 左孩子比根节点小,右孩子比根节点大,
    // 进而中序遍历会得到一个递增序列.
    public TreeNode increasingBST(TreeNode root) {
        // 初始化用于存储查找树中节点的 list 集合数组
        List<Integer> list = new ArrayList<>();
        // 中序遍历得到一个递增序列的集合数组
        inorder(root, list);
        // 初始化结果树的头节点及其指针
        TreeNode result = new TreeNode(0), currentNode = result;
        // 用已经有序的的集合数组元素构建结果树
        for(int value : list) {
            currentNode.right = new TreeNode(value);
            currentNode = currentNode.right;
        }
        // 返回根节点
        return result.right;
    }
    
    private void inorder(TreeNode node, List<Integer> list) {
        if(node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
}
