package mis.dao;

import java.util.List;

import mis.domain.Part;

import common.dao.BaseDao;

public interface PartDao extends BaseDao<Part>{
	/**
	 * 根据角色名称查询角色
	 * @param part 包含指定角色名称的角色
	 * @return 符合指定角色名称的角色集合
	 */
	List<Part> findByName(Part part);

	/**
	 * 根据角色名称查询角色
	 * @param name 角色名称
	 * @return 符合期限名称的角色
	 */
	Part findByName(String name);
	/**
	 * 查询所有角色
	 * @return 角色集合
	 */
	public List<Part> findAllPart();
}

