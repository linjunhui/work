
/*
	方法重写：
	1. 方法名 、 形参列表 必须一致
	2.子类的权限修饰符必须大于或者等于父类的权限修饰符
	3.子的返回值 类型 要小于或者等于 父类的返回值
	4.子类抛出的异常必须小于或者等于父类抛出的异常

		Exception(最坏)
		RuntimeException(小坏)

	方法重载
	1.函数名要求一致
	2.形参列表不一致
	3.与返回值类型无关

*/


class Animal {

}

class Fish extends Animal{

}

class Fu {
	String name;

	public Fu(String name) {
		this.name = name;
	}

	public Animal eat() throws Exception {
		System.out.println(name + "吃番薯...");

		//返回一个Animal对象
		return new Animal();
	}
}

class Zi extends Fu {
	String num;

	public Zi(String name) {
		super(name);
	}

	// 修饰符权限 返回值 抛出异常
	public Animal eat() throws RuntimeException {
		System.out.println("吃点开胃菜...");


		return new Animal();
	}
}

class Demo10 {
	public static void main(String[] args) {
		Zi z = new Zi("大头儿子");
		z.eat();
	}
}