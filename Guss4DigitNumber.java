/*
 * チャレンジ：
　　　1.正解は4つの数字（０～９）で設定する
　　　下記処理2～3、繰り返して実行する。
　　　2.回答者に4つの数字を入力してもらう
　　　3.上記処理2で入力された数字を正解と比較し、
　　　　　3.1 値と位置が両方一致する個数、と値のみ一致する個数を出力
　　　　　　　 ⇒例：A1B2
　　　　　3.2 値と位置が両方一致する個数は4の場合、繰り返し処理から抜けで処理終了

 */

import java.util.Random;
import java.util.Scanner;

public class Guss4DigitNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int target[] = new int[4];
		target[0] = rand.nextInt(10);
		target[1] = rand.nextInt(10);
		target[2] = rand.nextInt(10);
		target[3] = rand.nextInt(10);

		System.out.println("準備した数字は: " + target[0] + "" + target[1] + "" + target[2] + "" + target[3]);

		System.out.println("4桁数字を当ててみましょう～");

		while (true) {

			System.out.print("4桁数字を入力してね：");
			String input = sc.next();

			int guss[] = {
					Character.getNumericValue(input.charAt(0)),
					Character.getNumericValue(input.charAt(1)),
					Character.getNumericValue(input.charAt(2)),
					Character.getNumericValue(input.charAt(3))
			};

			System.out.println("入力した数字は: " + guss[0] + "" + guss[1] + "" + guss[2] + "" + guss[3]);

			int valueCrrCounter = 0;
			int valueDigitCrrCounter = 0;

			for (int ig = 0; ig < 4; ig++) {
				for (int it = 0; it < 4; it++) {
					if (guss[ig] == target[it]) {
						if (ig == it) {
							valueDigitCrrCounter++;
							break;
						} else {
							valueCrrCounter++;
						}
					}
				}
			}

			System.out.println("値のみ正解の個数：" + valueCrrCounter);
			System.out.println("桁と値両方正解の個数：" + valueDigitCrrCounter);
			if (valueDigitCrrCounter == 4) {
				System.out.println("正解です。");
				break;
			}

		}

	}
}
