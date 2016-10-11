public class Demo1 extends Thread {

	@Override  //把自定义线程的任务代码写在run方法中。
	public void run() {
		for(int i  = 0 ; i < 100 ; i++){
			System.out.println("自定义线程："+i);
		}
	}
	
	public static void main(String[] args) {

		Demo1 d = new Demo1();
		//d.run();
		d.start();
		for (int i =  0; i < 100; i++) {
			System.out.println("主线程main:" + i);
		}
	}
}