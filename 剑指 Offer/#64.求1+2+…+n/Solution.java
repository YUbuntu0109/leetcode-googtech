/*
 * @Author: Goog Tech
 * @Date: 2020-08-09 14:15:51
 * @LastEditTime: 2020-08-09 14:16:22
 * @Description: https://leetcode-cn.com/problems/qiu-12n-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#64.求1+2+…+n\Solution.java
 */

class Solution {
    // 递归法
    public int sumNums(int n) {
        // 将判断是否为递归的条件看作A,将递归的主体函数看作B
        // 即在 A && B 中,只有 A 为 true 时才执行B哟
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
