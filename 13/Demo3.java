/*
	线程常用的方法的：
		Thread(String name) 初始化线程的名字
		setName(String name) 设置线程对象的名字
		getName()	返回线程的名字

		sleep()	 指定线程睡眠 毫秒
		currentThread()	返回当前的线程对象，该方法是一个静态方法

		getPriority()	返回线程优先级 线程优先级(1到10) 默认 5
		setPriority(int newPriority) 设置线程的优先级    虽然设置了线程的优先级，但是具体的实现取决于底层的操作系统的实现（最大的优先级是10 ，最小的1 ， 默认是5）。
*/

public class Demo3 extends Thread {
	public Demo3(String name) {
		super(name);	//Thread 的类的构造方法
	}

	@Override
	public void run() {
		for (int i = 0; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	public static void main(String[] args) {
		Demo3 d = new Demo3("狗娃");
		d.setPriority(10);
		d.start();

		for (int i = 0; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

	}
}		