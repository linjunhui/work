package cn.itcast.bigdata.zk;

import java.io.IOException;
import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

public class SimpleZkClient {

	private static final String connectString = "192.168.1.161:2181";
	private static final int sessionTimeout = 2000;
	private ZooKeeper zkClient = null;
	
	@Before
	public void init() throws Exception {
		zkClient = new ZooKeeper(connectString, sessionTimeout, new Watcher() {

			@Override
			public void process(WatchedEvent event) {
				// TODO Auto-generated method stub
				//收到事件通知后的回掉函数（应该是我们自己处理）
				System.out.println(event.getType() + "----" + event.getPath());
				try {
					zkClient.getChildren("/", true);
				} catch (KeeperException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}
	
	
	

		/*
		 * 数据的增删查改
		 */
	@Test
	public void testCreate() throws KeeperException, InterruptedException {
		//参数1：要创建的节点的路径 参数2:节点的数据
		String nodeCreated = zkClient.create("/eclipse6", "hello zk mac".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
	}
	
	/*
	 * 判断子节点是否存在
	 */
	@Test
	public void testExist() throws Exception {
		Stat stat =	zkClient.exists("/eclipse1", false);
		System.out.println(stat == null ? "not exist":"exist");
	}
	
	@Test
	public void getChildren() throws KeeperException, InterruptedException {
		List<String> children =	zkClient.getChildren("/", true);
		
		for(String child: children) {
			System.out.println(child);
		}
		
		//Thread.sleep(Long.MAX_VALUE);
	}

	//获取znode数据
	@Test
	public void getData() throws Exception {
		//参数三：数据的版本 null 最新的
		byte[] data = zkClient.getData("/eclipse1", false, null);
		
		System.out.println("读取数据" + new String(data));
		
	}
	
	@Test
	//删除znode
	public void deleteZnode() throws Exception {
		zkClient.delete("/eclipse1", -1);
		System.out.println("删除znode");
	}
	
	@Test
	public void setData() throws Exception {
		// -1 所有 版本都修改
		zkClient.setData("/app1", "papapa pa".getBytes(), -1);
		byte[] data = zkClient.getData("/app1", false, null);
		
		System.out.println("修改后的数据" + new String(data));
	}
}
