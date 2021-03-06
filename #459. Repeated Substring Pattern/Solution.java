/*
 * @Author: Goog Tech
 * @Date: 2020-08-24 09:24:57
 * @LastEditTime: 2020-08-24 09:34:33
 * @Description: https://leetcode-cn.com/problems/repeated-substring-pattern/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\459.重复的子字符串.java
 * @Reference: https://leetcode-cn.com/problems/repeated-substring-pattern/solution/jian-dan-ming-liao-guan-yu-javaliang-xing-dai-ma-s/
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {

    // 解题思路: 判断str中去除首尾元素后是否包含自身元素,如果包含,则表明存在重复子串
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }
}
// @lc code=end
