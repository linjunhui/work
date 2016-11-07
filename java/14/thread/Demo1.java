package cn.jonson.thread;

/*
	进程：进程就正在运行的应用程序，进程负责了内存空间的划分
	线程：一个进程中的代码是由线程去执行的，线程也就是进程中的一个执行路径
	多线程：一个进程中有多个线程可以同时执行任务

	多线程的好处：
	1.一个进程可以执行多个任务
	2.提高了资源利用率

	多线程的弊端
	1.增加了cpu的负担
	2.降低了一个进程中线程的执行的概率
	3.出现了线程安全的问题
	4.会引发死锁现象

	自定义线程的 实现方式：
		方式一：
			1.自定义一个类继承Thread类
			2.重写thread类的run方法，把自定义线程的任务代码写在run方法上
			3.创建Thread子类的对象，并用start方法启动一个线程

	注意：不要直接调用run方法，调用start方法的时候线程就会开启，线程一旦开启就会
	执行run中的方法，那么久相当于调用了一个普通的方法

	线程安全的问题：
	线程安全出现的根本原因：
		1.存在两个或者两个以上的线程共享一个资源
		2.多线程操作共享资源的代码  有多句

	线程安全的解决方案：
		方式一：可以使用同步代码块取解决

		格式：
			synchronized(锁对象) {
				需要被同步的代码
			}

	同步代码块需要注意的事项：
		1.锁对象可以是任意一个对象
		2.一个线程在同步代码块中sleep， 并不会释放锁对象
		3.如果不是存在线程安全问题，千万不要使用同步代码块，因为会降低效率
		4.锁对象必须是多线程共享一个资源，否则锁不住

		方式二
			同步函数： 同步函数就是使用synchronized修饰一个函数

		同步函数要注意的事项：
			1.如果是一个 非静态的同步函数的锁，对象是this， 如果是静态的同步函数的锁
			对象是当前函数所属的类的字节码文件（class对象)
			2.同步函数 锁对象 是固定的， 不是由人指定的

	推荐使用同步代码块：
		原因：
			1.同步代码块的锁对象可以由我们随意指定，方便控制。同步函数的锁对象是固定的， 不能
			由我们来指定
			2.同步代码块可以很方便控制需要被同步代码的范围，同步函数必须是整个函数 的所有代码都被同步

	需求：一个银行账户两个人取钱 一次1000
*/

class BankThreads extends Thread {
	static int count = 50000000;
	public BankThreads(String name) {
		super(name);
	}

	@Override
	public synchronized void run() {
		while (true) {
			synchronized("锁"){// "锁" 整个字符串就是一个锁对象
				if (count>0) {
					System.out.println(Thread.currentThread().getName() + "取走了1000块，还剩余" + (count - 1000) + "元");
					count = count - 1000;
				} else {
					System.out.println("取光了....");
				}
			} 
			
		}
	}

	//静态的函数---------->函数所属的类解码文件对象------>BankThread.class 唯一的
	public static synchronized  void getMoney() {

	}
}

public class Demo1 {
	public static void main(String[] args) {
		//创建两个线程对象
		BankThreads thread1 = new BankThreads("H");
		BankThreads thread2 = new BankThreads("W");

		//调用start方法开始取钱
		thread1.start();
		thread2.start();
	}
}