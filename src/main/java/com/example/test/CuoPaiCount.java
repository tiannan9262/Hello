/**
 * 
 */
package algorithm;

/**
 * 错排问题
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月8日 上午11:35:33
 */
public class CuoPaiCount {

	public static int getCuoPaiNum(int n) {

		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return (n - 1) * (getCuoPaiNum(n - 1) + getCuoPaiNum(n - 2));
		}
	}

}
