import java.util.Scanner;

public class GomokuMine {

	//inBounds:値は碁盤の範囲内か？
	public static boolean inBounds(int[][] board, int x, int y) {
		return x >= 0 && x < board.length &&
				y >= 0 && y < board[0].length;
	}

	//getValidMove：入力値は碁盤の範囲内か？
	public static int[] getValidMove(Scanner sc, int[][] board) {
		int row, col;
		while (true) {
			row = sc.nextInt();
			col = sc.nextInt();
			if (inBounds(board, row, col) && board[row][col] == 0) {//确保既没超出边界，也没落在已有棋子上
				return new int[] { row, col }; // 返回一组合法坐标
			} else {
				System.out.println("Out of board. Place your stone again.");
			}
		}
	}

	//printBoard：碁盤の出力
	public static void printBoard(int[][] board) {
		int R = board.length;
		int C = board[0].length;

		// 横座標
		System.out.print("   "); // 左上空白位置
		for (int coordX = 0; coordX < C; coordX++) {
			System.out.print(" " + coordX);
		}
		System.out.println();

		// 棋盤内容 + 縱座標
		for (int i = 0; i < R; i++) {
			System.out.print(" " + i); // 行頭の縦座標
			if (i < 10)
				System.out.print(" "); // 對齊補空格
			for (int j = 0; j < C; j++) {
				if (board[i][j] == 1) {
					System.out.print("●");
				} else if (board[i][j] == 10) {
					System.out.print("○");
				} else {
					System.out.print("※");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int R = 10;
		final int C = 10;

		int num[][] = new int[R][C];

		printBoard(num);

		boolean isFP = true;
		int row, col;

		out: while (true) {
			if (isFP) {
				System.out.println("First player place the stone.");
				int[] move = getValidMove(sc, num);
				row = move[0]; // ✅ 保存
				col = move[1]; // ✅ 保存
				num[move[0]][move[1]] = isFP ? 1 : 10;
				printBoard(num);

				isFP = false;

			} else {
				System.out.println("Second player place the stone.");
				int[] move = getValidMove(sc, num);
				row = move[0]; // ✅ 保存
				col = move[1]; // ✅ 保存
				num[move[0]][move[1]] = isFP ? 1 : 10;
				printBoard(num);

				isFP = true;
			}

			//着手点のから、横座標-2から+2、縦、斜めの値を走査する
			//そのためには、各方向の最大連珠可能域を確認
			//つまり、r+2 r-2 c+2 c-2 の値はinBoundsで確認
			if (inBounds(num, row + 2, col + 2) && inBounds(num, row - 2, col - 2)) {
				for (int i = row - 2; i < row + 2; i++) {
					int sum = 0;
					sum += num[i][col];
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
