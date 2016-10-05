package test;

import mis.bean.UserBean;
import mis.domain.User;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChangeUser {
	public static void main(String[] args) {
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);
		UserBean userBean = new UserBean();
		userBean.setUserAccount("aaa");
		userBean.setUserId(1);
		userBean.setUserName("�����");
		
		a.changeUser(userBean);
		
		
		System.out.println(userBean.getUserName());
	}
}
