import java.util.Scanner;

public class FourArithmeticOperations {

	public static double sum(double left, double right) {
		double sum = left + right;
		return sum;
	}

	public static double sub(double left, double right) {
		double sub = left - right;
		return sub;
	}

	public static double multi(double left, double right) {
		double multi = left * right;
		return multi;
	}

	public static double divi(double left, double right) {
		double divi = left / right;
		return divi;
	}

	public static double mod(double left, double right) {
		double mod = left % right;
		return mod;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("四則計算の算式を入力してね。数字と演算子の間に空白をいれわすれないでね（例：3 + 2）。");
		String expression = sc.nextLine().trim(); // 读取一整行

		// 用空格分隔：3 > 2 → ["3", ">", "2"]
		String[] parts = expression.split(" ");

		if (parts.length != 3) {
			System.out.println("入力形式が違うよ！");
			return;
		}

		double left = Double.parseDouble(parts[0]); // 左边数字
		String sign = parts[1]; // 运算符
		double right = Double.parseDouble(parts[2]); // 右边数字
		double result = 0.0;

		if (sign.equals("+")) {
			result = sum(left, right);
		} else if (sign.equals("-")) {
			result = sub(left, right);
		} else if (sign.equals("*")) {
			result = multi(left, right);
		} else if (sign.equals("/")) {
			result = divi(left, right);
		} else if (sign.equals("%")) {
			result = mod(left, right);
		}

		System.out.println(result);
	}
}
