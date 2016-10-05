package mis.dao.impl;


import java.util.List;



import mis.dao.UserDao;
import mis.domain.Department;
import mis.domain.Part;
import mis.domain.User;
import common.dao.impl.BaseDaoHibernate4;


public class UserDaoHibernate4 extends BaseDaoHibernate4<User> implements
		UserDao {
	/**
	 * �����˻����������ѯ�û�
	 * @param user �����˻�����������û�����
	 * @return �û�
	 */
	public User findByAccountAndPass(User user){
		List<User> users = find("select p from User p where p.userAccount = ?0 and p.userPassword = ?1"
				, user.getUserAccount() , user.getUserPassword());
			if (users!= null && users.size() >= 1)
			{
				return users.get(0);
			}
			return null;
	}

	/**
	 * �����˻�����ѯ�û�
	 * @param userAccount �˻���
	 * @return �û�
	 */
	public User findByAccount(String account){
		List<User> users = find("select p from User p where p.userAccount = ?0"
				, account);
			if (users!= null && users.size() >= 1)
			{
				return users.get(0);
			}
			return null;
	}
	/**
	 * �����û�������ѯ�û�����
	 * @param name �û�����
	 * @return �û�����
	 */
	public List<User> findByName(String name){
		return find("select p from User p where p.userName = ?0" , name);
	}
	
	/**
	 * ���ݲ��Ų�ѯ�û�����
	 * @param department ����
	 * @return �û�����
	 */
	public List<User> findByDepartment(Department department){
		return find("select p from User p where p.department = ?0" , department);
	}
	
	/**
	 * ���ݽ�ɫ��ѯ�û�����
	 * @param part ��ɫ
	 * @return �û�����
	 */
	public List<User> findByPart(Part part){
		return find("select p from User p where p.part = ?0" , part);
	}

}
