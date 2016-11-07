import java.util.HashSet;
import java.util.Scanner;

/*
	需求：接收键盘录入用户名与密码，如果用户名与密码已经存在就视为
	重复元素，不允许添加到HashSet中
*/

class User {
	String userName;
	String password;

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		User user = (User)obj;
		return this.userName.equals(user.userName)&&this.password.equals(user.password);
	}

	@Override
	public int hashCode() {
		return userName.hashCode() + password.hashCode();
	}
}

public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet set = new HashSet();

		while(true) {
			System.out.println("请输入用户名：");
			String userName = scanner.next();
			System.out.println("请输入密码：");
			String password = scanner.next();

			User user = new User(userName, password);

			if (set.add(user)) {
				System.out.println("注册成功..");
				System.out.println("当前注册用户有：" + set);
			} else {
				System.out.println("注册失败...");
			}
		}
	}
}