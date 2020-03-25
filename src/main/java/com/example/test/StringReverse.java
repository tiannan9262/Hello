/**
 * 
 */
package algorithm;

/**
 * 字符串原地反转
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月9日 下午4:04:30
 */
public class StringReverse {
	
	public static void reverse(char[] ch) {
		
		int i = 0;
		int j = ch.length - 1;
		char tem = ' ';
		while (i < j) {
			tem = ch[i];
			ch[i] = ch[j];
			ch[j] = tem;
			i++;
			j--;
		}
	}
}
