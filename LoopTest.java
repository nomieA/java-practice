import java.util.Random;

public class LoopTest {

	public static void main(String[] args) {

		
		Random rand = new Random();
		//乱数クリエイターを作る
		
		
		int xSize = rand.nextInt(9)+1, ySize = rand.nextInt(9)+1, zSize = rand.nextInt(9)+1;
		//先に、3D配列のサイズを変数で指定する；
		System.out.println(String.format("[%d][%d][%d]", xSize, ySize, zSize));
		
		
		
		long[][][] array3D = new long[xSize][ySize][zSize];
		//長整数型三次元配列array3Dを宣言する。
		//その長さは、先に宣言した変数で決める。

		for (int x = 0; x < xSize; x++) {
			for (int y = 0; y < ySize; y++) {
				for (int z = 0; z < zSize; z++) {
		//或る０から始まる変数ｘｙｚを
					array3D[x][y][z] //3D配列array3Dのインデックスに代入する
							= rand.nextInt(1000); // 0〜999 のランダム
				}
			}
		}
		



		long max = Long.MIN_VALUE;
		String maxIndex = "";

		for (int counterX = 0; counterX < array3D.length; counterX++) {//

			for (int counterY = 0; counterY < array3D[0].length; counterY++) {

				for (int counterZ = 0; counterZ < array3D[0][0].length; counterZ++) {

					if (array3D[counterX][counterY][counterZ] > max) {
						max = array3D[counterX][counterY][counterZ];
						maxIndex = String.format("[%d][%d][%d]", counterX, counterY, counterZ);
					}

					System.out.println("[" + counterX + "][" + counterY + "][" + counterZ + "] = "
							+ array3D[counterX][counterY][counterZ]);

				}

			}

		}

		System.out.println("最大値は" + maxIndex + "にいる" + max + "です。");

		System.out.println('\n' + "拡張forで再検証：\n");

		long maxCheck = Long.MIN_VALUE;
		String currentIndex = "";		
		String maxIndexCheck = "";

		
		int counterXCheck = 0, counterYCheck = 0, counterZCheck = 0;

		for (long[][] array2D : array3D) {
			for (long[] array1D : array2D) {
				for (long arrayElement : array1D) {

					currentIndex = String.format("[%d][%d][%d]", counterXCheck, counterYCheck, counterZCheck);
					System.out.print(currentIndex);
					System.out.println(" = " + arrayElement);

					counterZCheck++;
					if (counterZCheck == (int) array3D[counterXCheck][counterYCheck].length) {
						counterZCheck = 0;

						counterYCheck++;
						if (counterYCheck == (int) array3D[counterXCheck].length) {
							counterYCheck = 0;

							counterXCheck++;
							if (counterXCheck == (int) array3D.length) {
								counterXCheck = 0;
								
							}

						}

					}

					if (arrayElement > maxCheck) {
						maxCheck = arrayElement;
						maxIndexCheck = currentIndex;

					}

				}

			}
		}
		System.out.println('\n' + "拡張forで再検証の最大値は" + maxIndexCheck + "にいる" + maxCheck + "です。");

	}
}
