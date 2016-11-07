import java.util.Enumeration;
import java.util.Vector;

/*
集合的体系：
-------------|Collection 单例集合的根接口
---------------|List 如果是实现了List接口的集合类，具备的特点：有序，可重复
---------------|ArrayList ArrayList 底层维护了一个Object数组实现的。特点：查询速度快，增删慢
---------------|Vector(了解即可) 底层也是维护了一个Object的数组实现，实现与ArrayList一样，Vector是线程安全的，操作效率低

--------------| Set 如果是实现了Set接口的集合类，具备的特点是：无序，不可重复

笔试题： 说出ArrayList与Vector的区别
	相同点：ArrayList与Vector的底层都是使用了Object的数组实现

	不同点：
		1.ArrayList是线程不同步的，操作效率高
		Vector是线程同步的，操作效率低
		2.ArrayList是JDK1.2出现的，Vector 是JDK1.0的时候出现的
*/

public	class Demo1 {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.addElement("张三");
		v.addElement("李四");

		//迭代该集合
		Enumeration e = v.elements(); //获取跌打器
		while(e.hasMoreElements()) { //判断还有没有元素
			System.out.println(e.nextElement());
		}
	}
}