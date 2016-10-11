//饿汉单例模式
class Single {
	//声明本类的引用类型变量， 并且使用该变量指向 本类 对象
	private static Single s = new Single();
	//私有化构造函数 让无法调用到构造方法， 只能使用getInstance来获得对象
	private Single() {

	}
	//提供一个公共的静态方法获取本类的对象
	public static Single getInstance() {
		return s;
	}
}

//懒汉单例模式
class Single2 {

	private static Single2 s;

	private Single2() {

	}

	public static Single2 getInstance() {
		if(s == null) {
			s = new Single2();
		}

		return s;
	}
}

class Test {
	public static Test t;
	private Test() { }
	public static Test getInstance() {
		if (t == null) {
			t =  new Test();
		}

		return t;
	}
}

class Demo5 {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		System.out.println("是同一个对象：" + (s1==s2));

		Single2 s3 = Single2.getInstance();
		Single2 s4 = Single2.getInstance();

		System.out.println("是同一个对象：" + (s3==s4));

	}
}