package mis.dao.impl;

import java.util.List;


import common.dao.impl.BaseDaoHibernate4;
import mis.dao.RightsDao;
import mis.domain.Rights;


public class RightsDaoHibernate4 extends BaseDaoHibernate4<Rights>
	implements RightsDao
{
	/**
	 * 根据权限名称查询权限
	 * @param rights 包含指定权限名称的权限
	 * @return 符合指定期限名称的权限集合
	 */
	public List<Rights> findByName(Rights rights){
		
		return find("select p from Rights p where p.rightsName = ?0"
				, rights.getRightsName() );
		
	}

	/**
	 * 根据权限名称查询权限
	 * @param name 权限名称
	 * @return 符合期限名称的权限
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
	 * 查询所有权限
	 * @return 权限集合
	 */
	public List<Rights> findAllRights(){
		return findAll(Rights.class);
	}
}
