package mis.action.base;

import mis.service.BaseManager;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	// ������ҵ���߼����
	protected BaseManager bgr;
	
	// ����ע��ҵ���߼�����������setter����
	public void setBaseManager(BaseManager bgr) {
		this.bgr = bgr;
	}

	public BaseManager getBgr() {
		return bgr;
	}
	
		
}
