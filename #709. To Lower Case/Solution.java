/*
 * @Author: Goog Tech
 * @Date: 2020-07-20 23:50:00
 * @Description: https://leetcode-cn.com/problems/to-lower-case/
 * @FilePath: \leetcode-googtech\#709. To Lower Case\Solution.java
 */

class Solution {
    public String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp >= 65 && temp <= 90) {
                temp += 32;
            }
            result += temp;
        }
        return result;
    }
}
