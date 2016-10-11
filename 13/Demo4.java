/*
需求：模拟3个窗口同时售卖50 张票
问题1：为什么50张票被卖出了150次
	出现的原因：因为num 是非静态的，非静态的成员变量数据是在每个对象中都会维护一份数据的，
	三个线程对象就会有三份数据

解决方案：吧num票数共享出来给三个线程对象使用， 使用static修饰

问题2：出现了线程安全问题

线程安全问题的解决方案：sun提供了线程同步机制让我们解决这类问题
	java线程同步机制的方式：
		方式一：同步代码块
			同步代码块的格式：
			
			synchronized(锁对象){
				需要被同步的代码...
			}

同步代码块要注意事项：
		1. 任意的一个对象都可以做为锁对象。
		2. 在同步代码块中调用了sleep方法并不是释放锁对象的。
		3. 只有真正存在线程安全问题的时候才使用同步代码块，否则会降低效率的。
		4. 多线程操作的锁 对象必须 是唯一共享 的。否则无效。
*/

class SaleTicket extends Thread {
	static int num = 100;
	static Object o = new Object();

	public SaleTicket(String name) {
		super(name);
	}

	@Override
	public void run() {
		while(true) {
			//同步代码块只能同时被一个线程执行, "锁" 在字符串常量区，唯一共享，所以可以做锁
			synchronized ("锁") {
				if(num>0) {
					System.out.println(Thread.currentThread().getName() + "售出了第" + num + "号票");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					num--;
				} else {
					System.out.println("售罄了..");
					break;
				}
			}
		}
	}
}


public class Demo4 {
	public static void main(String[] args) {
		//创建三个线程对象，模拟三个窗口
		SaleTicket thread1 = new SaleTicket("窗口1");
		SaleTicket thread2 = new SaleTicket("窗口2");
		SaleTicket thread3 = new SaleTicket("窗口3");

		//开启售票线程
		thread1.start();
		thread2.start();
		thread3.start();
	}
}