package com.shj.leecode;

public class Solution4 {

    public static void main(String[] args) {
        System.out.println(new Solution4().findMedianSortedArrays(new int[]{1,2,3}, new int[]{3,4,5}));

    }

    public double findMedianSortedArrays(int [] nums1, int[] nums2) {
        int[] temNums = new int[nums1.length+ nums2.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < temNums.length; i++) {
            if (rightIndex == nums2.length ||( leftIndex!=nums1.length && nums1[leftIndex] < nums2[rightIndex])) {
                temNums[i] = nums1[leftIndex];
                leftIndex++;
            }else{
                temNums[i] = nums2[rightIndex];
                rightIndex++;
            }
        }
        if (temNums.length%2 == 0) {
            return (temNums[temNums.length/2-1] + temNums[temNums.length/2])/2.0;
        }else{
            return temNums[temNums.length/2];
        }
    }
}
