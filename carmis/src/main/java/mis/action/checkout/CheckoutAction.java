package mis.action.checkout;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarServiceBean;
import mis.bean.PartBean;
import mis.domain.Part;
import mis.domain.PartRights;

public class CheckoutAction extends BaseAction {
	private Integer carId;
	private Integer[] serviceId;
	private List<CarServiceBean> services;
	private double sum;
	private String carNumber;
	private Integer serviceCount;
	
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public Integer[] getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer[] serviceId) {
		this.serviceId = serviceId;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public List<CarServiceBean> getServices() {
		return services;
	}
	public void setServices(List<CarServiceBean> services) {
		this.services = services;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
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
		
		this.setSum(bgr.addCarService(getServiceId(), getCarId()));
		this.setServices(bgr.getCarServices(getServiceId(), getCarId()));
		this.setCarNumber(bgr.getCar(getCarId()).getCarNumber());
		this.setServiceCount(this.getServiceId().length);
		
		ctx.put("type", 0);
		addActionMessage("消费总额："+this.getSum());
		
		return SUCCESS;
	}
}
