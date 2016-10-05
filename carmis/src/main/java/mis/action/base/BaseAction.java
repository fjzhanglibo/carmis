package mis.action.base;

import mis.service.BaseManager;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	// 依赖的业务逻辑组件
	protected BaseManager bgr;
	
	// 依赖注入业务逻辑组件所必须的setter方法
	public void setBaseManager(BaseManager bgr) {
		this.bgr = bgr;
	}

	public BaseManager getBgr() {
		return bgr;
	}
	
		
}
