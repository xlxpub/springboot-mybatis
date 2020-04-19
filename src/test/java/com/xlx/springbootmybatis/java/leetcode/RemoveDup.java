package com.xlx.springbootmybatis.java.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author xueleixi
 * @date 2018/8/10 下午4:46
 */
public class RemoveDup {

    //重复元素放到后面
    public int process(int[] nums) {
        int l = 0;
        for (int i = 0; i < nums.length; i++) {

            boolean dup = false;
            for (int j = 0; j < l; j++) {
                if (nums[i] == nums[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                swap(nums, l, i);
                binaryInsert(nums, l);
                l++;
            }
        }

        return l;
    }

    //数字均不相等
    public void binaryInsert(int[] nums, int pos) {
        int mid = 0;
        for (int l = 0, r = pos - 1; l <= r; ) {
            mid = (l + r) / 2;
            if (nums[mid] > nums[pos]) {
                r = Math.max(mid - 1, 0);
            } else {
                l = Math.min(mid + 1, nums.length);
            }
//            System.out.println("l="+l+",r="+r);
        }
        int sl = -1;
//        System.out.println("mid="+mid+",post="+pos);
        if (nums[mid] < nums[pos]) {
            sl = mid + 1;
        } else {
            sl = mid;
        }
        for (int p1 = pos; p1 > sl; p1--) {
            swap(nums, p1, p1 - 1);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    @Test
    public void testBinaryInsert() {
        int[] nums = {1, 3, 5, 6, 7, 4};
        RemoveDup dup = new RemoveDup();
        dup.binaryInsert(nums, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void testProcess() {
        int[] nums = {1, 3, 3, 1, 5, 7, 5, 6, 7, 4};
        RemoveDup dup = new RemoveDup();
        dup.process(nums);
        System.out.println("ret:"+Arrays.toString(nums));
    }

}
