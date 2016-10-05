package mis.action.checkout;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.*;

public class ShowCheckoutAction extends BaseAction {
	private List<CarServiceBean> services;
	private Integer carId;
	private Integer serviceCount;
	private String carNumber;

	public List<CarServiceBean> getServices() {
		return services;
	}

	public void setServices(List<CarServiceBean> services) {
		this.services = services;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}	
	public Integer getServiceCount() {
		return serviceCount;
	}
	public void setServiceCount(Integer serviceCount) {
		this.serviceCount = serviceCount;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String execute() throws Exception {
		// ´´½¨ActionContextÊµÀý
		ActionContext ctx = ActionContext.getContext();
		
		List<CarServiceBean> csbs = bgr.getCarServices(getCarId());
		this.setServices(csbs);
		this.setServiceCount(csbs.size());
		this.setCarNumber(bgr.getCar(getCarId()).getCarNumber());
		
		ctx.put("type", 15);
		return SUCCESS;
	}
}
