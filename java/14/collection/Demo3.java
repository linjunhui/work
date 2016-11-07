package cn.jonson.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
判断
	isEmpty();
	contains(Object o)
	containsAll(Collection<?> c)
*/

class Person {
	int id;
	String name;

	public Person(int ind , String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.id = p.id;
	}
	//java规范： 一般重写equals 方法都会重写hashCode方法
}

public class Demo3 {
	public static void main(String[] args) {
		
	}
}