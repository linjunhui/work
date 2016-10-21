
//实现关系下匿名内部类
interface Dao {
	public void add();
}

class Outer {
	public void print() {

		new Dao() { //本来接口部类创建对象的，这里不是接口创建对象
					//是实现接口的匿名类创建对象
			public void add() {
				System.out.println("添加成功");
			}
		}.add();
	}
}

class Demo7 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.print();

		//创建一个匿名内部类 作为 参数
		test(new Dao() {
			public void  add() {
				System.out.println("匿名内部类作参数");
			}
		});
	}

	public static void test(Dao d) {//形参类型是一个接口引用
		d.add();
	}
}