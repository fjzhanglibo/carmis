package test;

import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChangePartRights {
	public static void main(String[] args) {
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);
		String partName = "ǰ̨";
		String rights[] ={"��ѯ����","�ύ����","�޸�����"};
		a.changePartRights(partName, rights);
	}
}
