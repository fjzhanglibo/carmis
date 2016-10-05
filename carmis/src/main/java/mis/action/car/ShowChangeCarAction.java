package mis.action.car;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarBean;
import mis.bean.RankBean;
import mis.bean.UserBean;
import mis.domain.Rank;

public class ShowChangeCarAction extends BaseAction {
	private Integer carId;
	private CarBean carBean;
	private List<RankBean> ranks;
	private Integer hasCustomer;
	private Integer showBut=1;
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
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
	
	public Integer isHasCustomer() {
		return hasCustomer;
	}
	public void setHasCustomer(Integer hasCustomer) {
		this.hasCustomer = hasCustomer;
	}
	public Integer getHasCustomer() {
		return hasCustomer;
	}
	public Integer getShowBut() {
		return showBut;
	}
	public void setShowBut(Integer showBut) {
		this.showBut = showBut;
	}
	
	public String execute() throws Exception{
		
		ActionContext ctx = ActionContext.getContext();
		
		if(this.getShowBut()==0){
			this.setCarBean(bgr.getCarBean(getCarId()));
			this.setRanks(bgr.getRankBeans());
			ctx.put("type", 16);
			return "add";
		}

		if(this.getCarId()!=null){
			this.setCarBean(bgr.getCarBean(getCarId()));
			this.setRanks(bgr.getRankBeans());
			if(bgr.hasCustomer(getCarId())){
				this.setHasCustomer(1);
			}
			else this.setHasCustomer(2);
		
			ctx.put("type", 13);
			return SUCCESS;
		}
		
		else {
			this.setRanks(bgr.getRankBeans());
			ctx.put("type", 16);
			return "add";
			
		}
	}

}
