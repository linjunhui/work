public class CreateObject {
	public static native void outputDate();
	// public static void test() {
	// 	System.out.println("主类中的static");
	// }
	// static {
	// 	System.out.println("主类中的static块");
	// }
	static int i = 10;
	public static void main(String[] args) {
		System.loadLibrary("create");
		System.out.println("jjjjj i = " + i);
		outputDate();

		//CreateObject.test();
	}
}