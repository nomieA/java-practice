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
		}

	}

}
