/**
 * 
 */
package algorithm;

/**
 * 某日期在该年中是第几天
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月9日 上午11:18:37
 */
class Date {

	int year;
	int month;
	int day;

	int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
}

public class DayInYear {

	public int getDayNum(Date date) {

		// 天数
		int sum = 0;

		// 是否为闰年
		if (date.year % 400 == 0 || (date.year % 100 != 0 && date.year % 4 == 0)) {
			date.months[2] = 29;
		}
		// 累加当前月之前
		for (int i = 0; i < date.month; i++) {
			sum = sum + date.months[i];
		}
		// 加上当前月天数
		sum = sum + date.day;

		return sum;
	}
}
