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
		// ʵ����Configuration��
		Configuration conf = new Configuration()
		// ����������configure()����Ĭ�ϼ���hibernate.cfg.xml�ļ���
		// �������abc.xml��Ϊ���������ټ���hibernate.cfg.xml����Ϊ����abc.xml
			.configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
			.applySettings(conf.getProperties()).build();
		// ��Configurationʵ������SessionFactoryʵ��
		SessionFactory sf = conf.buildSessionFactory(serviceRegistry);
		// ����Session
		Session sess = sf.openSession();
		// ��ʼ����
		Transaction tx = sess.beginTransaction();
		// ������Ϣ����
		
		Rights u=new Rights();
		u.setRightsName("�ύ����");
		sess.save(u);
		
		Part p=new Part();
		p.setPartName("������Ա");
		sess.save(p);

		PartRights pr=new PartRights();
		pr.setPart(p);
		pr.setRights(u);
		
		// ������Ϣ
		sess.save(pr);
		// �ύ����
		tx.commit();
		// �ر�Session
		sess.close();
		sf.close();
	}
}