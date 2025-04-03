import java.util.Scanner;

public class IsBillPaid {
	public static void main(String[] args) {

		int goodsNO[][] = new int[3][4];//自販機の商品リストを作成

		goodsNO[0][0] = 1;
		goodsNO[0][1] = 100;
		goodsNO[0][2] = 500;
		goodsNO[0][3] = 1000;
		goodsNO[1][0] = 5000;
		goodsNO[1][1] = 10000;
		goodsNO[1][2] = 5;
		goodsNO[1][3] = 10;
		goodsNO[2][0] = 15;
		goodsNO[2][1] = 105;
		goodsNO[2][2] = 552;
		goodsNO[2][3] = 0;
		//自販機の商品値段を指定

		Scanner sc = new Scanner(System.in);
		int row = -1;
		int column = -1;

		while (true) {
			System.out.print("商品番号の行番号入力：");
			row = sc.nextInt();

			if (row < goodsNO.length) {//入力問題ないでしたら
				break;
			} else {
				System.out.print("番号がない、やり直してください！");
				//エラーメッセージを提示、入力再度リクエスト
			}
		}

		while (true) {
			System.out.print("商品番号の列番号入力：");
			column = sc.nextInt();

			if (column < goodsNO[0].length) {//入力問題ないでしたら
				break;
			} else {
				System.out.print("番号がない、やり直してください！");
				//エラーメッセージを提示、入力再度リクエスト
			}
		}

		System.out.println("あなたの選んだ商品番号は：" + row + " " + column);
		int price = goodsNO[row][column];
		System.out.println(goodsNO[row][column] + "円を投入してください。");

		System.out.print("お支払い金額入力：");
		int money = sc.nextInt();

		if (price > money) {
			System.out.print("購入失敗");
		} else if (price == money) {
			System.out.print("購入完了、お釣りなし");
		} else {
			int change = money - price;
			System.out.println("購入完了、お釣りは" + change + "円");

			if (change >= 5000) {
				System.out.println("五千円札" + change / 5000 + "枚");
				change %= 5000;
			}
			if (change >= 1000) {
				System.out.println("千円札" + change / 1000 + "枚");
				change %= 1000;
			}
			if (change >= 500) {
				System.out.println("500円コイン" + change / 500 + "枚");
				change %= 500;
			}
			if (change >= 100) {
				System.out.println("100円コイン" + change / 100 + "枚");
				change %= 100;
			}
			if (change >= 50) {
				System.out.println("50円コイン" + change / 50 + "枚");
				change %= 50;
			}
			if (change >= 10) {
				System.out.println("10円コイン" + change / 10 + "枚");
				change %= 10;
			}
			if (change >= 5) {
				System.out.println("5円コイン" + change / 5 + "枚");
				change %= 5;
			}
			if (change >= 1) {
				System.out.println("1円コイン" + change + "枚");
			}

		}

		sc.close();

	}
}