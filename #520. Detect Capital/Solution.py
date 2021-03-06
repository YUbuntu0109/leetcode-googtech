'''
@Author: Goog Tech
@Date: 2020-07-24 18:18:31
@Description: https://leetcode-cn.com/problems/detect-capital/
@FilePath: \leetcode-googtech\#520. Detect Capital\Solution.py
'''
class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        # istitle():检测字符串中所有的单词拼写首字母是否为大写
        # return word.islower() or word.isupper() or word.istitle()

        lower = upper = 0
        strLength = len(word)
        # 通过比较ASCII的大小来统计字符串中大小写字符的个数
        for i in range(0,strLength):
            if word[i] >= 'a': 
                lower = lower+1
            else: 
                upper = upper+1
        # google or GOOGLE or Google
        return lower == strLength or upper == strLength or (upper==1 and word[0]<'a')

# Test
print(Solution().detectCapitalUse("Google"))
