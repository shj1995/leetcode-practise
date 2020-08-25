package com.shj.leecode;

import java.util.Arrays;

/**
 * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 * <p>
 * 示例 1:
 * <p>
 * 输入: S = "loveleetcode", C = 'e'
 * 输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 * 说明:
 * <p>
 * 字符串 S 的长度范围为 [1, 10000]。
 * C 是一个单字符，且保证是字符串 S 里的字符。
 * S 和 C 中的所有字母均为小写字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-distance-to-a-character
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author shihaojie
 * @since 2020/8/24 下午6:40
 */
public class Solution821 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++);
        System.out.println(++i);
        Solution821 solution821 = new Solution821();
        System.out.println(Arrays.toString(solution821.shortestToChar3("loveleetcode", 'e')));
    }

    public int[] shortestToChar(String S, char C) {
        int[] distance = new int[S.length()];
        int s1;
        int s2;
        for (int i = 0; i < S.length(); i++) {
            s1 = S.substring(i).indexOf(C);
            s2 = S.substring(0, i + 1).lastIndexOf(C);
            distance[i] = Math.min(s1 > -1 ? s1 : 10000, s2 > -1 ? i - s2 : 10000);
        }
        return distance;
    }

    public int[] shortestToChar2(String S, char C) {
        int[] distance = new int[S.length()];
        int[] cIndex = new int[S.length()];
        char[] chars = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            if (chars[i] == C) {
                distance[i] = 0;
                cIndex[i] = i;
            } else {
                distance[i] = 10000;
                cIndex[i] = -1;
                System.out.println(Arrays.toString(distance));
            }
        }
        for (int i = 0; i < cIndex.length; i++) {
            if (cIndex[i] == -1) {
                continue;
            }
            for (int j = 0; j <= i; j++) {
                for (int k = 1; k <= i; k++) {
                    if (distance[i - k] <= k || distance[i - k] == 0) {
                        break;
                    }
                    distance[i - k] = k;
                    System.out.println(Arrays.toString(distance));
                }
                for (int k = 1; k < S.length() - i; k++) {
                    if (distance[i + k] <= k || distance[i + k] == 0) {
                        break;
                    }
                    distance[i + k] = k;
                    System.out.println(Arrays.toString(distance));
                }
            }
        }
        return distance;
    }

    public int[] shortestToChar3(String S, char C) {
        int[] distance = new int[S.length()];
        char[] chars = S.toCharArray();

        for (int i = 0, j = 10000; i < S.length(); i++) {
            distance[i] = 10000;
            if (chars[i] == C) {
                distance[i] = 0;
                j = 0;
            } else {
                if (distance[i] > ++j) {
                    distance[i] = j;
                }
            }
        }
        for (int i = S.length() - 1, j = 10000; i >= 0; i--) {
            if (chars[i] == C) {
                distance[i] = 0;
                j = 0;
            } else {
                if (distance[i] > ++j) {
                    distance[i] = j;
                }
            }
        }
        return distance;
    }
}
