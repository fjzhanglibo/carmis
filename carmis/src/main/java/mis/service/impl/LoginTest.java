package mis.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mis.domain.User;
import mis.service.AdmManager;
import mis.service.BaseManager;

public class LoginTest {

	public static void main(String[] args) {
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);

		
		User u = new User();
		u.setUserAccount("eee");
		u.setUserPassword("eee");

	}

}
