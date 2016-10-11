
class Fu {
	int x = 10;

	String name;

	public Fu(String name) {
		this.name = name;
		System.out.println("Fu类的带参构造方法...");
	}

	public Fu() {

		System.out.println("Fu类的无参构造方法");
	}
}

class Zi extends Fu {
	int x = 20;

	public Zi(String name) {
		super(name);
	}

	public void print() {
		System.out.println("x1=" +x);
	}
}

class Demo8 {
	public static void main(String[] args) {
		Zi z = new Zi("大头儿子");
		System.out.println("name = " + z.name);
	}
}

