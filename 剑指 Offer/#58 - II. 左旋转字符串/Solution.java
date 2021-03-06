/*
 * @Author: Goog Tech
 * @Date: 2020-08-04 10:18:08
 * @LastEditTime: 2020-08-04 10:21:11
 * @Description: https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#58 - II. 左旋转字符串\Solution.java
 */

class Solution {
    
    // 方法一: 字符串切片
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    // 方法二: 列表遍历拼接
    public String reverseLeftWords(String s, int n) {
        StringBuilder result = new StringBuilder();
        // 先将第n + 1位至末位的字符添加到result中
        for(int i = n; i < s.length(); i++) result.append(s.charAt(i));
        // 再将首位至第n位的字符添加到result中
        for(int i = 0; i < n; i++) result.append(s.charAt(i));
        // 将result转换为字符串返回
        return result.toString();
    }
}
