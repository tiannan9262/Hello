/**
 * 
 */
package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 合数分解
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月9日 下午1:12:12
 */
public class Prime {
	
	public static void search(int n) {
		
		List<Integer> list = new ArrayList<>();
		
		int i = 2;
		while (n >= 2) {
			if (n % i == 0) {
				list.add(i);
				n = n / i;
				i = 2;
			} else {
				i++;
			}
		}
		
		for (Integer prime : list) {
			System.out.print(prime + " ");
		}
	}
}
