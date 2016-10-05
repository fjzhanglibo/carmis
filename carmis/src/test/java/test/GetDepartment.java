package test;

import mis.bean.UserBean;
import mis.domain.Department;
import mis.domain.User;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetDepartment {
	public static void main(String[] args) {
		//创建Spring的ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//输出Spring容器
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);
		Department dep = new Department();
		dep.setDepartmentName("洗车部");
		Department d = a.getDepartment(dep);
		System.out.println(d.getDepartmentName());
	}
}
