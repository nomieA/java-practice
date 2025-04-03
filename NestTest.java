import java.util.Scanner;

public class NestTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("検証したい数字を入力してください：");

		int num = sc.nextInt();

		if (0 < num && num < 100) {
			System.out.print("numの値は0より大きいかつ100より小さい");
			if (num % 2 == 0) {
				System.out.print("偶数");
			} else {
				System.out.print("奇数");

			}
		}

	}
}