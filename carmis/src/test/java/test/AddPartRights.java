package test;

import mis.service.AdmManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddPartRights {
	public static void main(String[] args)
	{
		//创建Spring的ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//输出Spring容器
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		AdmManager a = ctx.getBean("admManager" , AdmManager.class);

//		a.addPartRights("操作人员", "提交订单");
	}
}
