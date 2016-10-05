package mis.dao.impl;


import java.util.List;


import common.dao.impl.BaseDaoHibernate4;
import mis.dao.PartRightsDao;
import mis.domain.Part;
import mis.domain.Rights;
import mis.domain.PartRights;

public class PartRightsDaoHibernate4  extends BaseDaoHibernate4<PartRights> implements PartRightsDao{
	/**
	 * ���ݽ�ɫ���Ʋ�ѯ��ɫȨ��
	 * @param part ����ָ����ɫ���ƵĽ�ɫ
	 * @return ����ָ����ɫ���ƵĽ�ɫȨ�޼���
	 */
	public List<PartRights> findByPart(Part part){
		return find("from PartRights as p where p.part=?0" , part);
	}
	/**
	 * ����Ȩ�����Ʋ�ѯ��ɫȨ��
	 * @param rights ����ָ��Ȩ�����Ƶ�Ȩ��
	 * @return ����ָ��Ȩ�����ƵĽ�ɫȨ�޼���
	 */
	public List<PartRights> findByRights(Rights rights){
		return find("from PartRighs ad pr where pr.ringhs=?0" , rights);
	}
	/**
	 * ���ݽ�ɫ��Ȩ�޲�ѯ��ɫȨ��
	 * @param part ��ɫ
	 * @param rights Ȩ��
	 * @return ��ɫȨ��
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
