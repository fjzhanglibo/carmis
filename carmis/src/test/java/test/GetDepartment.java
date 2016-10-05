package test;

import mis.bean.UserBean;
import mis.domain.Department;
import mis.domain.User;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetDepartment {
	public static void main(String[] args) {
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);
		Department dep = new Department();
		dep.setDepartmentName("ϴ����");
		Department d = a.getDepartment(dep);
		System.out.println(d.getDepartmentName());
	}
}
