package test;

import java.util.List;
import java.util.ListIterator;

import mis.domain.Rights;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetRights {

	public static void main(String[] args) {
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);
		List<Rights> rights = a.getRights();
		ListIterator<Rights> rightsI = rights.listIterator();
		Integer rightsCount = 0;
		while(rightsI.hasNext()){
			rightsI.next();
			rightsCount=rightsCount+1;
		}
		System.out.println(rightsCount);
		

	}

}
