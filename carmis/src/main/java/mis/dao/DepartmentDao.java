package mis.dao;

import mis.domain.Department;

import common.dao.BaseDao;

import java.util.*;

public interface DepartmentDao extends BaseDao<Department>{
	/**
	 * 根据部门名称查询部门
	 * @param dep 包含指定部门名称的部门
	 * @return 符合指定部门名称的部门集合
	 */
	public List<Department> findByName(Department dep);
	
	/**
	 * 根据部门名称查询部门
	 * @param name 部门名称
	 * @return 符合期限名称的部门
	 */
	public Department findByName(String name);
}
