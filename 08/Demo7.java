class Person {
	String name;

	private int age;

	public Person(String name) {
		this.name = name;
	}

	public Person() {
		System.out.println("Person类的构造方法...");
	}

	public void eat() {
		System.out.println(name + "在吃饭...");
	}
}

class Student extends Person {
	int num;

	public Student() {
		System.out.println("Student类的构造方法被调用了...");
	}

	public void study() {
		System.out.println(name + "good good study, day day up");
	}
}

class Demo7 {
	public static void main(String[] args) {
		//子类不能继承父类的构造构造方法，创建对象时优先调用父类的无参构造方法
		Student s = new Student();

	}
}