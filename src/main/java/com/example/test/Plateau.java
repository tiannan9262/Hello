/**
 * 
 */
package algorithm;

/**
 * 最长平台
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月9日 下午4:11:55
 */
public class Plateau {

	public static void maxPlateau(int[] num) {

		// 当前平台长度
		int count = 1;
		// 最长平台元素值
		int pos = 0;
		// 最长平台长度
		int max = 0;

		for (int i = 1; i < num.length; i++) {
			if (num[i] == num[i - 1]) {
				count++;
			} else if (num[i] != num[i - 1] && count > max) {
				max = count;
				pos = num[i - 1];
				count = 1;
			} else {
				count = 1;
			}
		}

		System.out.println(pos + " " + max);
	}
}
