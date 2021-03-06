'''
Author: Goog Tech
Date: 2020-09-28 11:46:38
LastEditTime: 2020-09-28 11:46:52
Description: https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/
FilePath: \leetcode-googtech\#124. Binary Tree Maximum Path Sum\Solution.py
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
    def maxPathSum(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def getMaxSum(node):
            global maxSum
            # 判断节点是否为空
            if not node: return 0
            # 递归计算当前节点的左右孩子节点,仅当最大贡献值 maxSum 大于 0 时,才会选取对应的节点
            left = max(getMaxSum(node.left), 0)
            right = max(getMaxSum(node.right), 0)
            # 节点的最大路径和取决于当前节点的值与该节点的左右子节点的最大贡献值
            self.maxSum = max(node.val + left + right, self.maxSum)
            # 返回当前节点的最大贡献值
            return node.val + max(left, right)
        self.maxSum = float('-inf')
        getMaxSum(root)
        return self.maxSum
