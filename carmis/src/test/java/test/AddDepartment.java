package test;

import mis.domain.Department;
import mis.service.AdmManager;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddDepartment {
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
		Department dep = new Department();
		dep.setDepartmentName("销售部");
		a.addDepartment("销售部");
		System.out.println(a.getDepartment(dep));
	}
}
