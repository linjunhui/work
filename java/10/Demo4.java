/*
内部类：一个类定义在另外一个类的内部，那么该类就称作内部类
内部的class文件名： 外部类$内部类.	好处：便于区分该class文件属于那个外部类

内部类的类别：
	1.成员内部类：
		成员内部类的访问方式：
			方式一：在外部类提供一个方法创建内部类的对象进行访问
			方式二:在其它类直接创建内部类的对象  
				格式：外部类.内部类 变量名 = new 外部类().new 内部类();
		注意如果是一静态内部类，那么在其它类中创建的格式
			外部类.内部类 变量名 = new 外部类.内部类();


		内部类的好处：内部类可以直接访问外部类的所有成员

		内部类要注意点的细节：
			1.如果外部类与内部类存同名的成员变量时，在内部类中默认情况下是访问的内部类的成员变量
				可以通过外	外部类.this.成员变量名  指定访问外部类的 成员

			2.私有的成员 内部类 只能由外部类提供一个方法创建内部类的对象进行访问，不能在其它类中创建对象了
			3.成员内部类一旦出现了静态的成员， 那么该类必须 使用static 修饰
*/

//外部类
class Outer {
	//成员变量
	int x = 100;

	//成员内部类
	static class Inner {
		static int i = 10;

		public void print() {
			System.out.println("这个是成员内部类的print方法" + i);
		}
	}

	public void instance() {
		Inner inner = new Inner();
		inner.print();
	}
}
//其它类
class Demo4 {
	public static void main(String[] args) {
		System.out.println(Outer.Inner.i);

		Outer outer = new Outer();
		outer.instance();

		Outer.Inner inner = new Outer.Inner();
		inner.print();
	}
}		