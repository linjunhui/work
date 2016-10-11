
import java.util.*;

// jvm 开起后 开一个主线程 找 main
class Demo4 {
	public static void main(String[] args) {
		System.out.println("数组的长度：" + args.length);

		for (int i = 0; i <args.length; i++) {
			System.out.println(args[i] + ",");
		}

		//Scanner scanner = new Scanner(System.in);
	}
}