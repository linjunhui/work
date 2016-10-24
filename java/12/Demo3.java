package cn.jonson.object;
/*
java是面向对象的语言，核心思想： 找适合的 对象做 合适的事情
	方式一： 自定义类， 然后通过自定义的类创建对象
	方式二： sun提供了很多的类

Object类是所有类的终极父类，任何一个类都继承了Object类

Object类：
	Object类的常用方法：
		toString(): 返回该对象的字符串表示
	toString的作用：重写toString之后，可以按照我们的要求输出一个对象
	equals(Object obj) 用于比较两个对象的内存地址，判断两个对象是否同一个对象
	hashCode() 返回该对象的哈希码值()

	java规范中：一般重写了equals方法，就要重写hashCode()方法
*/

class Person {
	int id;
	String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person() {


	}

	//重写toString方法
	public String toString() {
		return "编号：" + this.id + " 姓名：" + this.name;
	}

	//重写 equals方法

	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.id == p.id;
	}

	public int hashCode() {
		return this.id;
	}
}

public class Demo3 {
	public static void main(String[] args) {
		Object o = new Object();
		System.out.println(o.toString());
		System.out.println(o); //输出一样

		Person p1 = new Person(110, "Jonson");
		System.out.println("p1:" + p1);

		Person p2 = new Person(110, "狗娃");
		Person p3 = new Person(110, "陈福");
		System.out.println("p1 与 p2 是同一个对象吗？" + p1.equals(p2));

		System.out.println("p1的哈希码：" + p1.hashCode());
		System.out.println("p2的哈希码：" + p2.hashCode());
	}
}