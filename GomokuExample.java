import java.util.Scanner;

public class GomokuExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int R = 10;
		final int C = 10;

		int num[][] = new int[R][C];

		boolean isFP = true;
		int row, col;

		out: while (true) {
			if (isFP) {
				System.out.println("First player place the stone.");

				row = sc.nextInt();
				col = sc.nextInt();

				num[row][col] = 1;
				isFP = false;

			} else {
				System.out.println("Second player place the stone.");
				row = sc.nextInt();
				col = sc.nextInt();
				num[row][col] = 10;
				isFP = true;
			}

			//全体表示
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {

					if (num[i][j] == 1) {
						System.out.print("●");
					} else if (num[i][j] == 10) {
						System.out.print("○");
					} else {
						System.out.print("※");
					}
				}
				System.out.println();
			}

			//横判定
			for (int i = 0; i < R; i++) {
				for (int j = 0; j <= C - 5; j++) {
					int sum = 0;
					for (int m = 0; m < 5; m++) {
						sum += num[i][j + m];

					}
					if (sum == 5) {
						System.out.println("First player win.");
						break out;
					}
					if (sum == 50) {
						System.out.println("Second player win");
						break out;
					}
				}

			}
			//縦判定
			for (int i = 0; i < R - 5; i++) {//行0から、行5まで走査する
				for (int j = 0; j <= C; j++) {//列0から、列9まで走査する
					int sum = 0;//配列にいる値の合計を宣言する
					for (int m = 0; m < 5; m++) {//走査対象num[i][j]のj+m列、言わば対象の下5列の値を走査する
						sum += num[i + m][j];//合計値を更新する
					}
					if (sum == 5) {
						System.out.println("First player win.");
						break out;
					}
					if (sum == 50) {
						System.out.println("Second player win");
						break out;
					}
				}

			} //斜め＼判定、目標の右下にいる値を判定する
			for (int i = 0; i < R - 5; i++) {
				for (int j = 0; j <= C - 5; j++) {
					int sum = 0;
					for (int m = 0; m < 5; m++) {
						sum += num[i + m][j + m];
					}
					if (sum == 5) {
						System.out.println("First player win.");
						break out;
					}
					if (sum == 50) {
						System.out.println("Second player win");
						break out;
					}
				}

			} //斜め／判定、目標の右上の値を判定
			for (int i = 4; i < R; i++) {
				for (int j = 0; j <= C - 4; j++) {
					int sum = 0;
					for (int m = 0; m < 5; m++) {
						sum += num[i - m][j + m];
					}
					if (sum == 5) {
						System.out.println("First player win.");
						break out;
					}
					if (sum == 50) {
						System.out.println("Second player win");
						break out;
					}
				}

			}

		}
	}
}
