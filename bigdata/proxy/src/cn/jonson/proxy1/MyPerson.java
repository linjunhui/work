package cn.jonson.proxy1;

public class MyPerson implements PersonInterface {

	@Override
	public void doSomeThing() {
		// TODO Auto-generated method stub
		System.out.println("MyPerson is  do something ....");
	}

	@Override
	public void saySomeThing() {
		// TODO Auto-generated method stub
		System.out.println("MyPerson is say something ....");
	}
	
	public void xx() {
		System.out.println("MyPerson is xx ...");
	}
}
