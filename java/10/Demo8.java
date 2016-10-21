/*
异常：
java程序也会存在某些不正常的 情况， 这些不正常的情况 就是称为异常。

异常体系：
----------|Throwable
------------|Error
------------|Exception

Throwable常用的方法：
	toString() 返回当前异常对象的完整类名 + 病态信息
	getMessage() 返回的是 创建Throwable传入的字符串信息
	printStackTraace() 打印异常的栈信息
*/

class Demo8 {
	public static void main(String[] args) {
		//创建一个Throwable对象
		Throwable t = new Throwable("头晕、感冒..");
		String info = t.toString();
		String message = t.getMessage();
		System.out.println("toString:" + info);
		System.out.println("message:" + message);

		test();
	}

	public static void test() {
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}