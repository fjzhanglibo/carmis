package test;

import java.util.List;

import mis.bean.PartBean;
import mis.service.BaseManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetPart {
	public static void main(String[] args) {
		//����Spring��ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		 ("bean.xml");
		//���Spring����
		System.out.println();
		
		System.out.println(ctx);
		System.out.println();	
		BaseManager a = ctx.getBean("baseManager" , BaseManager.class);
		List<PartBean> pb = a.getParts();
		System.out.println(pb.get(2).getRightsNumber());
	}
}
