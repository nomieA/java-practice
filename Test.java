import java.util.Scanner;

public class 	Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("論理式を入力してね（例：3 > 2）:");
        String expression = sc.nextLine().trim();  // 读取一整行

        // 用空格分隔：3 > 2 → ["3", ">", "2"]
        String[] parts = expression.split(" ");

        if (parts.length != 3) {
            System.out.println("入力形式が違うよ！");
            return;
        }

        int left = Integer.parseInt(parts[0]);  // 左边数字
        String op = parts[1];                   // 运算符
        int right = Integer.parseInt(parts[2]); // 右边数字

        boolean result = false;

        switch (op) {
            case ">": result = left > right; break;
            case "<": result = left < right; break;
            case "==": result = left == right; break;
            case "!=": result = left != right; break;
            case ">=": result = left >= right; break;
            case "<=": result = left <= right; break;
            default:
                System.out.println("未対応の演算子だよ！");
                return;
        }

        System.out.println("判断結果は：" + result);
    }
}
