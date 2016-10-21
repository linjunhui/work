/*
异常的体系：
----------|Throwable	异常或者错误的超类
------------|Error		错误： 错误一般是 jvm或者硬件引发的问题，一般不通过代码处理错误
------------|Exception	异常： 是需要通过代码去处理的
*/

class Demo9 {
	public static void main(String[] args) {
		//java虚拟机在默认的情况下只能管理64M内存
		byte[] buf = new byte[1024*1024*1024];

		System.out.println("Hello World!");
	}
}