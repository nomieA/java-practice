public class MethodTest {

	public static double sum(double left, double right) {
		double sum = left + right;
		return sum;
	}

	public static void main(String[] args) {
		

		
		double sum1 = sum(3.3333, 9.876);
		System.out.println(sum1);
		double sum2 = sum(4.837, 0.098);
		System.out.println(sum2);
		double sum3 = sum(1.112, 4.445);
		System.out.println(sum3);
	}

}
