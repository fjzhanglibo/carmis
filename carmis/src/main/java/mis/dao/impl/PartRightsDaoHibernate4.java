package mis.dao.impl;


import java.util.List;


import common.dao.impl.BaseDaoHibernate4;
import mis.dao.PartRightsDao;
import mis.domain.Part;
import mis.domain.Rights;
import mis.domain.PartRights;

public class PartRightsDaoHibernate4  extends BaseDaoHibernate4<PartRights> implements PartRightsDao{
	/**
	 * 根据角色名称查询角色权限
	 * @param part 包含指定角色名称的角色
	 * @return 符合指定角色名称的角色权限集合
	 */
	public List<PartRights> findByPart(Part part){
		return find("from PartRights as p where p.part=?0" , part);
	}
	/**
	 * 根据权限名称查询角色权限
	 * @param rights 包含指定权限名称的权限
	 * @return 符合指定权限名称的角色权限集合
	 */
	public List<PartRights> findByRights(Rights rights){
		return find("from PartRighs ad pr where pr.ringhs=?0" , rights);
	}
	/**
	 * 根据角色和权限查询角色权限
	 * @param part 角色
	 * @param rights 权限
	 * @return 角色权限
	 */
	public PartRights findByPartRights(Part part , Rights rights){
		List<PartRights> al = findByPart(part);
		if (al != null || al.size() > 1)
		{
			for (PartRights partRights : al)
			{
				if (partRights.getRights() == rights )
				{
					return partRights;
				}
			}
		}
		return null;
	}
}
