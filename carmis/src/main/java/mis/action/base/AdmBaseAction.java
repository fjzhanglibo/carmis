package mis.action.base;

import mis.service.AdmManager;

import com.opensymphony.xwork2.ActionSupport;

public class AdmBaseAction extends ActionSupport{
	// 依赖的业务逻辑组件
	protected AdmManager agr;
	
	// 依赖注入业务逻辑组件所必须的setter方法
	public void setAdmManger(AdmManager agr) {
		this.agr = agr;
	}
	
}
