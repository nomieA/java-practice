import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PasswordPractise {

	public static void runLogin(Scanner sc) {

		Map<String, String> userPW = new HashMap<String, String>();
		userPW.put("user1", "123");
		userPW.put("user2", "234");
		userPW.put("user3", "345");
		userPW.put("user4", "456");
		userPW.put("user5", "567");

		String inputedUserName;
		while (true) {
			System.out.println("ユーザー名：");
			inputedUserName = sc.next();
			if (userPW.containsKey(inputedUserName)) {
				break;
			} else {
				System.out.println(inputedUserName + "というユーザー名は登録していない。");
			}
		}

		for (int i = 2; i >= 0; i--) {

			System.out.println("パスワード：");
			String inputedPW = sc.next();
			String rightPW = userPW.get(inputedUserName);

			if (!rightPW.equals(inputedPW)) {
				if (i == 0) {
					System.out.println("アカウント異常");
					break;
				}
				System.out.println("パスワードが違い、あと" + i + "回入力違いの後アカウント異常になります。");

				continue;
			}

			else {
				System.out.println("ログイン成功。");
				break;
			}
		}

	}

	public void testLoginSuccess() {
		String simulatedInput = String.join("\n",
				"user2", // 正确用户名
				"999", // 错一次密码
				"234" // 第二次密码输入正确
		);
		InputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
		Scanner sc = new Scanner(in);

		PasswordPractise.runLogin(sc);
		// 由于程序是打印输出，不好直接断言结果；这里更多是人工观察是否逻辑报错
	}

	public void testLoginFail3Times() {
		String simulatedInput = String.join("\n",
				"user3",
				"111", "222", "333" // 三次密码错误
		);
		InputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
		Scanner sc = new Scanner(in);

		PasswordPractise.runLogin(sc);
	}
	
	public static void main(String[] args) {
	    PasswordPractise app = new PasswordPractise();
	    System.out.println("==== 成功登录流程 ====");
	    app.testLoginSuccess();
	    System.out.println("==== 失败登录流程 ====");
	    app.testLoginFail3Times();
	}


}
