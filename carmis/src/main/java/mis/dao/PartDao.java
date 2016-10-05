package mis.dao;

import java.util.List;

import mis.domain.Part;

import common.dao.BaseDao;

public interface PartDao extends BaseDao<Part>{
	/**
	 * ���ݽ�ɫ���Ʋ�ѯ��ɫ
	 * @param part ����ָ����ɫ���ƵĽ�ɫ
	 * @return ����ָ����ɫ���ƵĽ�ɫ����
	 */
	List<Part> findByName(Part part);

	/**
	 * ���ݽ�ɫ���Ʋ�ѯ��ɫ
	 * @param name ��ɫ����
	 * @return �����������ƵĽ�ɫ
	 */
	Part findByName(String name);
	/**
	 * ��ѯ���н�ɫ
	 * @return ��ɫ����
	 */
	public List<Part> findAllPart();
}

