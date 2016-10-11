class ChatThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("聊天.....");
		}
	}
}


class VedioThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("视频....");
		}
	}
}

public class Demo2 {
	public static void main(String[] args) {
		ChatThread c = new ChatThread();
		c.start();
		VedioThread v = new VedioThread();
		v.start();
	}
}