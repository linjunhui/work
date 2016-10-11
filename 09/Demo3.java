abstract class Animal {
	String name;
	String color;

	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void eat() {
		System.out.println(name + "吃粮食");
	}

	public abstract void run();
}

class Dog extends Animal {
	public Dog(String name, String color) {
		super(name, color);
	}

	public void run() {
		System.out.println(name + "四条腿的跑的快..");
	}
}

class Fish extends Animal {
	public Fish(String name, String color) {
		super(name, color);
	}

	public void run() {
		System.out.println(name + "游啊游");
	}
}

class Demo3 {
	public static void main(String[] args) {
		Dog d = new Dog("牧羊犬", "黄色");
		d.run();
	}
}