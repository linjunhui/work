package cn.jonson.thread;

/*
	java中的同步机制解决了线程的安全问题，但同时也引发了死锁现象
	死锁现象：
	死锁现象的出现的根本原因：
	1.存在两个或者两个以上的线程
	2.存在两个或者两个以上的 共享资源

	死锁现象的解决方案：
	没有方案，尽量避免
*/

class DeadLock extends Thread {
	public DeadLock(String name) {
		super(name);
	}

	public void run() {
		if ("张三".equals(Thread.currentThread().getName())) {
			synchronized ("遥控器") {
				System.out.println("张三拿到了遥控器， 准备去拿电池！！！");
				synchronized ("电池") {
					System.out.println("张三拿到了 遥控器和 电池");
				}
			} 
		} 
		else if ("狗娃".equals(Thread.currentThread().getName())) {
				synchronized ("电池") {
					System.out.println("狗娃拿到了电池，准备去拿遥控器");
					synchronized ("遥控器") {
						System.out.println("狗娃拿到了电池 和 遥控器");
					}
				}
		}
	}
}

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		DeadLock thread1 = new DeadLock("张三");
		DeadLock thread2 = new DeadLock("狗娃");

		thread1.start();
		//Thread.sleep(10);
		thread2.start();
	}
}