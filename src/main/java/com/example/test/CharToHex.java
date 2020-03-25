/**
 * 
 */
package algorithm;

/**
 * char 字符转 16 进制表示
 *
 * @author xzq ^^
 * 
 * @Date 2020年3月10日 上午11:41:47
 */
public class CharToHex {

	// 16 进制位
	private static final char[] HEX_CHAR = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
			'F' };

	public static void dump_file(char[] ch) {

		// char 双字节 byte 单字节 定义双倍长度
		byte[] buffer = new byte[ch.length * 2];

		// char 数组转 byte 数组
		for (int i = 0; i < ch.length; i++) {
			// 分别取前后八位 直接强转 byte 则取后八位 会损失前八位数据
			buffer[2 * i] = (byte) ((ch[i] & 0xFF00) >> 8);
			buffer[2 * i + 1] = (byte) (ch[i] & 0xFF);
		}

		// byte 单字节 8 位 每个 byte 对应两个 16 进制位
		char[] res = new char[buffer.length * 2];
		// byte 做加法结果转成 int 故定义为 int 型
		int tmp = 0;

		// byte 转 16 进制表示
		for (int i = 0; i < buffer.length; i++) {
			// 取后八位时可能符号位为 1 负数用补码表示
			if (buffer[i] < 0) {
				tmp = buffer[i] + 256;
			} else {
				tmp = buffer[i];
			}

			// 转成 16 进制表示
			res[2 * i] = HEX_CHAR[tmp / 16];
			res[2 * i + 1] = HEX_CHAR[tmp % 16];
		}

		// 两两打印
		for (int i = 0; i < res.length; i += 2) {
			System.out.print("" + res[i] + res[i + 1] + " ");
		}
	}

	public static void main(String[] args) {

		char[] c = { '你', '好' };
		dump_file(c);

//		for (int j = 0; j < c.length; j++) {
//			String hexString = Integer.toHexString(c[j]);
//			System.out.println(hexString);
//		}

	}
}
