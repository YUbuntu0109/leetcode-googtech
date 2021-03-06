/*
 * @Author: Goog Tech
 * @Date: 2020-08-30 20:26:55
 * @LastEditTime: 2020-08-30 20:27:05
 * @Description: https://leetcode-cn.com/problems/k-diff-pairs-in-an-array/
 * @FilePath: \leetcode-googtech\#532. K-diff Pairs in an Array\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 双指针法
    public int findPairs(int[] nums, int k) {
        // 初始化用于存储 k-diff数对 之和的 HashSet 集合
        HashSet<Object> set = new HashSet<>();
        // 通过移动双指针 i 与 其后指针 j 来遍历数组元素
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                // 若当前双指针所指元素之差等于 k 则说明找到一个 k-diff 数对,即 (i, j) 或 (j, i)
                if(Math.abs(nums[i] - nums[j]) == k) {
                    // 将其所指元素相加,即作为一个标记存储到集合中
                    set.add(nums[i] + nums[j]);
                }
            }
        }
        // 返回集合中不同 k-diff 数对的数量
        return set.size();
    }
}
