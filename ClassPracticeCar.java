class Car {
	//Number
	String num = "足立 5678";
	//Gas amount
	int gasoline = 0;

	//Gas input
	void fillUP(int i) {
		gasoline += i;
	}

	//Get Gas amount
	void getGasAmount() {
		System.out.println(num + "のガソリン量は" + gasoline);
	}

}

class CatUseless{
	String name = "meowmeow";
	void meow() {
		System.out.println("Meow!Meow!");
	}
}

class GasStation {

	void fillService(Car c, int gas) {
		c.fillUP(gas);
	}

}

public class ClassPracticeCar {
	public static void main(String args[]) {
		GasStation eneos = new GasStation();
		Car myCar = new Car();

		myCar.getGasAmount();
		eneos.fillService(myCar, 40);

		
		myCar.getGasAmount();

	}
}