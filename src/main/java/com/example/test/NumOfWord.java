/**
 * 
 */
package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 字符串词频统计 根据词频取子串
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月12日 下午2:46:48
 */
public class NumOfWord {

	public static void getWordByNum(int num, char[] ch) {

		Map<Character, Integer> map = new HashMap<>();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == num) {
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args) {

		char[] ch = { 'a', 'b', 'a', 'c', 'c', 'd', 'e', 'f', 'f' };
		getWordByNum(2, ch);
	}

}
