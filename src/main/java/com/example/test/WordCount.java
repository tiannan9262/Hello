/**
 * 
 */
package algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 读取文件 词频统计
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月8日 上午11:10:47
 */
public class WordCount {

	public static void main(String[] args) throws IOException {

		File file = new File("sc.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		Map<String, Integer> map = new HashMap<>();
		String regex = "\t|\r|\n|\"|\\,|\\.|\\:|\\?";
		String result = null;

		while ((result = br.readLine()) != null) {
			// 统一分隔符
			String str = result.replaceAll(regex, " ");
			// 切分字符串得到单词数组
			String[] strArr = str.split(" ");
			for (int i = 0; i < strArr.length; i++) {
				if (strArr[i].equals("")) {
					continue;
				}
				// 已存在该词则词频加一
				if (map.containsKey(strArr[i])) {
					map.put(strArr[i], map.get(strArr[i]) + 1);
				} else {
					// 第一次出现该词
					map.put(strArr[i], 1);
				}
			}
		}

		// 回收物理资源
		br.close();
		fr.close();

		// 遍历哈希表输出结果
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
