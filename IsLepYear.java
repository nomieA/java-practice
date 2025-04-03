import java.util.Scanner;

public class IsLepYear {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("検証したい年数字を入力してください：");

		int year = sc.nextInt();

		System.out.println("if一行で検証すると、");
		
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("\n" + year + "は閏年です。");
		} else {
			System.out.println(year + "は閏年ではありません。");
		}

		System.out.println("\n" + "if、if elseで検証すると、");
		
		if (year % 400 == 0) {
			System.out.print("\n" + year + "は閏年です。");
		}	else if (year % 4 == 0) {
				if (year % 100 != 0) {
					System.out.print("\n" + year + "は閏年です。");
				
		}
		}else {
			System.out.print(year + "は閏年ではありません。");
		}
			
		
		
		
	}
}