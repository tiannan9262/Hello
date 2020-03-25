/**
 * 
 */
package algorithm;

/**
 * 带分隔符的子串判断
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月7日 下午8:14:01
 */
public class Split {

	public static boolean isExist(String mainStr, String patternStr, char split) {

		char[] mainCh = mainStr.toCharArray();
		char[] patternCh = patternStr.toCharArray();
		// 主串指针
		int i = 0;
		// 字串指针
		int j = 0;

		while (i < mainStr.length()) {
			if (mainCh[i] == patternCh[j]) {
				// 该位匹配 准备比较下一位
				i++;
				j++;
			} else {
				// 该位失配
				// j 回退
				j = 0;
				// i 移动至下一分隔符处或者已遍历完主串
				while (mainCh[i] != split && i < mainStr.length() - 1) {
					i++;
				}
				i++;
			}

			// 子串匹配 判断子串是否完整
			if (j == patternStr.length()) {
				// 判断当前的 i 是否为分割符或者这是最后一个子串
				if (i == mainStr.length() || mainCh[i] == split) {
					// 完全匹配
					break;
				} else {
					// 只是部分匹配 当作失配处理
					j = 0;
					while (mainCh[i] != split && i < mainStr.length() - 1) {
						i++;
					}
					i++;
				}
			}
		}

		if (j >= patternStr.length()) {
			return true;
		} else {
			return false;
		}
	}

}
