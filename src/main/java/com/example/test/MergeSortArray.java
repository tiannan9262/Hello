/**
 * 
 */
package algorithm;

/**
 * 合并两个已排序的数组
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月11日 上午11:51:27
 */
public class MergeSortArray {

	public static int[] merge(int[] a, int[] b) {

		// 两数组长度
		int m = a.length;
		int n = b.length;
		// a 数组指针
		int i = 0;
		// b 数组指针
		int j = 0;
		// 结果集
		int[] res = new int[m + n];
		// 结果集当前长度
		int pos = 0;

		// 假如两数组都未遍历完
		while (i < m && j < n) {
			// 总是取当前较小的放入结果集
			if (a[i] <= b[j]) {
				res[pos] = a[i];
				i++;
				pos++;
			} else {
				res[pos] = b[j];
				j++;
				pos++;
			}
		}

		// 判断哪个数组未遍历完 将其剩下元素追加到结果集
		if (i < m) {
			for (int k = i; k < m; k++) {
				res[pos] = a[k];
				pos++;
			}
		}

		if (j < n) {
			for (int k = j; k < n; k++) {
				res[pos] = b[k];
				pos++;
			}
		}

		return res;
	}

	public static void main(String[] args) {

		int[] num1 = { 1, 2, 36, 98, 103};
		int[] num2 = { 2, 25, 44 };
		
		int[] merge = merge(num1, num2);
		
		for (int i : merge) {
			System.out.print(i + " ");
		}

	}

}
