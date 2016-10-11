class Student {
	String name;

	static  String country = "中国";
	//静态代码块是在 Student.class 文件加载到内存的时候马上就执行的
	static {
		System.out.println("静态代码块执行了！");
	}

	//构造函数
	public Student(String name) {
		this.name = name;
	}
	//非静态成员函数
	public void study() {
		System.out.println("好好学习" + this);
	}
	//静态方法和非静态方法的 字节码 文件是同时时存在于内存中的，只是静态的成员变量数据有优先于对象存在而已
	public static void sleep() {
		Student s = new Student("铁蛋");
		System.out.println(s.name + "呼呼大睡");
	}

}

class Demo2 {
	public static void main(String[] args) {
		//Student.sleep();

		//静态代块码块执行一次
		Student s = new Student("狗娃");
		s.study();
	}
}