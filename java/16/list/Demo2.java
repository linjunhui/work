import java.util.LinkedList;
import java.util.Random;

/*
	需求：使用LinkedList存储一副扑克，然后实现洗牌功能
*/

//扑克类
class Poker {
	String color; //花色
	String num; // 点数

	public Poker(String color, String num) {
		super();
		this.color = color;
		this.num = num;
	}

	@Override
	public String toString() {
		return "{" + color + num + "}";
	}
}

public class Demo2 {
	public static void main(String[] args) {
		LinkedList poker = createPoker();
		showPoker(poker);

		shufflePoker(poker);
		showPoker(poker);
		System.out.println(poker);
	}

	//洗牌
	public static void  shufflePoker(LinkedList pokers) {
		//创建随机数对象
		Random random = new Random();

		for (int i = 0; i < 1000; i++) {
			//随机产生两个索引值
			int index1 = random.nextInt(pokers.size());
			int index2 = random.nextInt(pokers.size());

			//根据索引值取出两张牌然后交换
			Poker poker1 = (Poker)pokers.get(index1);
			Poker poker2 = (Poker)pokers.get(index2);

			pokers.set(index1, poker2);
			pokers.set(index2, poker1);
		}
	}

	//显示扑克牌
	public static void showPoker(LinkedList pokers) {
		for (int i = 0; i<pokers.size(); i++) {
			System.out.println(pokers.get(i));
			if(i%10 == 9)
				System.out.println();
		}
	}
	//生成扑克牌的方法
	public static LinkedList createPoker() {
		LinkedList list = new LinkedList();
		String[] colors = {"黑桃", "红桃", "梅花", "方块"};
		String[] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		for (int i  = 0; i < nums.length; i++) {
			for (int j = 0; j < colors.length; j++) {
				list.add(new Poker(colors[j], nums[i]));
			}
		}
		return list;
	}
}