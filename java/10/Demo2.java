/*
目前多态情况下不能访问子类的特有成员
如果需要访问子类特有的成员，需要进行强制类型转换

基本数据类型的转换
	小数据类型---->大的数据类型转换	自动数据类型转换
	大的数据类型---->小的数据类型	强制类型转换

类型转换的场景问题：java.lang.ClassCastException 强制类型转换失败
*/

//动物类
abstract class Animal {
	String name;
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void run();	
}
//老鼠类
class Mouse extends Animal {
	public Mouse(String name) {
		super(name);
	}

	public void run() {
		System.out.println(name + "四条腿老鼠慢慢的走");
	}

	//老鼠特有的方法，打洞
	public void dig() {
		System.out.println(name + "在打洞...");
	}
}

//鱼
class Fish extends Animal {
	public Fish(String name) {
		super(name);
	}

	public void run() {
		System.out.println(name + "游啊游..");
	}

	public void bubble() {
		System.out.println(name + "吹泡泡...");
	}
}

class Demo2 {
	public static void main(String[] args) {
		//多态
		Animal a = new Mouse("老鼠");
		Mouse m = (Mouse)a; //多态情况下，强制转换获得子类特有方法
		m.dig();

		Mouse m1 = new Mouse("Mickey mouse");
		Fish f = new Fish("草鱼");	
		print(m1);
		print(f);

	}

	//需求：定义一个函数可以接收任意类型的动物对象，在函数内部要调用到动物特有的方法
	public static void print(Animal a) {
		if (a instanceof Fish) {
			Fish f = (Fish)a;
			f.bubble();
		} else if(a instanceof Mouse) {
			Mouse m = (Mouse)a;
			m.dig();
		}
	}
}