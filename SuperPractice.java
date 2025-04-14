abstract class Super {
	Super() {
		System.out.println("null");
	}

	abstract Super method() ;
}

class Sub extends Super {

	Sub(int a) {
		super();
	}

	Sub method() {//サブクラスがmethodをオーバーライドした
		System.out.println("Sub!");
		return new Sub(1);
	}
}

public class SuperPractice {

	public static void main(String[] args) {

		Sub sub = new Sub(1);
		sup.method();//スーパークラスのメソッド
		sub.method();//

	}

}
