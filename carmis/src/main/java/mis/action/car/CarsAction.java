package mis.action.car;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.bean.CarBean;
import mis.action.base.BaseAction;

public class CarsAction extends BaseAction {
	List<CarBean> cars;
	Integer carCount;
	String str;
	String checkout;

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
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}	
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public String execute() throws Exception {
		// ´´½¨ActionContextÊµÀý
		ActionContext ctx = ActionContext.getContext();
		
		List<CarBean> cbs = bgr.getCarBeans();
		if(this.getStr() != null){

			List<CarBean> cs = bgr.searchCarBeans(cbs, str);

			this.setCars(cs);
			this.setCarCount(cs.size());
		}
		else{
			this.setCars(cbs);
			this.setCarCount(cbs.size());
		}
		
		if(checkout!=null){
			ctx.put("type", 14);
			return "checkout";
		}
		else{
			ctx.put("type", 11);
			return SUCCESS;
		}
		
		
		
	}
}
