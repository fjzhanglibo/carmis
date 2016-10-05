package test;



import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.service.*;
import org.hibernate.boot.registry.*;
import mis.domain.*;
public class Test {


	public static void main(String[] args)
		throws Exception
	{
		// 实例化Configuration，
		Configuration conf = new Configuration()
		// 不带参数的configure()方法默认加载hibernate.cfg.xml文件，
		// 如果传入abc.xml作为参数，则不再加载hibernate.cfg.xml，改为加载abc.xml
			.configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
			.applySettings(conf.getProperties()).build();
		// 以Configuration实例创建SessionFactory实例
		SessionFactory sf = conf.buildSessionFactory(serviceRegistry);
		// 创建Session
		Session sess = sf.openSession();
		// 开始事务
		Transaction tx = sess.beginTransaction();
		// 创建消息对象
		
		Rights u=new Rights();
		u.setRightsName("提交订单");
		sess.save(u);
		
		Part p=new Part();
		p.setPartName("操作人员");
		sess.save(p);

		PartRights pr=new PartRights();
		pr.setPart(p);
		pr.setRights(u);
		
		// 保存消息
		sess.save(pr);
		// 提交事务
		tx.commit();
		// 关闭Session
		sess.close();
		sf.close();
	}
}