package mis.dao;

import java.util.*;


import common.dao.BaseDao;
import mis.domain.*;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
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
	 * ����Ȩ�����Ʋ�ѯȨ��
	 * @param rights ����ָ��Ȩ�����Ƶ�Ȩ��
	 * @return ����ָ���������Ƶ�Ȩ�޼���
	 */
	List<Rights> findByName(Rights rights);

	/**
	 * ����Ȩ�����Ʋ�ѯȨ��
	 * @param name Ȩ������
	 * @return �����������Ƶ�Ȩ��
	 */
	Rights findByName(String name);
	
	/**
	 * ��ѯ����Ȩ��
	 * @return Ȩ�޼���
	 */
	public List<Rights> findAllRights();
}
