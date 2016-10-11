
//普通的学生类
class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	public void study() {
		System.out.println(name + "学习马克思列宁主义");
	}
}

class BaseStudent extends Student {
	public BaseStudent(String name ){
		super(name);
	}

	//重写
	public void study(){
		System.out.println(name + "学习javase...");
	}
}

class WorkStudent extends Student {
	public WorkStudent(String name) {
		super(name);
	}

	public void study() {
		System.out.println(name + "学习javaee ＋ android");
	}
}

class Demo11 {
	public static void main(String[] args) {
		BaseStudent s = new BaseStudent("林俊晖");
		s.study();

		WorkStudent w = new WorkStudent("Jonson");
		w.study();
	}
}