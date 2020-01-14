package com.shj.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * <p>
 * 例如，给出 n = 3，生成结果为：
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution22 {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(String.format("给出 n = %d, 生成结果为：", n));
        Solution22 solution22 = new Solution22();
        System.out.println(solution22.generateParenthesis(n).toString());
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        this._gen(n, 0, 0, result, "");
        return result;
    }

    public void _gen(int n, int left, int right, List<String> result, String str) {
        if (left == n && right == n) {
            result.add(str);
            return;
        }
        if (left < n) {
            _gen(n, left + 1, right, result, str + "(");
        }
//        if(right < n && left!= 0 && left > right) {
        if (left > right) {
            _gen(n, left, right + 1, result, str + ")");
        }
    }

}
