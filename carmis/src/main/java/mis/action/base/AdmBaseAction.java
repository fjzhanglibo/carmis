package mis.action.base;

import mis.service.AdmManager;

import com.opensymphony.xwork2.ActionSupport;

public class AdmBaseAction extends ActionSupport{
	// ������ҵ���߼����
	protected AdmManager agr;
	
	// ����ע��ҵ���߼�����������setter����
	public void setAdmManger(AdmManager agr) {
		this.agr = agr;
	}
	
}
