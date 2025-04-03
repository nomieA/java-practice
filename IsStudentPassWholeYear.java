import java.util.Scanner;

public class IsStudentPassWholeYear {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("中間試験の点数を入力してください:");
		double MidScore = sc.nextDouble();

		System.out.print("期末試験の点数を入力してください:");
		double FinalScore = sc.nextDouble();

		
		if ( MidScore >= 60 && FinalScore >= 60) {
			System.out.print("合格です。おめでとうございます。");
		} else if ( MidScore + FinalScore >= 130) {
				System.out.print("合格です。おめでとうございます。");
		} else if ((MidScore >= 90 || FinalScore>=90)
				    && MidScore + FinalScore >= 100){
				System.out.print("合格です。おめでとうございます。");
		} else { 
			System.out.print("不合格です。おめでとうございます。");

		}

	}
}