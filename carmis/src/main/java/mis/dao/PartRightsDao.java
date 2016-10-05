package mis.dao;

import mis.domain.Part;
import mis.domain.Rights;
import mis.domain.PartRights;


import common.dao.BaseDao;

import java.util.*;

public interface PartRightsDao extends BaseDao<PartRights>{
	/**
	 * 根据角色名称查询角色权限
	 * @param part 包含指定角色名称的角色
	 * @return 符合指定角色名称的角色权限集合
	 */
	List<PartRights> findByPart(Part part);
	/**
	 * 根据权限名称查询角色权限
	 * @param rights 包含指定权限名称的权限
	 * @return 符合指定权限名称的角色权限集合
	 */
	List<PartRights> findByRights(Rights rights);
	/**
	 * 根据角色和权限查询角色权限
	 * @param part 角色
	 * @param rights 权限
	 * @return 角色权限
	 */
	PartRights findByPartRights(Part part , Rights right);
	
}
