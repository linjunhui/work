/*
需求：定义一个方法可以接收任意类型的参数，而且返回值的类型必须用实参类型一致

自定义泛型：自定义泛型就是一个数据类型的占位符或者是一个数据类型的变量

方法上自定义泛型：
修饰符 <声明自定义的泛型>返回值类型	函数名(使用自定义泛型...) {
	
}

在泛型中不能使用基本数据类型，如果要使用基本数据类型，那就使用基本数据类型的
包装类型
byte------> Byte
short-----> Short
int-------> Integer
long------> Long

double----> Double
float-----> Float

boolean---> Boolean
char------> Character

方法泛型注意的事项：
	1.在方法上自定义泛型，这个自定义的具体数据类型在调用该方法时
由传入的具体数据的类型
	2.自定义泛型只要符合标识符的命名规则即可，但是自定义泛型一般都习惯
使用一个大写字母表示	T Type E Element
*/

public class Demo2 {
	public static void main(String[] args) {
		String str = getData("abc");
		Integer in = getData(123);
	}

	public static <abc>abc getData(abc o) {
		return o;
	}
}