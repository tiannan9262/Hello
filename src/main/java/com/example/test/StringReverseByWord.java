/**
 * 
 */
package algorithm;

/**
 * 反转句子中单词的顺序
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月12日 下午2:58:05
 */
public class StringReverseByWord {

	/**
	 * 原地反转一个字符串的指定子串
	 * 
	 * @param ch
	 */
	public static void reverse(char[] ch, int start, int len) {

		int i = start;
		int j = start + len - 1;
		char tmp = ' ';
		while (i < j) {
			tmp = ch[i];
			ch[i] = ch[j];
			ch[j] = tmp;
			i++;
			j--;
		}
	}

	/**
	 * 以单词为单位反转一个句子
	 * 
	 * @param ch
	 */
	public static void reverseAll(char[] ch) {

		// 当前待反转单词长度
		int len = 0;

		// 将整个句子反转
		reverse(ch, 0, ch.length);
		// 遍历寻找每一个单词
		for (int i = 0; i < ch.length; i++) {
			// 如果找到一个单词
			if (ch[i] == ' ') {
				// 将单词再次反转恢复原顺序
				reverse(ch, i - len, len);
				// 重置下一个待查找单词的长度
				len = 0;
			} else {
				// 假如未遍历至分隔符 当前单词长度加一
				len++;
			}
		}
		// 反转最后一个单词
		reverse(ch, ch.length - len, len);
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {

		char[] ch = { 'h', 'e', 'l', 'l', 'o', ' ', 'm', 'y', ' ', 'f', 'r', 'i', 'e', 'n', 'd' };

		for (char c : ch) {
			System.out.print(c);
		}

		reverseAll(ch);
		System.out.println();

		for (char c : ch) {
			System.out.print(c);
		}
	}

}
