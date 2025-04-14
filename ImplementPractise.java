
interface Printer {
	void copy(String text);

	void print(String text);
}

interface Fax {

	void sendFax(String s);
}

class Conon implements Printer, Fax {

	public void copy(String text) {
		System.out.println("Conon is copying " + text);
	}

	public void print(String text) {
		System.out.println("Conon is printing " + text);
	}

	public void sendFax(String s) {
		System.out.println("Conon is sending Fax " + s);
	}

}

class Ricon implements Printer {
	public void copy(String text) {
		System.out.println("Ricon is copying " + text);
	}

	public void print(String text) {
		System.out.println("Ricon is printing " + text);
	}
}

public class ImplementPractise {

	public static void main(String[] args) {
		Conon c = new Conon();
		c.print("Conon impress are always there.");
		c.copy("Conon impress are always there.");

		Ricon r = new Ricon();
		r.print("Ricon IDK.");
		r.copy("Ricon IDK");
	}

}
