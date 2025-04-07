import java.util.Random;
import java.util.Scanner;

public class GussNum1to100 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int aim = rd.nextInt(101);
		System.out.println(aim);


		big: while (true) {

			System.out.println("範囲を入力してね");
			System.out.print("最小値は：");

			int min = 0, max = 0;

			while (true) {
				int minInput = sc.nextInt();
				if (minInput >= 0 && minInput <= 100) {
					min = minInput;
					break;
				}
				System.out.println("入力し直してくれ：");
			}

			System.out.print("最大値は：");
			while (true) {
				int maxInput = sc.nextInt();
				if (maxInput >= 0 && maxInput <= 100 && maxInput >= min) {
					max = maxInput;
					break;
				}
				System.out.println("入力し直してくれ：");
			}

			while (true) {

				if (aim == min && aim == max) {
					System.out.println("正解。" + "\n");
					sc.close();
					break;

				} else if (aim < max && aim > min) {
					System.out.println("正解はこの間です。" + "\n");
					break;
				} else if (aim >= max) {
					System.out.println("正解はより大きい。" + "\n");
					break;
				} else if (aim <= min) {
					System.out.println("正解はより小さい。" + "\n");
					break;

				}

			}

		}
	}

}
