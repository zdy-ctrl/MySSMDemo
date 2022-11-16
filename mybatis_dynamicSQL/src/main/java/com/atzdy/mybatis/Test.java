package com.atzdy.mybatis;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/9/26 21:15
 * @Abstract：
 */
public class Test {
    public static void main(String[] args) {
        // 2 4 6 8
        //t=12
        int t = 12;
        int aIndex = 0;
        int bIndex = 0;
        int a[] = {2, 4, 6, 8};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] + a[j] == t) {
                    aIndex = i;
                    bIndex = j;
                    break;
                }
            }
        }
        System.out.println(aIndex);
        System.out.println(bIndex);
    }
}
