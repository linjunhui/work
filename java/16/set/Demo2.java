import java.util.HashSet;
import java.util.Set;

/*
集合的体系：
-------------|Collection 单例集合的根接口
---------------|List 如果是实现了List接口的集合类，具备的特点：有序，可重复
---------------|ArrayList ArrayList 底层维护了一个Object数组实现的。特点：查询速度快，增删慢
---------------|Vector(了解即可) 底层也是维护了一个Object的数组实现，实现与ArrayList一样，Vector是线程安全的，操作效率低

--------------| Set 如果是实现了Set接口的集合类，具备的特点是：无序，不可重复
--------------| HashSet 底层是使用的哈希表来支持的，特点： 存取速度快

HashSet的实现原理：
	往HashSet添加元素的时候，HashSet会先调用元素的hashCode的得到元素的哈希值
	然后通过 元素的哈希值经过位移等运算，就可以算出该元素在哈希表中的位置

	情况1：如果算出元素存储的位置目前没有任何元素存储，那么元素可以直接存储到该位置

	情况2：如果算出该元素的存储位置目前已经存在其他的元素了，那么元素就会调用该元素的equals方法与该位置的元素再比较一次，
	返回true不允许添加， 返回false 执行 添加

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