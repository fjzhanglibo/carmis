package mis.dao;

import java.util.*;


import common.dao.BaseDao;
import mis.domain.*;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public interface RightsDao extends BaseDao<Rights>
{
	/**
	 * 根据权限名称查询权限
	 * @param rights 包含指定权限名称的权限
	 * @return 符合指定期限名称的权限集合
	 */
	List<Rights> findByName(Rights rights);

	/**
	 * 根据权限名称查询权限
	 * @param name 权限名称
	 * @return 符合期限名称的权限
	 */
	Rights findByName(String name);
	
	/**
	 * 查询所有权限
	 * @return 权限集合
	 */
	public List<Rights> findAllRights();
}
