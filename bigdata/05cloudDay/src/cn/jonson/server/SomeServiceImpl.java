package cn.jonson.server;

import cn.jonson.protocol.SomeService;

public class SomeServiceImpl implements SomeService {
	@Override
	public String heartBeat(String name) {
		System.out.println("接收到客户端" + name + "的心跳，正常连接………………");
		return "心跳成功！";
	}
}
