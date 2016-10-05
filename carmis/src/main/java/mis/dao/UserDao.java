package mis.dao;

import mis.domain.Department;
import mis.domain.Part;
import mis.domain.User;
import common.dao.BaseDao;

import java.util.*;

public interface UserDao extends BaseDao<User>{
	/**
	 * 根据账户名和密码查询用户
	 * @param user 包含账户名和密码的用户对象
	 * @return 用户
	 */
	public User findByAccountAndPass(User user);
	/**
	 * 根据账户名查询用户
	 * @param account 账户名
	 * @return 用户
	 */
	public User findByAccount(String account);
	/**
	 * 根据用户姓名查询用户集合
	 * @param name 用户姓名
	 * @return 用户集合
	 */
	public List<User> findByName(String name);
	
	/**
	 * 根据部门查询用户集合
	 * @param department 部门
	 * @return 用户集合
	 */
	public List<User> findByDepartment(Department department);
	
	/**
	 * 根据角色查询用户集合
	 * @param part 角色
	 * @return 用户集合
	 */
	public List<User> findByPart(Part part);

}
