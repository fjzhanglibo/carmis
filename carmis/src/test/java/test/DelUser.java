package test;

import java.util.List;
import java.util.ListIterator;

import mis.bean.PartRightsBean;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DelUser {
	public static void main(String[] args) {
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);
		a.delUser("ggg");
		
		

	}
}
