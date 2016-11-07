/*
泛型接口
泛型接口的定义格式：
	interface 接口名<声明自定义类型> {
	
	}

泛型接口注意事项：
	1.接口上 自定义的泛型的具体数据类型是在实现一个接口时指定的
	2.在接口上自定义的泛型如果在实现接口的时候没有指定具体的数据类型，那么默认类型为Object类型

需求：目前在实现一个接口的时候，还不明确目前要操作的数据类型，要在实现接口的类 创建对象的时候才确定数据类型

如果要延长接口自定义泛型 的具体数据类型， 那么格式如下：
格式： 
	public class Demo4<T> implements Dao<T> {
	
	}

*/

interface Dao<T> {
	public void add(T t);
}

//接口的泛型 在 类实现接口时就要指定具体的数据 类型
public class Demo4<T> implements Dao<T> {
	public static void main(String[] args) {
		//这里延长了 接口的泛型 在创建对象时才指定 具体的数据类型
		Demo4<String> d = new Demo4<String>();

	}

	public void add(T t) {

	}
}