/**
 * 
 */
package algorithm;

/**
 * 字符串替换
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月11日 下午12:39:49
 */
public class KMP_StringReplace {

	/**
	 * 得到模式对应的 next 数组
	 * 
	 * @param P
	 * @return
	 */
	public static int[] GetNext(char[] P) {

		// 初始化 next 数组
		int[] next = new int[P.length];
		// 当前失配点的前一位置
		int j = 0;
		// 规定当 j = 0 时 n0 = -1
		next[0] = -1;
		// *
		int k = -1;

		while (j < P.length - 1) {
			if (k == -1 || P[j] == P[k]) {
				j++;
				k++;
				next[j] = k;
			} else {
				k = next[k];
			}
		}
		return next;
	}

	/**
	 * KMP 模式匹配算法
	 * 
	 * @param S   主串
	 * @param P   模式
	 * @param pos 偏移量
	 * @return
	 */
	public static int Index_KMP(char[] S, char[] P, int pos) {

		// 得到当前模式的 next 数组
		int[] next = GetNext(P);
		// 偏移量
		int i = pos - 1;
		// 目标指针 无回溯
		int j = 0;
		while (i < S.length && j < P.length) {
			if (j == -1 || S[i] == P[j]) {
				// 匹配 比较下一位
				i++;
				j++;
			} else {
				// 失配 i不变 j后退
				j = next[j];
			}
		}
		if (j >= P.length) {
			return (i - P.length);
		} else {
			return -1;
		}
	}

	/**
	 * 替换字符串
	 * 
	 * @param s      主串
	 * @param p      模式
	 * @param pos    偏移量
	 * @param target 替换目标
	 * @return
	 */
	public static char[] replace_string(char s[], char p[], int pos, char target[]) {

		// 模式匹配 判断替换目标串是否在主串中存在
		int index = Index_KMP(s, p, pos);

		if (index == -1) {
			// 不存在能替换的字串 返回主串
			return s;
		} else {
			// 存在能替换的字串 则拼接好新字符串然后返回
			char[] res = new char[s.length - p.length + target.length];
			// 当前主串操作位
			int sPos = 0;
			// 当前目标串操作位
			int tPos = 0;
			
			while (sPos < index) {
				res[sPos] = s[sPos];
				sPos++;
			}
			for (int i = index; i < index + target.length; i++) {
				res[i] = target[tPos];
				tPos++;
			}
			for (int i = index + target.length; i < res.length; i++) {
				res[i] = s[sPos];
				sPos++;
			}

			return res;
		}
	}

	public static void main(String[] args) {

		char[] s = { 'a', 'b', 'a', 'd', 'e', 'e', 'f' };
		char[] p = { 'd', 'e', 'e' };
		char[] target = { 'c', 'c', 'c' };
		
		char[] res = replace_string(s, p, 1, target);
		
		for (char c : res) {
			System.out.print(c + " ");
		}

	}
}
