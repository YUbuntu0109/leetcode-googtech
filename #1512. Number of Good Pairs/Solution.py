'''
Author: Goog Tech
Date: 2020-08-15 20:25:55
LastEditTime: 2020-08-15 20:29:12
Description: https://leetcode-cn.com/problems/number-of-good-pairs/
FilePath: \leetcode-googtech\#1512. Number of Good Pairs\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=1512 lang=python
#
# [1512] 好数对的数目
#

# @lc code=start
class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]: 
                    result += 1
        return result
# @lc code=end
