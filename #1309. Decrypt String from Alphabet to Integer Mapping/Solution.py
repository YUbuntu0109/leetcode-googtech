'''
Author: Goog Tech
Date: 2020-08-29 15:51:59
LastEditTime: 2020-08-29 15:52:29
Description: https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
FilePath: \leetcode-googtech\#1309. Decrypt String from Alphabet to Integer Mapping\Solution.py
WebSite: https://algorithm.show/
'''
class Solution(object):
    def freqAlphabets(self, s):
        """
        :type s: str
        :rtype: str
        """
        # 初始化字符串指针,字符串长度,结果列表
        i, length, result = 0, len(s), []
        # 循环遍历字符串
        while i < length:
            # 当遍历到位置 i 时,首先看其后第两个字符 s[i + 2] 是否存在且等于 #
            # 若存在则表示位置 i, i + 1, i + 2 表示一个 j 到 z 之间的字符,否则表示 a 到 i 的字符
            if i + 2 < length and s[i + 2] == '#':
                # 先将切割的字符串转换为整型来获取其对应的 ASCII 码,再通过加 a 减 1 得到一个范围为 1 到 26 的数值
                # 最后将其转换为对应的字符,然后继续移动指针
                result.append(chr(int(s[i : i + 2]) + ord('a') - 1))
                i += 3
            else:
                result.append(chr(int(s[i]) + ord('a') - 1))
                i += 1
        # 返回字符串结果
        return ''.join(result)
