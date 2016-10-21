/*
匿名内部类：没有类名的类就称作 匿名内部类
匿名内部类的好处：简化书写
匿名内部类的使用前提：必须存在继承护照实现关系才能使用
 匿名内部内一般用于实参
*/

 abstract class Animal {
 	public abstract Animal run();
 	public abstract void sleep();
 }

 class Outer {
 	public void print() {

 		//需求：在内部类调用一个类继承Animal类，然后调用run方法与sleep()

 		//局部内部类
 		// class Dog extends Animal {
 		// 	public void run(){
 		// 		System.out.println("狗在跑..");
 		// 	}

 		// 	public void sleep() {
 		// 		System.out.println("狗在睡觉..");
 		// 	}
 		// }

 		// //创建对象
 		// Dog d = new Dog();
 		// d.run();
 		// d.sleep();

 		//匿名内部类只是没有类名，其他的一概成员都具备
 		//匿名内部类与Animal是继承的 关系
 		//多态
 		//多态情况下，如果子父类存在同名的非静态方法，访问的是子类的成员函数
 		Animal a = new Animal() {
 			public Animal run() {
 				System.out.println("匿名内部类，狗在跑..");
 				return this;
 			}

 			public void sleep() {
 				System.out.println("匿名内部类，狗在睡觉..");
 			}

 			//特有的方法
 			public void bite() {
 				System.out.println("匿名内部类，特有放bite");
 			}
 		};

 		//a.bite();
 		a.run();
 		a.sleep();
 	}
 }

 class Demo6 {
 	public static void main(String[] args) {
 		Outer outer = new Outer();
 		outer.print();
 	}
 }