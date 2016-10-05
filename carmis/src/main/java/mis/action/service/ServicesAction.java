package mis.action.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.DepartmentBean;
import mis.bean.PartBean;
import mis.bean.UserBean;
import mis.domain.Department;
import mis.domain.Rights;
import mis.domain.Service;

public class ServicesAction extends BaseAction {
	private List<Service> services;
	private Integer serviceCount;

	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}
	public Integer getServiceCount() {
		return serviceCount;
	}
	public void setServiceCount(Integer serviceCount) {
		this.serviceCount = serviceCount;
	}
	
	public String execute() throws Exception{
		// ´´½¨ActionContextÊµÀý
		ActionContext ctx = ActionContext.getContext();

		List<Service> ss = bgr.getServices();
		this.setServices(ss);
	
		this.setServiceCount(ss.size());
		ctx.put("type", 22);
		
		
		
		return SUCCESS;
	}
	

}
