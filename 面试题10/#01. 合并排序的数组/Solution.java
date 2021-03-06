/*
 * @Author: Goog Tech
 * @Date: 2020-08-30 14:51:00
 * @LastEditTime: 2020-08-30 14:51:48
 * @Description: https://leetcode-cn.com/problems/sorted-merge-lcci/
 * @FilePath: \leetcode-googtech\面试题10\#01. 合并排序的数组\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 双指针法
    public void merge(int[] A, int m, int[] B, int n) {
        // 初始化两数组的尾指针与数组总长度的下标值
        int i = m - 1, j = n - 1, index = m + n - 1;
        // 通过移动 B 数组指针循环遍历 A 与 B 数组中的元素
        while(j >= 0) {
            // 判断 A 数组尾指针是否移动完毕或当前 B 数组中的元素是否大于 A 中元素 
            if(i < 0 || B[j] >= A[i]) {
                // 若是则将当前 B 数组中的元素添加到 A 数组中
                A[index--] = B[j--];
            } else {
                // 反之将当前 A 数组中的元素添加到 A 数组中
                A[index--] = A[i--];
            }
        }
    }
}
