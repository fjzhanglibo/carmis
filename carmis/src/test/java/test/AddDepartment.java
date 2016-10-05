package test;

import mis.domain.Department;
import mis.service.AdmManager;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddDepartment {
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
		Department dep = new Department();
		dep.setDepartmentName("���۲�");
		a.addDepartment("���۲�");
		System.out.println(a.getDepartment(dep));
	}
}
