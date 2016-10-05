package mis.action.car;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarBean;
import mis.bean.CustomerBean;
import mis.bean.RankBean;
import mis.domain.Car;

public class AddCarAction extends BaseAction {
	
	private Car car;
	private CarBean carBean;
	private List<RankBean> ranks;
	private Integer carId;
	private int showBut;
	
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public CarBean getCarBean() {
		return carBean;
	}
	public void setCarBean(CarBean carBean) {
		this.carBean = carBean;
	}
	public List<RankBean> getRanks() {
		return ranks;
	}
	public void setRanks(List<RankBean> ranks) {
		this.ranks = ranks;
	}
	
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	
	public int getShowBut() {
		return showBut;
	}
	public void setShowBut(int showBut) {
		this.showBut = showBut;
	}
	public String execute() throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		
		Car c = bgr.getCar(this.getCar().getCarNumber());
		if(c!=null){
			super.addActionMessage("车牌号重复，请重新输入！");
			return INPUT;
		}
		

		Integer carId = bgr.addCar(getCar());
		this.setCarBean(bgr.getCarBean(carId));
		this.setRanks(bgr.getRankBeans());
		this.setShowBut(0);
		ctx.put("type", 16);
		
		
		return SUCCESS;
		
	}
}
