package PackagePractice2;


public static int nima;

class Employee {

	private String name;
	private int id;
	private int age;
	private String address;

	//必要に応じて、メンバー変数にアクセスするためのメソッドを作成しておく

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee() {
		this.name = "新入社員";
		this.id = 999;
		System.out.println("新入社員が呼びされました。");
	}

	public String getName() {
		return name;
	}

	public Employee(int id, String name) {
		this.name = name;
		this.id = id;
		System.out.println("社員" + name + id + "が呼びされました。");

	}

	public void selfIntroduction() {
		System.out.println("私は" + name + "idは" + id + "です。");
	}

}

public class PackagePractice2 {

	public static void selfIntroduction() {
		System.out.println("私はです。");
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.selfIntroduction();
		e1.setName("すら");
		e1.setId(321);
		e1.selfIntroduction();

		Employee e2 = new Employee(123, "にま");
		e2.selfIntroduction();

		selfIntroduction();

		Employee e3 = new Employee();

		e3.selfIntroduction();

	}

}
