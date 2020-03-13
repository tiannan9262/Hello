package com.example.jianZhi;

public class quickSort {
    public static void QuickSort(int[] array,int left,int right){
        int i,j,base;
        if (left>right){
            return;
        }
        i = left;                                // i在最左边
        j = right;                               // j在最右边
        base = array[left];                      // 设立基准位
        while (i != j) {
            while (base <= array[j] && i < j)   // 从最右边开始向左，找到第一个小于base的数组元素
            {
                j --;
            }
            while (base >= array[i] && i < j){  // 从最左边开始向右，找到第一个大于base的数组元素
                i ++;
            }
            if (i < j){                         // 如果此时i < j，则交换两元素位置
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[left] = array[i];                  // 交换此时的array[i]和基准数
        array[i] = base;                        // 交换后基准数左边都是比基准数小的数字，右边都是比基准数大的数字
        QuickSort(array,left,i-1);         // 递归排序基准数左边的数组
        QuickSort(array,i+1,right);         // 递归排序基准数右边的数组
    }

    public static void main(String[] args) {

    }
}
