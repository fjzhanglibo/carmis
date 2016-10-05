package mis.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mis.domain.User;
import mis.service.AdmManager;
import mis.service.BaseManager;

public class LoginTest {

	public static void main(String[] args) {
		//创建Spring的ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//输出Spring容器
	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);

		
		User u = new User();
		u.setUserAccount("eee");
		u.setUserPassword("eee");

	}

}
