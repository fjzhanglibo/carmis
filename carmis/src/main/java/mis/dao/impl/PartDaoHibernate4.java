package mis.dao.impl;
import java.util.List;

import mis.dao.PartDao;
import mis.domain.Part;

import common.dao.impl.BaseDaoHibernate4;

public class PartDaoHibernate4 extends BaseDaoHibernate4<Part> implements PartDao{
	

	/**
	 * ���ݽ�ɫ���Ʋ�ѯ��ɫ
	 * @param part ����ָ����ɫ���ƵĽ�ɫ
	 * @return ����ָ���������ƵĽ�ɫ����
	 */
	public List<Part> findByName(Part part){
		
		return find("select p from Part p where p.partName = ?0"
				, part.getPartName() );
		
	}

	/**
	 * ���ݽ�ɫ���Ʋ�ѯ��ɫ
	 * @param name ��ɫ����
	 * @return �����������ƵĽ�ɫ
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
	 * ��ѯ���н�ɫ
	 * @return ��ɫ����
	 */
	public List<Part> findAllPart(){
		return findAll(Part.class);
	}
}
