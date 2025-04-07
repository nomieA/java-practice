
public class CountArrayPlusMinnerZero {

	public static void main(String[] args) {

		int[] numbers = {3, -1, 0, 7, -5, 0, 8, -2, 0, 4};
		int positive = 0, negative = 0, zero = 0;

		for (int i : numbers) {
			if (i<0) {negative++;}
			else if(i==0) {zero++;}
			else{positive++;}
			
			}
		
		System.out.println(
				"正の数の個数："+ positive +'\n'+"負の数の個数："+ negative +'\n'+"ゼロの個数："+ zero );
		
	}

}
