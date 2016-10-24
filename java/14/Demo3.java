package cn.jonson.thread;

/*
自定义线程的创建方式：

方式一：
1.自定义一个类继承Thread 类
2.重写Thread类的run方法，把自定义线程的任务代码写在run方法上
3.创建Thread的子类对象，并且调用start方法启动一个线程

注意：千万不不要直接调用run方法，用start

方式二：
1.自定义一个类实现Runable接口
2.实现Runable接口的 run方法，把自定义线程的任务定义在run方法上
3.创建Runable实现类 对象
4.创建Thread类的 对象，并把Runable实现类的对象作为实参传递
5.调用Thread对象 的start方法开启一个线程

问题1：
	请问Runnable实现类的对象是线程对象吗？
	Runnable实现类的对象并不是一个线程对象，只不过是实现了Runnnale接口的对象而已
	只有是Thread 或者是 Thread的子类 才是线程的 对象

问题2：
	为什么要把Runnable实现类的对象作为实参传给Thread对象呢？ 作用是什么？
	作用就是要报Runnable实现类的对象的run方法作为线程的任务代码取执行
*/

public class Demo3 implements Runnable {
	@Override
	public void run() {
		System.out.println("");

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	public static void main(String[] args) {
		//创建Runnable实现类的 对象
		Demo3 d = new Demo3();

		//创建Thread类的对象，把Runnable实现类的对象作为参数传递
		Thread thread = new Thread(d, "狗娃");
		//调用thread对象的start方法开启线程
		thread.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" +i);
		}
	}
}