package com.example.gxw.myapplication;

/**
 * Created by GXW on 2017/4/13.
 */
 /*题目：
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?


思路：
直接排序或对比，时间复杂度一定在nlogn以上。利用Hash表或者Bitmap可以满足时间复杂度但是空间复杂度不能满足。
O(n)时间类能采用的办法只有异或。
 
 */

public class SingleNumber {
    public static void main(String args[]) {
        int a[]={1,1,2,2,5,5,3,3,7,7,19,19,8,8,12,16,16};
        for (int i=1;i<a.length;i++) {
            a[i]^=a[i-1];
        }
        System.out.println(a[a.length-1]);
    }
}
