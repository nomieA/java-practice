import java.util.Random;
import java.util.Scanner;

public class Guss4DigNumChatGPT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] target = new int[4];
        for (int i = 0; i < 4; i++) {
            target[i] = rand.nextInt(10);
        }//目標配列の生成。

        System.out.println("答えは: " + target[0] + "" + target[1] + "" + target[2] + "" + target[3]);
        System.out.println("4桁数字を当ててみましょう～");

        while (true) {

            System.out.print("4桁数字を入力してね：");
            String input = sc.next();

            if (input.length() != 4) {
                System.out.println("4桁ちょうどで入力してください！");
                continue;
            }

            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = Character.getNumericValue(input.charAt(i));
            }

            int A = 0; // 値と位置が両方一致
            int B = 0; // 値のみ一致

            boolean[] targetUsed = new boolean[4]; // target 側使用済みフラグ
            boolean[] guessUsed = new boolean[4];  // guess 側使用済みフラグ

            // Step 1: まず A を数える（位置も値も一致）
            for (int i = 0; i < 4; i++) {
                if (guess[i] == target[i]) {
                    A++;
                    targetUsed[i] = true;
                    guessUsed[i] = true;
                }
            }

            // Step 2: 次に B を数える（値だけ一致）
            for (int i = 0; i < 4; i++) {
                if (guessUsed[i]) continue;

                for (int j = 0; j < 4; j++) {
                    if (targetUsed[j]) continue;

                    if (guess[i] == target[j]) {
                        B++;
                        targetUsed[j] = true;
                        break;
                    }
                }
            }

            System.out.println("→ 結果：" + A + "A" + B + "B");

            if (A == 4) {
                System.out.println("🎉 正解です！ゲーム終了！");
                break;
            }
        }

        sc.close();
    }
}
