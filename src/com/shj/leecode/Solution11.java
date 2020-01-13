package com.shj.leecode;


import java.util.Arrays;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 *
 *
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 *
 *  
 *
 * 示例:
 *
 * 输入: [1,8,6,2,5,4,8,3,7]
 * 输出: 49
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution11 {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};

        System.out.println(String.format("输入：%s", Arrays.toString(height)));

        Solution11 solution11 = new Solution11();
        System.out.println(String.format("输出：%s", solution11.maxArea(height)));
    }

    /**
     * 双指针，一个头一个尾，计算当前面积，并和当前最大面积做比较
     * 然后较短的指针往中间移动一位。直到两个指针相遇。
     * @param height height
     * @return maxArea
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        int beginIndex = 0;
        int endIndex = height.length - 1;
        while (beginIndex != endIndex) {
            int beginHeight = height[beginIndex];
            int endHeight = height[endIndex];

            int curArea = Math.abs(beginIndex-endIndex)*(beginHeight<endHeight?beginHeight:endHeight);
            if(curArea >maxArea){
                maxArea = curArea;
            }
            if(beginHeight > endHeight){
                endIndex--;
            }else{
                beginIndex++;
            }

        }
        return maxArea;
    }
    /**
     * 优化方法1，j不需要每次都从0开始，会重复计算。
     * @param height height
     * @return maxArea
     */
    public int maxArea_2(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int curArea = (j-i)*(height[i]<height[j]?height[i]:height[j]);
                if(curArea >maxArea){
                    maxArea = curArea;
                }
            }
        }
        return maxArea;
    }
    /**
     * 获取所有盛水体积，取最大的
     * @param height height
     * @return maxArea
     */
    public int maxArea_1(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                if(i == j) continue;
                int curArea = Math.abs(i-j)*(height[i]<height[j]?height[i]:height[j]);
                if(curArea >maxArea){
                    maxArea = curArea;
                }
            }
        }
        return maxArea;
    }
}
