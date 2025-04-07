import java.util.Scanner;

public class IsPassed0407Q1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score = 0;
		score = sc.nextInt();

		if (score >= 90 && score <= 100) {
			System.out.println("優秀");
		} else if (score >= 80 && score < 90) {
			System.out.println("良い");
		} else if (score >= 70 && score < 80) {
			System.out.println("普通");
		} else if (score >= 60 && score < 70) {
			System.out.println("合格");
		} else if (score < 60) {
			System.out.println("不合格");
		}

		sc.close();

		
	}
}
