
/*
instanceof 关键字

*/

class Animal {
	String name;

	String color;

	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
}


//狗属于动物的一种
class Dog extends Animal {
	public Dog(String name, String color) {
		super(name, color);
	}

	public void bite() {
		System.out.println(name + "咬人");
	}
}

class Mouse extends Animal {
	public Mouse(String name, String color) {
		super(name, color);
	}

	public void dig() {
		System.out.println(name + "打洞");
	}
}

class Demo12 {
	public static void main(String[] args) {
		Dog d = new Dog("哈士奇", "白色");
		System.out.println("狗是狗类吗?" + (d instanceof Dog));
		System.out.println("狗是动物吗?" + (d instanceof Animal));

		//Mouse 与 Dog 没有继承关系 出错
		//System.out.println("狗是老鼠吗?" + (d instanceof Mouse));
	
		Animal a = new Animal("动物22", "绿色");

		System.out.println("动物是狗吗?" + (a instanceof Dog));

	}
}