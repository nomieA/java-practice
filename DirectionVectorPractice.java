
public class DirectionVectorPractice {

	// printBoard(2次元配列の名前)⇒打印棋盘
	public static void printBoard(int board[][]) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {

		int[][] board = new int[10][10];
		printBoard(board);
		System.out.println();

		// 原点
		int x = 5, y = 5;
		board[x][y] = 9;

		// 方向向量（向右）
		int dx = 0;
		int dy = 1;

		// 向右走四步，沿途填入 1
		for (int step = 1; step <= 4; step++) {
			int nx = x + dx * step;
			int ny = y + dy * step;

			// 判断是否越界
			if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length) {
				board[nx][ny] = 1;
			}
		}
		printBoard(board);

	}

}
