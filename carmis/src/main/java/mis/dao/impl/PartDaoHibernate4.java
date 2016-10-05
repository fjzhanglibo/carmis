package mis.dao.impl;
import java.util.List;

import mis.dao.PartDao;
import mis.domain.Part;

import common.dao.impl.BaseDaoHibernate4;

public class PartDaoHibernate4 extends BaseDaoHibernate4<Part> implements PartDao{
	

	/**
	 * 根据角色名称查询角色
	 * @param part 包含指定角色名称的角色
	 * @return 符合指定期限名称的角色集合
	 */
	public List<Part> findByName(Part part){
		
		return find("select p from Part p where p.partName = ?0"
				, part.getPartName() );
		
	}

	/**
	 * 根据角色名称查询角色
	 * @param name 角色名称
	 * @return 符合期限名称的角色
	 */
	public Part findByName(String name){
		List<Part> part = find("select p from Part p where p.partName = ?0"
				, name);
			if (part!= null && part.size() >= 1)
			{
				return part.get(0);
			}
			return null;
	}
	
	/**
	 * 查询所有角色
	 * @return 角色集合
	 */
	public List<Part> findAllPart(){
		return findAll(Part.class);
	}
}
