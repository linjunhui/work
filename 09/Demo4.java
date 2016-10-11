abstract class MyShape {
	String name;

	public MyShape(String name) {
		this.name = name;
	}

	public abstract void getArea() ;

	public abstract void getLength();
}

class Circle extends MyShape {
	double r;
	public static final double PI = 3.14;

	public Circle(String name, double r) {
		super(name);
		this.r = r;
	}

	public void getArea() {
		System.out.println(name + "面积是：" + PI*r*r);
	}

	public void getLength() {
		System.out.println(name + "周长是：" + 2*PI*r);
	}
}

class Rect extends MyShape {
	int width;
	int height;

	public Rect(String name, int width, int height) {
		super()
	}
}