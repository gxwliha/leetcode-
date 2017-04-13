package com.example.gxw.myapplication;

/**
 * Created by GXW on 2017/4/13.
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
