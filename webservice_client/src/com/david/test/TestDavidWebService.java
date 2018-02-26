package com.david.test;


import com.david.DavidWebServiceImpl;
import com.david.DavidWebServiceImplService;
import com.david.DavidWebServiceImplServiceLocator;
/**
 * 客户端测试webservice。测试类自己写，其他可以eclipse生成
 * @author ：David
 * @weibo ：http://weibo.com/mcxiaobing
 * @github: https://github.com/QQ986945193
 */
public class TestDavidWebService {
	public static void main(String[] args) throws Exception {
		// 创建一个用于产生webserviceimpl实例的工厂，
		DavidWebServiceImplService factory = new DavidWebServiceImplServiceLocator();
		// 通过工厂创建一个webserviceimpl实例
		DavidWebServiceImpl wServiceImpl = factory.getDavidWebServiceImplPort();
		// 调用webservice的sayhello方法
		String resResult = wServiceImpl.sayHello("我是client");
		// 调用webservice的sayhello方法之后，返回的结果是
		System.out.println("调用webservice的sayhello方法之后，返回的结果是:"+resResult);
		System.out.println("------------------------------");
		// 依次可以调用其他的方法。。。。省略不写这里。
		
	}
}
