'''
Author: Goog Tech
Date: 2020-09-23 21:29:00
LastEditTime: 2020-09-23 21:31:51
Description: https://leetcode-cn.com/problems/house-robber/
FilePath: \leetcode-googtech\#198. House Robber\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    # DP : 动态规划
    # 设第 n 个房屋的最大金额为 dp[n],解题思路如下:
    # 1. 若偷第 n 个房屋的话,由于相邻的房屋不能偷,所以 dp[n] = dp[n - 2] + nums[n] (即偷窃总金额等于 n - 2 间房屋的最大总金额 + 第 n 间房屋的金额)
    # 2. 反之若不偷第 n 个房屋的话,那么 dp[n] = dp[n - 1](即偷窃总金额为 n - 1 间房屋的最大金额)
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums: return 0
        length = len(nums)
        if length == 1: return nums[0]
        dp = [0] * length
        dp[0] = nums[0]
        dp[1] = max(nums[0], nums[1])
        for i in range(2, length):
            dp[i] = max(dp[i - 2] + nums[i], dp[i - 1])
        return dp[length - 1]
