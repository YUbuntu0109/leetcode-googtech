'''
Author: Goog Tech
Date: 2020-08-25 09:15:24
LastEditTime: 2020-08-25 09:16:16
Description: https://leetcode-cn.com/problems/is-subsequence/
FilePath: \leetcode-googtech\#392. Is Subsequence\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 双指针法
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # 初始化双指针,分别指向 s 与 t 的初始位置
        i, j = 0, 0
        # 循环遍历两字符串
        while i < len(s) and j < len(t):
            # 若字符匹配成功则 i 和 j 同时右移
            if s[i] == t[j]:
                i += 1
                j += 1
            # 反之 j 右移,尝试用 t 的下一个字符匹配 s
            else:
                j += 1
        # 若最终 i 移动到 s 的末尾,则说明 s 为 t 的子序列
        return i == len(s)
