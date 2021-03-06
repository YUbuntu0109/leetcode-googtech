/*
 * @Author: Goog Tech
 * @Date: 2020-08-29 17:22:24
 * @LastEditTime: 2020-08-29 17:22:39
 * @Description: https://leetcode-cn.com/problems/remove-palindromic-subsequences/
 * @FilePath: \leetcode-googtech\#1332. Remove Palindromic Subsequences\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    
    // 1.空字符串 删除 0 次
    // 2.回文字符窜 删除 1 次
    // 3.非回文字符串 删除 2 次 (一次删除全部a , 一次删除全部b)
    // 注: 回文子序列不是回文子字符串,比如"aababdaba",其中"aaaaa"就是它的回文子序列
    public int removePalindromeSub(String s) {
        if("".equals(s)) return 0;
        return s.equals(new StringBuilder(s).reverse().toString()) == true ? 1 : 2;    
    }
}
