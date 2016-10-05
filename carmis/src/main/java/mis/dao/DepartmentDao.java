package mis.dao;

import mis.domain.Department;

import common.dao.BaseDao;

import java.util.*;

public interface DepartmentDao extends BaseDao<Department>{
	/**
	 * ���ݲ������Ʋ�ѯ����
	 * @param dep ����ָ���������ƵĲ���
	 * @return ����ָ���������ƵĲ��ż���
	 */
	public List<Department> findByName(Department dep);
	
	/**
	 * ���ݲ������Ʋ�ѯ����
	 * @param name ��������
	 * @return �����������ƵĲ���
	 */
	public Department findByName(String name);
}
