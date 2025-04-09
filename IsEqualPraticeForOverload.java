import java.util.Scanner;

public class IsEqualPraticeForOverload {

	public static boolean isEqual(String first, String second) {
		boolean flag = first.equals(second);
		System.out.println("String " + flag);
		return flag;
	}

	public static boolean isEqual(double first, double second) {
		boolean flag = first == second;
		System.out.println("double " + flag);
		return flag;
	}

	public static boolean isEqual(char first, char second) {
		boolean flag = first == second;
		System.out.println("char " + flag);
		return flag;
	}

	public static boolean isEqual(int first, int second) {
		boolean flag = first == second;
		System.out.println("int " + flag);
		return flag;
	}

	public static void main(String[] args) {

		isEqual("123","103");
		isEqual(1,2);
		isEqual(' ','　');
		isEqual(0.0,0.0);
		
		
		
		}

	}
}
