package mis.action.service;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarBean;
import mis.bean.RankBean;
import mis.bean.UserBean;
import mis.domain.Rank;
import mis.domain.Service;

public class ShowChangeServiceAction extends BaseAction {
	private Integer serviceId;
	private Service service;
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	public String execute() throws Exception{
		
		ActionContext ctx = ActionContext.getContext();

		if(this.getServiceId()!=null){
			this.setService(bgr.getService(getServiceId()));
		
			ctx.put("type",23);
			return SUCCESS;
		}
		
		else {

			ctx.put("type",24 );
			return "add";
			
		}
	}

}
