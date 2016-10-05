package mis.action.service;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarBean;
import mis.bean.CustomerBean;
import mis.bean.RankBean;
import mis.domain.Service;

public class ChangeServiceAction extends BaseAction {
	private Service service;
	private List<Service> services;
	private Integer serviceCount;
	
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
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

	public String execute() throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		
		Service s = bgr.getService(this.getService().getServiceNumber());

		if(s!=null&&s.getServiceId()!=this.getService().getServiceId()){
			super.addActionMessage("服务编号重复，请重新输入");
			return INPUT;
		}
		
		
		bgr.changeService(getService());
		
		List<Service> ss = bgr.getServices();
		this.setServices(ss);
	
		this.setServiceCount(ss.size());
		ctx.put("type", 22);
		
		return SUCCESS;
		
	}
}
