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
	 * 根据账户名和密码查询用户
	 * @param user 包含账户名和密码的用户对象
	 * @return 用户
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
	 * 根据账户名查询用户
	 * @param userAccount 账户名
	 * @return 用户
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
	 * 根据用户姓名查询用户集合
	 * @param name 用户姓名
	 * @return 用户集合
	 */
	public List<User> findByName(String name){
		return find("select p from User p where p.userName = ?0" , name);
	}
	
	/**
	 * 根据部门查询用户集合
	 * @param department 部门
	 * @return 用户集合
	 */
	public List<User> findByDepartment(Department department){
		return find("select p from User p where p.department = ?0" , department);
	}
	
	/**
	 * 根据角色查询用户集合
	 * @param part 角色
	 * @return 用户集合
	 */
	public List<User> findByPart(Part part){
		return find("select p from User p where p.part = ?0" , part);
	}

}
