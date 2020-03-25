/**
 * 
 */
package algorithm;

/**
 * 矩阵稳定
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月10日 下午7:11:12
 */
public class StabilityMatrix {

	/** 开始标志 */
	static boolean isStart;

	/**
	 * 调整矩阵为稳定态 返回元素改变数
	 * 
	 * @param matrix
	 * @param row
	 * @param col
	 * @return
	 */
	public static int update_matrix(int[][] matrix, int row, int col) {

		// 重置开始标志
		isStart = true;
		return recursion(matrix, row, col);
	}

	/**
	 * 当前元素是否稳定
	 * 
	 * @param matrix
	 * @param row
	 * @param col
	 */
	public static boolean isStable(int[][] matrix, int row, int col) {

		if (matrix[row][col] == 0) {
			int count = 0;
			if (row < matrix.length - 1 && matrix[row + 1][col] == 1) {
				count++;
			}
			if (row > 0 && matrix[row - 1][col] == 1) {
				count++;
			}
			if (col < matrix.length - 1 && matrix[row][col + 1] == 1) {
				count++;
			}
			if (col > 0 && matrix[row][col - 1] == 1) {
				count++;
			}

			if (count > 2 || isStart) {
				isStart = false;
				matrix[row][col] = 1;
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

	/**
	 * 不稳定时向周围递归
	 * 
	 * @param matrix
	 * @param row
	 * @param col
	 * @return
	 */
	public static int recursion(int[][] matrix, int row, int col) {

		if (isStable(matrix, row, col)) {
			// 四周都有元素
			if (row > 0 && row < matrix.length && col > 0 && col < matrix.length - 1) {
				return 1 + recursion(matrix, row + 1, col) + recursion(matrix, row - 1, col)
						+ recursion(matrix, row, col + 1) + recursion(matrix, row, col - 1);
			}
			// 右上边界
			if (row == 0 && col == matrix.length - 1) {
				return 1 + recursion(matrix, row + 1, col) + recursion(matrix, row, col - 1);
			}
			// 右下边界
			if (row == matrix.length - 1 && col == matrix.length - 1) {
				return 1 + recursion(matrix, row - 1, col) + recursion(matrix, row, col - 1);
			}
			// 左下边界
			if (row == matrix.length - 1 && col == 0) {
				return 1 + recursion(matrix, row - 1, col) + recursion(matrix, row, col + 1);
			}
			// 左上边界
			if (row == 0 && col == 0) {
				return 1 + recursion(matrix, row + 1, col) + recursion(matrix, row, col + 1);
			}
			// 上边界
			if (row == 0 && col > 0 && col < matrix.length - 1) {
				return 1 + recursion(matrix, row + 1, col) + recursion(matrix, row, col + 1)
						+ recursion(matrix, row, col - 1);
			}
			// 右边界
			if (row > 0 && row < matrix.length - 1 && col == matrix.length - 1) {
				return 1 + recursion(matrix, row + 1, col) + recursion(matrix, row - 1, col)
						+ recursion(matrix, row, col - 1);
			}
			// 下边界
			if (row == matrix.length - 1 && col > 0 && col < matrix.length - 1) {
				return 1 + recursion(matrix, row - 1, col) + recursion(matrix, row, col + 1)
						+ recursion(matrix, row, col - 1);
			}
			// 左边界
			if (row > 0 && row < matrix.length - 1 && col == 0) {
				return 1 + recursion(matrix, row + 1, col) + recursion(matrix, row - 1, col)
						+ recursion(matrix, row, col + 1);
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 0, 0, 1, 1, 0 }, { 0, 1, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0, 0 }, { 0, 1, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 0, 1 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int num = update_matrix(matrix, 2, 2);
		System.out.println(num);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
