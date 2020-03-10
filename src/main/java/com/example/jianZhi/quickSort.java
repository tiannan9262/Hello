package com.example.jianZhi;

public class quickSort {
    public static void QuickSort(int[] array,int low,int high){
        int i,j,temp,t;
        if (low>high){
            return;
        }
        i = low;                                // i在最左边
        j = high;                               // j在最右边
        temp = array[low];                      // 设立基准位
        while (i < j) {
            while (temp <= array[j] && i < j)   // 从最右边开始向左，找到第一个小于temp的数组元素
            {
                j --;
            }
            while (temp >= array[i] && i < j){  // 从最左边开始向右，找到第一个大于temp的数组元素
                i ++;
            }
            if (i < j){                         // 如果此时i < j，则交换两元素位置
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        array[low] = array[i];                  // 交换此时的array[i]和基准数
        array[i] = temp;                        // 交换后基准数左边都是比基准数小的数字，右边都是比基准数大的数字
        QuickSort(array,low,j-1);         // 递归排序基准数左边的数组
        QuickSort(array,j+1,high);         // 递归排序基准数右边的数组
    }

    public static void main(String[] args) {

    }
}
