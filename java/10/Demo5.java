/*
局部内部类：在一个类 的方法 内部定义另外一类，那么另外一个类就称作局部内部类
局部内部类要注意的细节:
	1.如果局部 内部类访问了一个局部变量，那么该局部变量就必须使用final修饰
*/

class Outer {
	String name = "外部类的name";

	public void test() {
		//局部类访问局部变量，用final 修饰
		final int y = 100;

		//在方法中定义了一个类  局部类
		class Inner {
			int x = 10;
			public void print() {
				System.out.println("这是局部类的print方法：" + y);
			}
		}

		Inner inner = new Inner();
		inner.print();
	}
}

class Demo5 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.test();
	}
}