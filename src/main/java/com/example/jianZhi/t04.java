package com.example.jianZhi;

public class t04 {
    public static void main(String[] args) {

    }
}
class SolutionT4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]){
            return false;
        }
        int l = 0;
        int m = 0;
        if (matrix.length > matrix[0].length){
            l = matrix[0].length;
            m = matrix.length;
        }
        else {
            m = matrix[0].length;
            l = matrix.length;
        }
        for (int i = 0;i < l;i ++){
            if (target >= matrix[i][i] && target <= matrix[i+1][i+1]){

            }
        }
        return false;
    }
}
