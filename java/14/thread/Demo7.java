package cn.jonson.thread;
/*
	守护线程(后台线程) ：在一个线程中如果只剩下了守护线程，那么守护线程也会死亡
	需求：模拟QQ下载更新包
	一个线程默认都不是守护线程
*/

public class Demo7 extends  Thread {
	public Demo7(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i<= 100; i++) {
			System.out.println("更新包目前在下载..." + i + "%");
			if (i == 100) {
				System.out.println("更新包下载完毕，准备安装...");
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Demo7 d = new Demo7("后台线程");
		d.setDaemon(true); //设置线程是否为守护进程，true守护进程

		d.start();
		for (int i = 0; i<=100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" +i);
		}
	}
}