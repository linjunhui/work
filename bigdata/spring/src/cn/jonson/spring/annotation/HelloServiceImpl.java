package cn.jonson.spring.annotation;

@RpcService("jjjjj")
public class HelloServiceImpl implements HelloService {
	
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "hello!" + name;
	}
	

}
