import dd.Demo5;
//Demo5 中有静态方法，证明这个导包并没有将类加载到内存中
class Demo6 {
	public static void main(String[] args) {
		System.out.println("这是Dem6");
		//这时Demo5 才被加载到内存中
		Demo5 d5 = new Demo5();
	}
}