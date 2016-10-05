package mis.dao.impl;

import java.util.List;

import mis.dao.DepartmentDao;
import mis.domain.Department;
import common.dao.impl.BaseDaoHibernate4;

public class DepartmentDaoHibernate4 extends BaseDaoHibernate4<Department> implements DepartmentDao {
	/**
	 * 根据部门名称查询部门
	 * @param dep 包含指定部门名称的部门
	 * @return 符合指定部门名称的部门集合
	 */
	public List<Department> findByName(Department dep){
		return find("select p from Department p where p.departmentName = ?0"
				, dep.getDepartmentName() );
	}
	
	/**
	 * 根据部门名称查询部门
	 * @param name 部门名称
	 * @return 符合期限名称的部门
	 */
	public Department findByName(String name){
		List<Department> dep = find("select p from Department p where p.departmentName = ?0"
				, name);
			if (dep!= null && dep.size() >= 1)
			{
				return dep.get(0);
			}
			return null;
	}


}
