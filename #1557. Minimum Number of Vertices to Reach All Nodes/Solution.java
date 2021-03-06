/*
 * @Author: Goog Tech
 * @Date: 2020-09-15 16:12:07
 * @LastEditTime: 2020-09-15 16:12:27
 * @Description: https://leetcode-cn.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
 * @FilePath: \leetcode-googtech\#1557. Minimum Number of Vertices to Reach All Nodes\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    // 解题思路 : 遍历所有的边,使用集合存储所有有向边的终点,
    // 集合中的所有节点即为入度不为零的节点,剩下的所有节点即为入度为零,即没有前驱的节点.
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> resultList = new ArrayList<>();
        Set<Integer> endingSet = new HashSet<>();
        for(List<Integer> edge : edges) endingSet.add(edge.get(1));
        for(int i = 0; i < n; i++) {
            if(!endingSet.contains(i)) {
                resultList.add(i);
            }
        }
        return resultList;
    }
}
