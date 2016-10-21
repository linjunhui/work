/*
	疑问：下面的信息是通过printStackTrace方法打印出来，那么异常的对象从何而来？

*/


class Demo10{
	public static void main(String[] args) {
		int[] arr = null;
		div(4, 0, arr);
	}

	public static void div(int a, int b, int[] arr) {
		int c = 0;
		try {
			c = a/b;//jvm在这句话的时候发现了不正常情况，就会创建一个对应的异常对象
			System.out.println("数组的长度:" + arr.length);
		} catch(ArithmeticException e) {
			//处理异常的代码
			System.out.println("异常处理..");
			System.out.println("toString:" + e.toString());
		} catch(NullPointerException e) {
			System.out.println("出现了空指针异常");
		}catch(Exception e) {
			System.out.println("我是急诊室，包治百病");
		}

		System.out.println("c="+c);
	}


}