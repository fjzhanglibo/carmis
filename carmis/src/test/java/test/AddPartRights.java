package test;

import mis.service.AdmManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddPartRights {
	public static void main(String[] args)
	{
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		AdmManager a = ctx.getBean("admManager" , AdmManager.class);

//		a.addPartRights("������Ա", "�ύ����");
	}
}
