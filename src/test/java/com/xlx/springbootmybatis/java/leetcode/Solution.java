
package com.xlx.springbootmybatis.java.leetcode;

class Solution {
    public int pivotIndex(int[] nums) {
        //左右两侧至少一个元素
        for (int i = 1; i < nums.length - 1; i++) {
            int sumLeft = sum(nums, 0, i - 1);
            int sumRight = sum(nums, i + 1, nums.length - 1);
            if (sumLeft == sumRight) {
                return i;
            }
        }

        return -1;
    }

    private int sum(int[] nums, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += nums[i];
        }
        return sum;
    }

    //最大值是其他所有元素的两倍(包括)以上返回其对应的索引，否则-1
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE, subMax = Integer.MIN_VALUE;
        int maxPos = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                subMax = max;
                max = nums[i];
                maxPos = i;
            } else if (nums[i] > subMax) {
                subMax = nums[i];
            }
        }
        if (max < subMax * 2) {
            maxPos = -1;
        }
        return maxPos;
    }

    //十进制整数
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;

        int j;
        int over = -1;
        for (j = digits.length - 1; j >= 0; j--) {
            if (digits[j] > 9) {
                if (j > 0) {
                    digits[j - 1] += digits[j] / 10;
                } else {
                    over = digits[j] / 10;
                }
                digits[j] = digits[j] % 10;
            }
        }
        int[] nums;
        if (over != -1) {
            nums = new int[digits.length + 1];
            nums[0] = over;
            System.arraycopy(digits, 0, nums, 1, digits.length);
        } else {
            nums = new int[digits.length];
            System.arraycopy(digits, 0, nums, 0, digits.length);
        }

        return nums;
    }


    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "z";
        s1.indexOf("af");
        System.out.println(s1.compareTo(s2));
    }

}