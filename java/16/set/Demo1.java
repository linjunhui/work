import java.util.HashSet;
import java.util.Set;

/*
集合的体系：
-------------|Collection 单例集合的根接口
---------------|List 如果是实现了List接口的集合类，具备的特点：有序，可重复
---------------|ArrayList ArrayList 底层维护了一个Object数组实现的。特点：查询速度快，增删慢
---------------|Vector(了解即可) 底层也是维护了一个Object的数组实现，实现与ArrayList一样，Vector是线程安全的，操作效率低

--------------| Set 如果是实现了Set接口的集合类，具备的特点是：无序，不可重复

	无序：添加元素的顺序与元素出来的顺序不一致
*/

public class Demo1 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("王五");
		set.add("李四");
		set.add("张三");
		//添加失败， 不可重复
		System.out.println("添加李四成功了吗?" + set.add("李四"));
		System.out.println(set);
	}
}