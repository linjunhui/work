package cn.jonson.proxy2;

import org.junit.Test;

public class SaleAction {

	@Test
	public void saleByBossSelf() {
		IBoss boss = new Boss();
		System.out.println("老板自营");
		int money = boss.yifu("xxl");
		System.out.println("衣服成交价:" + money);
	}
}
