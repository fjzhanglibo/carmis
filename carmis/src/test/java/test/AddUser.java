package test;

import mis.service.AdmManager;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddUser {
	public static void main(String[] args)
	{
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);

		a.addUser("aaa", "С��", "aaa", 1, 2);
		a.addUser("bbb", "С��", "bbb", 1, 3);
		a.addUser("ccc", "С��", "ccc", 1, 1);
		a.addUser("ddd", "СǮ", "ddd", 2, 4);
		a.addUser("eee", "С��", "eee", 3, 4);
		a.addUser("fff", "С��", "fff", 4, 4);
		a.addUser("ggg", "С��", "ggg", 2, 4);
		a.addUser("hhh", "С֣", "hhh", 2, 4);
	}	
}
