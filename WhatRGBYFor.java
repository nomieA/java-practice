
/*目標はRGBYの数値を計算する。
 * RGYは頭数値から、0ではない。
 * Bの範囲は0～9まで、RGYは1から9まで。
 * 
 *  YBBG
 *  GRYY
 * +YRYR
 * ======
 *  RGYY
 */

public class WhatRGBYFor {

	public static void main(String[] args) {

		for (int y = 1; y < 10; y++) {
			for (int g = 1; g < 10; g++) {
				for (int r = 1; r < 10; r++) {
					for (int b = 0; b < 10; b++) {

						int p1 = y * 1000 + b * 100 + b * 10 + g;
						int p2 = g * 1000 + r * 100 + y * 10 + y;
						int p3 = y * 1000 + r * 100 + y * 10 + r;
						int p4 = r * 1000 + g * 100 + y * 10 + y;

						if (p1 + p2 + p3 == p4) {
							System.out.println(String.format("yellow=%d,green=%d,blue=%d,red=%d", y, g, b, r));
						}
					}
				}
			}
		}
	}

}
