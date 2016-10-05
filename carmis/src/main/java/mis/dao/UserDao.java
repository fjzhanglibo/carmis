package mis.dao;

import mis.domain.Department;
import mis.domain.Part;
import mis.domain.User;
import common.dao.BaseDao;

import java.util.*;

public interface UserDao extends BaseDao<User>{
	/**
	 * �����˻����������ѯ�û�
	 * @param user �����˻�����������û�����
	 * @return �û�
	 */
	public User findByAccountAndPass(User user);
	/**
	 * �����˻�����ѯ�û�
	 * @param account �˻���
	 * @return �û�
	 */
	public User findByAccount(String account);
	/**
	 * �����û�������ѯ�û�����
	 * @param name �û�����
	 * @return �û�����
	 */
	public List<User> findByName(String name);
	
	/**
	 * ���ݲ��Ų�ѯ�û�����
	 * @param department ����
	 * @return �û�����
	 */
	public List<User> findByDepartment(Department department);
	
	/**
	 * ���ݽ�ɫ��ѯ�û�����
	 * @param part ��ɫ
	 * @return �û�����
	 */
	public List<User> findByPart(Part part);

}
