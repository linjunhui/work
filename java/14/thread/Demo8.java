package cn.jonson.thread;

/*
	join 方法， 加入
*/

class Mon extends Thread {
	public void run() {
		System.out.println("妈妈洗菜");
		System.out.println("妈妈切菜");
		System.out.println("妈妈准备炒菜，发现没有酱油了...");

		//叫儿子去打酱油
		Son s = new Son();
		s.start();
		try {
			s.join(); //当前线程让步给新线程，等新线程完成后继续执行
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("妈妈继续炒菜");
		System.out.println("全家一起吃饭");
	}
}

class Son extends Thread {
	@Override
	public void run() {
		System.out.println("儿子下楼...");
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("儿子一直往前走");
		System.out.println("儿子打完酱油");
		System.out.println("儿子把酱油给妈妈");
	}
}

public class Demo8 {
	public static void main(String[] args) {
		Mon m = new Mon();
		m.start();
	}
}