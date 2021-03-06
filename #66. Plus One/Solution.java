/*
 * @Author: Goog Tech
 * @Date: 2020-08-25 11:46:53
 * @LastEditTime: 2020-08-25 11:47:15
 * @Description: https://leetcode-cn.com/problems/plus-one/
 * @FilePath: \leetcode-googtech\#66. Plus One\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int[] plusOne(int[] digits) {
        // 从尾到头遍历数组
        for(int i = digits.length - 1; i >= 0; i--) {
            // 尾部元素数值加一
            digits[i]++;
            // 取元素的个位数值
            digits[i] = digits[i] % 10;
            // 若无进位即 digits[i] != 0 则返回修改后的 digits,
            // 反之继续遍历直到判断没有再进位,然后退出遍历并返回结果
            if(digits[i] != 0) return digits;
        }
        // 针对一些特殊情况,例如遇到 99 之类的数字时,循环到最后还是需要进位
        // 出现这种情况时需要手动将它进一位,然后返回结果
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
