/*
 * @Author: Goog Tech
 * @Date: 2020-08-29 11:53:34
 * @LastEditTime: 2020-08-29 11:53:52
 * @Description: https://leetcode-cn.com/problems/destination-city/
 * @FilePath: \leetcode-googtech\#1436. Destination City\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public String destCity(List<List<String>> paths) {
        // 初始化用于存储起点名称的 HashSet 集合
        HashSet<String> startStops = new HashSet<>();
        // 循环遍历旅行线路集合,获取每个路径的起点名
        for(List<String> path : paths) {
            startStops.add(path.get(0));
        }
        // 再次遍历旅行线路集合,获取每个路径的终点名
        for(List<String> path : paths) {
            String dest = path.get(1);
            // 若起点名集合中不包含该终点名,则说明该点就是旅行终点站
            if(!startStops.contains(dest)) {
                return dest;
            }
        }
        // 无果
        return "";
    }
}
