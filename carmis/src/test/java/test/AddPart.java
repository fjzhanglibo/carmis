package test;

import mis.service.AdmManager;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddPart {
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
		a.addPart("ǰ̨");
	}
}
