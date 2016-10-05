package mis.action.car;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarBean;

public class ChangeCarAction extends BaseAction {
	private CarBean carBean;
	List<CarBean> cars;
	Integer carCount;

	public CarBean getCarBean() {
		return carBean;
	}

	public void setCarBean(CarBean carBean) {
		this.carBean = carBean;
	}
	
	public List<CarBean> getCars() {
		return cars;
	}

	public void setCars(List<CarBean> cars) {
		this.cars = cars;
	}

	public Integer getCarCount() {
		return carCount;
	}

	public void setCarCount(Integer carCount) {
		this.carCount = carCount;
	}

	public String execute() throws Exception {
		// ´´½¨ActionContextÊµÀý
		ActionContext ctx = ActionContext.getContext();
		
		bgr.changeCar(getCarBean());
		
		List<CarBean> cbs = bgr.getCarBeans();
		this.setCars(cbs);
		this.setCarCount(cbs.size());
		
		ctx.put("type", 11);
		
		return SUCCESS;
		
	}
}
