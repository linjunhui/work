/*
多态：父类的引用类型变量指向了子类的对象 或者 接口类型的引用类型变量指向了接口实现类的 对象

实现关系 下的 多态：
	接口 变量 = new 接口实现类的对象
*/

interface Dao {//接口方法全部都是非静态的方法
	public void add();
	public void delete();
}

//接口的实现类 
class UserDao implements Dao {
	public void add() {
		System.out.println("添加员工成功!!");
	}

	public void delete() {
		System.out.println("删除员工成功!!");
	}
}

class Demo3 {
	public static void main(String[] args) {

		//引用 d 接口类型   右边接口的实现类
		Dao d = new UserDao();
		d.add();
	}
}