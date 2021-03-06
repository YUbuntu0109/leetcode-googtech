/*
 * @Author: Goog Tech
 * @Date: 2020-08-30 20:00:16
 * @LastEditTime: 2020-08-30 20:02:56
 * @Description: https://leetcode-cn.com/problems/long-pressed-name/
 * @FilePath: \leetcode-googtech\#925. Long Pressed Name\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    
    // 此题考察的是双指针算法,那我们用其它的简便方法吧嘻嘻😅
    public boolean isLongPressedName(String name, String typed) {
        // 将 name 字符串转化为字符数组
        char[] nameChars = name.toCharArray();
        // 初始化姓名数组指针,即下标值
        int index = 0;
        // 逐个遍历输入字符串 typed 中的字符
        for(char t : typed.toCharArray()) {
            // 若 index 的长度小于姓名数组的长度,
            // 并且当前输入的字符与 nameChars 数组中指针 index 所指的元素相同,则向后移动指针 index
            if(index < nameChars.length && t == nameChars[index]) index++;
            // 若 index 长度为 0 即 typed 与 name 字符串中的第一个字符不相同,
            // 或当前输入的字符 t 与 前一个输入的字符 t 不相同时,则返回 false
            else if(index == 0 || t != nameChars[index - 1]) return false;
        }
        // 最后判断 index 的长度是否与字符串 name 的长度相同,并返回其结果
        return index == name.length();
    }
}
