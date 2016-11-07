public class TestNative
{
	//1. 在Java类中声明Native 方法
	public native void sayHello();


	public int property = 666;
	public int number = 101;
	public void function(int i) {
		System.out.println("Integer:" + i);
	}

	public void function(double d) {
		System.out.println("Double:" + d);
	}

	public boolean function(int i, double d, char c) {
		System.out.println("Integer：i = " + i);
		System.out.println("Double: d = " + d);
		System.out.println("Char c = " + c);


		return false;
	}

	public static void main(String[] args) {
		//加载动态库不要lib 和后缀.jnilib
		System.loadLibrary("nativehello");

		TestNative tn = new TestNative();
		//调用native方法
		tn.sayHello();

		System.out.println("tn.number:" + tn.number);
	}
}