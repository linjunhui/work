package cn.jonson.thread;
/*
线程的停止：
	1.停止一个线程一般通过一个变量去控制
	2.如果需要停止一个处于等待状态下的线程，我们需要通过变量配合notify方法或者interrupt来使用
*/

public class Demo6 extends Thread {
	boolean flag = true;

	public Demo6(String name) {
		super(name);
	}

	@Overide
	public synchronized  void run() {
		int i = 0;
		while(flag) {
			try {
				this.wait();	//狗娃等待...
			} catch (InterruptedException e) {
				System.out.println("接收到了异常...");
			}

			System.out.println(Thrad.currentThread().getName() + ":" + i);
			i++;
		}
	}

	public static void main(String[] args) {
		Demo6 d = new Demo6("狗娃");
		d.setPriority(10);
		d.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}