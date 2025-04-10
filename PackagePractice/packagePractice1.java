package PackagePractice;

public class packagePractice1 {

	public class PubCls {

		public int pubInt;
		protected int protecInt;
		int defInt;
		private int privInt;

		public void pubMethod() {

			pubInt = 1000;
			protecInt = 1000;
			defInt = 1000;
			privInt = 1000;

		}

		protected void protecMethood() {
			pubInt = 100;
			protecInt = 100;
			defInt = 100;
			privInt = 100;
		}

		void defMethood() {
			pubInt = 10;
			protecInt = 10;
			defInt = 10;
			privInt = 10;
		}

		private void privMethood() {
			pubInt = 1;
			protecInt = 1;
			defInt = 1;
			privInt = 1;

		}

	}

	public class PubCls {
	
		public int pubInt;
		protected int protecInt;
		int defInt;
		private int privInt;
	
		public void pubMethod() {
	
			pubInt = 1000;
			protecInt = 1000;
			defInt = 1000;
			privInt = 1000;
	
		}
	
		protected void protecMethood() {
			pubInt = 100;
			protecInt = 100;
			defInt = 100;
			privInt = 100;
		}
	
		void defMethood() {
			pubInt = 10;
			protecInt = 10;
			defInt = 10;
			privInt = 10;
		}
	
		private void privMethood() {
			pubInt = 1;
			protecInt = 1;
			defInt = 1;
			privInt = 1;
	
		}
	
	}

	public static void main(String[] args) {
		
		packagePractice1 outer = new packagePractice1();
		packagePractice1.PubCls inner = outer.new PubCls(); // ✅ 正确创建方式
		PackagePractice.packagePractice2.PubCls c2 = new PackagePractice.packagePractice2.PubCls();

		
	}

}
