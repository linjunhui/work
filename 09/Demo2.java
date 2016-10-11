
class Circle {
	double r;
	public static final double PI = 3.14;

	public Circle(double r) {
		this.r = r;
	}

	public final void getArea() {
		System.out.println("圆形的面积是：" + r*r*PI);
	}
}

class Demo2 extends Circle {
	public Demo2(double r) {
		super(r);
	}

	public static void main(String[] args) {
		Demo2 c = new Demo2(4.0);
		c.getArea();
	}
}