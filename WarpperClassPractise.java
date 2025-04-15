
public class WarpperClassPractise {

	public static void main(String[] args) {
		Integer i1 = 1234;
		Integer i2 = new Integer(1234);
		Integer i3 = new Integer("1234");

		Integer i4 = 1234;
		String s1 = i4.toString();
		System.out.println(s1);
		String s2 = Integer.toString(i4);
		System.out.println(s2);
		String s3 = String.valueOf(i3);
		System.out.println(s3);

		String s4 = new String();
		String s5 = null;
		
		String s10 = "1234";
		int num = Integer.parseInt(s10);

		Integer a = 123;
		Integer b = 234;
		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));

		System.out.println(s10.contains("14"));
		System.out.println(s4.isEmpty());
		System.out.println(s5.isEmpty());


	}

}
