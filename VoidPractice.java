
public class VoidPractice {

	public static void print(int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int m = 0; m < y; m++) {
				System.out.print("☥");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		print(5, 2);
	}

}
