'''
Author: Goog Tech
Date: 2020-09-27 19:31:07
LastEditTime: 2020-09-27 19:31:45
Description: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
FilePath: \leetcode-googtech\#235. Lowest Common Ancestor of a Binary Search Tree\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 递归解法
    # 利用搜索二叉树中每个节点都具备特性: 大于左子树上任意一个节点的值，小于右子树上任意一个节点的值
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        #  判断当前节点是否为空
        if not root: return None
        # 若当前节点的值大于 q 与 p 的节点值,则说明 q 与 p 都在左子树
        if root.val > p.val and root.val > q.val:
            return self.lowestCommonAncestor(root.left, p, q)
        # 若当前节点的值小于 q 与 p 的节点值,则说明 q 与 p 都在右子树
        elif root.val < p.val and root.val < q.val:
            return self.lowestCommonAncestor(root.right, p, q)
        # 反之则说明 q 与 p 分别在 root 节点的异侧,进而直接返回最近公共祖先 root 即可
        else: return root
