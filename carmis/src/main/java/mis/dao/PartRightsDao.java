package mis.dao;

import mis.domain.Part;
import mis.domain.Rights;
import mis.domain.PartRights;


import common.dao.BaseDao;

import java.util.*;

public interface PartRightsDao extends BaseDao<PartRights>{
	/**
	 * ���ݽ�ɫ���Ʋ�ѯ��ɫȨ��
	 * @param part ����ָ����ɫ���ƵĽ�ɫ
	 * @return ����ָ����ɫ���ƵĽ�ɫȨ�޼���
	 */
	List<PartRights> findByPart(Part part);
	/**
	 * ����Ȩ�����Ʋ�ѯ��ɫȨ��
	 * @param rights ����ָ��Ȩ�����Ƶ�Ȩ��
	 * @return ����ָ��Ȩ�����ƵĽ�ɫȨ�޼���
	 */
	List<PartRights> findByRights(Rights rights);
	/**
	 * ���ݽ�ɫ��Ȩ�޲�ѯ��ɫȨ��
	 * @param part ��ɫ
	 * @param rights Ȩ��
	 * @return ��ɫȨ��
	 */
	PartRights findByPartRights(Part part , Rights right);
	
}
