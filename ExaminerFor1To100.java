
public class ExaminerFor1To100 {

	public static void main(String[] args) {

		//System.out.println("1から100までの数字に：");

		int evenCounter = 0;
		int[] even = new int[100];
		int oddCounter = 0;
		int[] odd = new int[100];
		int commonDivisor3and5Counter = 0;
		int[] commonDivisor3and5 = new int[20];

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {

				even[evenCounter] = i;//奇数配列に、テスト数字を代入；
				evenCounter++;

				if (i % 3 == 0 && i % 5 == 0) {
					commonDivisor3and5[commonDivisor3and5Counter] = i;
					commonDivisor3and5Counter++;
				}

			} else {

				odd[oddCounter] = i;//偶数配列に、テスト数字を代入；
				oddCounter++;

				if (i % 3 == 0 && i % 5 == 0) {
					commonDivisor3and5[commonDivisor3and5Counter] = i;
					commonDivisor3and5Counter++;

				}

			}

		}

		System.out.print("奇数は");

		int cO = 0;

		while (cO < oddCounter) {
			System.out.print(odd[cO] + "、");
			cO++;
		}

		System.out.println("合計" + oddCounter + "個。" + "\n");

		System.out.print("偶数は");

		int cE = 0;

		while (cE < evenCounter) {
			System.out.print(even[cE] + "、");
			cE++;
		}

		System.out.println("合計" + evenCounter + "個。" + "\n");

		System.out.print("3と5の公倍数は");
		int cM = 0;
		while (cM < commonDivisor3and5Counter) {
			System.out.print(commonDivisor3and5[cM] + "、");
			cM++;
		}
		System.out.println("合計：" + commonDivisor3and5Counter + "個。");

	}

}
