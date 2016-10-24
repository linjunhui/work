package cn.jonson.thread;

class SaleTicket implements Runnable {
	int num = 500;

	@Override
	public void run() {
		while(true) {
			synchronized ("锁") {
				if (num > 0) {
					System.out.println(Thread.currentThread().getName() +"售出了第" + num + "号票");
					num--;
				} else {
					System.out.println("售罄了...");
					break;
				}
			}
		}
	}
}

public class Demo4 {
	public static void main(String[] args) {
		//实现 Runnable 接口的 类 的 对象
		SaleTicket saleTicket = new SaleTicket();
		//创建三个线程模拟三个窗口
		Thread thread1 = new Thread(saleTicket, "窗口1");
		Thread thread2 = new Thread(saleTicket, "窗口2");
		Thread thread3 = new Thread(saleTicket, "窗口3");

		//开启售票线程
		thread1.start();
		thread2.start();
		thread3.start();
	}
}