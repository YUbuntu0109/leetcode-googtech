'''
Author: Goog Tech
Date: 2020-09-01 11:57:17
LastEditTime: 2020-09-01 11:58:02
Description: https://leetcode-cn.com/problems/next-greater-element-i/
FilePath: \leetcode-googtech\#496. Next Greater Element I\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 解题思路: 先遍历 nums2 中的每一个元素,找出其下一个更大的元素,
    # 随后对于将这些答案放入哈希映射中,最后再遍历数组 nums1 直接找出答案
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # 初始化辅助栈,其用于存储 nums2 数组中每个元素的右边第一个更大的元素值
        # 初始化 HashMap,其中 nums2 数组中的元素作为 key,其对应的右边第一个更大的元素作为 value
        stack, hashSet = [], {}
        # 逐个遍历 nums2 数组中的元素
        for num in nums2:
            # 判断栈是否为空,并且当前元素是否大于栈顶元素
            while stack and stack[-1] < num:
                # 若满足条件,则将栈顶元素弹出并将其作为 key,当前元素作为 value 存储到 HashMap 中
                hashSet[stack.pop()] = num
            # 反之则说明当前元素在 nums2 数组中并不是栈顶元素右边第一个更大的元素,进而将其压入栈中
            stack.append(num)
        # 逐个遍历 nums1 数组中的元素,并通过将其作为 key 来获取 HashMap 中对应的 value,即对应的右边第一个更大的元素值
        # 若对应的 value 不存在则返回 -1: 因上述遍历完 nums2 后栈若为空,则说明栈中的元素在 nums2 数组中并无右边第一个更大的元素
        return [hashSet.get(x, -1) for x in nums1]
