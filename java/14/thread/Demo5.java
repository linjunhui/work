package cn.jonson.thread;

/*
线程通讯： 一个线程完成自己的任务时，要通知另外一个线程取完成两位一个任务

生产者 和消费者

wait(): 等待		如果线程执行了wait方法，那么该线程会进入等待状态，等待状态下的线程必须要
		被其它线程调用notify方法才能唤醒
notify(): 唤醒	唤醒线程池等待线程  其中的一个
notifyAll(): 唤醒线程池所有等待 线程


wait 和 notify方法要注意的事项
	1.wait方法和notify方法是属于Object对象的
	2.wait方法和notify方法必须要在同步代码块或者同步函数中 才能使用
	3.wait方法和notify方法必须由锁对象调用

*/

//产品类
class Product {
	String name;
	double price;
	boolean flag = false;


}

class Producer extends Thread {
	Product p;
	public Producer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {
		int i = 0;
		while(true) {
			synchronized (p) {
				if (p.flag == false) {
					if(i%2 == 0) {
						p.name = "苹果";
						p.price = 6.5;
					} else {
						p.name = "香蕉";
						p.price = 2.0;
					}
					System.out.println("生产者生产出了：" + p.name + "价格是：" + p.price);
					p.flag = true;
					i++;
					p.notifyAll();
				} else {
					//生产完毕，等待消费者消费
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		}
	}
}

class Customer extends Thread {
	Product p;
	public Customer(Product p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if (p.flag == true) {
					System.out.println("消费者消费了" + p.name + " 价格" + p.price);
					p.flag = false;
					p.notifyAll();  //唤醒生产者生产
				} else {
					try {
						p.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public class Demo5 {
	public static void main(String[] args) {
		Product p = new Product();
		Producer producer = new Producer(p);

		Customer customer = new Customer(p);

		//调用start方法开启线程
		producer.start();
		customer.start();
	}
}