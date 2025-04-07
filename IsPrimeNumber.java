
public class IsPrimeNumber {

	public static void main(String[] args) {

		long aim = 6;
		System.out.println("For each number lower than " + aim);

		for (long current = 2; current <= aim; current++) {
			System.out.println("like " + current);
			boolean flag = true;
			for (long currentTest = 2; currentTest <= current / 2; currentTest++) {
				System.out.println("if the half of " + current + "like " + currentTest);
				System.out.println(" mod by " + current + " is " + current % currentTest );

				if (current % currentTest == 0) {
					flag = false;
					System.out.println(" it means " + current + " is " + flag + " a prinme number");
					break;
				}
			}

			if (flag) {
				System.out.println(current + " is a prime number.");
			}
		}

	}

}
