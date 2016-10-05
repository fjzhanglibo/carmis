package mis.dao.impl;

import java.util.List;

import mis.dao.DepartmentDao;
import mis.domain.Department;
import common.dao.impl.BaseDaoHibernate4;

public class DepartmentDaoHibernate4 extends BaseDaoHibernate4<Department> implements DepartmentDao {
	/**
	 * ���ݲ������Ʋ�ѯ����
	 * @param dep ����ָ���������ƵĲ���
	 * @return ����ָ���������ƵĲ��ż���
	 */
	public List<Department> findByName(Department dep){
		return find("select p from Department p where p.departmentName = ?0"
				, dep.getDepartmentName() );
	}
	
	/**
	 * ���ݲ������Ʋ�ѯ����
	 * @param name ��������
	 * @return �����������ƵĲ���
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
