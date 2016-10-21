import ee.Demo7;

class Demo8 {
	public static void main(String[] args) {
		Demo7 d = new Demo7();
		//i 在Demo7 中 protected ，不同的包无法访问
		System.out.println("i = " + d.i);
	}
}