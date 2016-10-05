package test;

import mis.service.AdmManager;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddUser {
	public static void main(String[] args)
	{
		//创建Spring的ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//输出Spring容器
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);

		a.addUser("aaa", "小李", "aaa", 1, 2);
		a.addUser("bbb", "小王", "bbb", 1, 3);
		a.addUser("ccc", "小赵", "ccc", 1, 1);
		a.addUser("ddd", "小钱", "ddd", 2, 4);
		a.addUser("eee", "小孙", "eee", 3, 4);
		a.addUser("fff", "小周", "fff", 4, 4);
		a.addUser("ggg", "小吴", "ggg", 2, 4);
		a.addUser("hhh", "小郑", "hhh", 2, 4);
	}	
}
