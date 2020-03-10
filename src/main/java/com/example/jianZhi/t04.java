package com.example.jianZhi;

public class t04 {
    public static void main(String[] args) {

        SolutionT4 solutionT4 = new SolutionT4();
        int[][] a = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean numberIn2DArray = solutionT4.findNumberIn2DArray(a, 25);
        if (numberIn2DArray){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}

// 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
// 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

class SolutionT4 {

    // 二叉树遍历全表

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int row =0,column = columns - 1;row < rows && column >= 0;){
            if (matrix[row][column] == target)
                return true;
            else if (matrix[row][column] > target)
                column --;
            else
                row ++;
        }
        return false;
    }
}
