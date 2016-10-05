package mis.dao.impl;

import java.util.List;


import common.dao.impl.BaseDaoHibernate4;
import mis.dao.RightsDao;
import mis.domain.Rights;


public class RightsDaoHibernate4 extends BaseDaoHibernate4<Rights>
	implements RightsDao
{
	/**
	 * ����Ȩ�����Ʋ�ѯȨ��
	 * @param rights ����ָ��Ȩ�����Ƶ�Ȩ��
	 * @return ����ָ���������Ƶ�Ȩ�޼���
	 */
	public List<Rights> findByName(Rights rights){
		
		return find("select p from Rights p where p.rightsName = ?0"
				, rights.getRightsName() );
		
	}

	/**
	 * ����Ȩ�����Ʋ�ѯȨ��
	 * @param name Ȩ������
	 * @return �����������Ƶ�Ȩ��
	 */
	public Rights findByName(String name){
		List<Rights> rights = find("select p from Rights p where p.rightsName = ?0"
				, name);
			if (rights!= null && rights.size() >= 1)
			{
				return rights.get(0);
			}
			return null;
	}
	
	/**
	 * ��ѯ����Ȩ��
	 * @return Ȩ�޼���
	 */
	public List<Rights> findAllRights(){
		return findAll(Rights.class);
	}
}
