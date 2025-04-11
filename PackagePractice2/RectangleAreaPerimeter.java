package PackagePractice2;

public class RectangleAreaPerimeter {
	
	

	public static void main(String[] args) {
		MyRectangle rec1 = new MyRectangle(); // 默认 0, 0
		MyRectangle rec2 = new MyRectangle(3, 4); // 3, 4

		System.out.println("rec1: " + rec1.getLength() + " x " + rec1.getWidth());
		System.out.println("rec2: " + rec2.getLength() + " x " + rec2.getWidth());
		
		System.out.println("rec2 面積: " + rec2.getArea());
		System.out.println("rec2 周長: " + rec2.getPerimeter());
	}
}

// ✅ JavaBean 风格の MyRectangle クラス
class MyRectangle {
	private int length;
	private int width;

	public MyRectangle() {
		this.length = 0;
		this.width = 0;
	}

	public MyRectangle(int length, int width) {
		this.setLength(length);
		this.setWidth(width);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length < 0) {
			System.out.println("長さは負の数にできません！");
			this.length = 0;
		} else {
			this.length = length;
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width < 0) {
			System.out.println("幅は負の数にできません！");
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	 public int getArea() {
		return this.length * this.width;
	}

	 public int getPerimeter() {
		return 2 * (this.length + this.width);
	}
}
