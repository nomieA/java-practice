interface Car {

	//Gas input
	void fillUP(int i);

	//Get Gas amount
	void getGasAmount();

}

class Daihatu implements Car {
	String number;
	int regular;

	Daihatu(String number) {
		this.number = number;
	}

	void meow() {
		System.out.println("Meow!Meow!");
	}

	public void fillUP(int i) {
		regular += i;
		System.out.println("レギュラー" + i + "Lを入れました。");
	}

	public void getGasAmount() {
		System.out.println(number + "のガソリン量は" + regular);
	}
}

class Audi implements Car {

	String number;
	int highOct;

	Audi(String number) {
		this.number = number;
	}

	@Override
	public void fillUP(int i) {
		highOct += i;
		System.out.println("ハイオクを" + i + "Lを入れました。");

	}

	@Override
	public void getGasAmount() {
		System.out.println(number + "のガソリン量は" + highOct);

	}

}

interface GasStation {
	void fillService(Car c, int gas);

}

class eneos implements GasStation {
	public void fillService(Car c, int gas) {
		c.fillUP(gas);
	}
}

public class ClassPracticeCar {
	public static void main(String args[]) {
		GasStation eneos = new eneos();
		Car d = new Daihatu("足立0721");
		Car a = new Audi("千葉9527");

		d.getGasAmount();
		eneos.fillService(d, 40);
		d.getGasAmount();


		a.getGasAmount();
		eneos.fillService(a, 50);
		a.getGasAmount();

	}
}