package test;

import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChangePartRights {
	public static void main(String[] args) {
		//创建Spring的ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//输出Spring容器
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);
		String partName = "前台";
		String rights[] ={"查询订单","提交订单","修改密码"};
		a.changePartRights(partName, rights);
	}
}
