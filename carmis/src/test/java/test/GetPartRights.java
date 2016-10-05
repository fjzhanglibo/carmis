package test;

import java.util.List;
import java.util.ListIterator;

import mis.bean.PartRightsBean;
import mis.domain.Rights;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetPartRights {
	public static void main(String[] args) {
		//创建Spring的ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//输出Spring容器
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);
		List<PartRightsBean> prbs = a.getPartRights();
		ListIterator<PartRightsBean> it = prbs.listIterator();
		Integer rightsCount = 0;
		while(it.hasNext()){
			System.out.println(it.next().getRights());
			
			rightsCount=rightsCount+1;
		}
		//System.out.println(rightsCount);
		
		

	}
}
