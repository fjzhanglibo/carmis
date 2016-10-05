package test;

import java.util.List;
import java.util.ListIterator;

import mis.bean.UserBean;
import mis.domain.Rights;
import mis.domain.User;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetUser {
	public static void main(String[] args) {
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);
		User user = new User();
		user.setUserAccount("bbb");
		UserBean userBean = a.getUserBean(user);
		
		
		System.out.println(userBean.getUserName());
		

	}
}
