package mis.action.customer;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarBean;
import mis.bean.CustomerBean;
import mis.bean.RankBean;
import mis.bean.UserBean;
import mis.domain.Rank;

public class ShowChangeCustomerAction extends BaseAction {
	private Integer customerId;
	private CustomerBean customerBean;
	private List<RankBean> ranks;
		
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public CustomerBean getCustomerBean() {
		return customerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}
	public List<RankBean> getRanks() {
		return ranks;
	}
	public void setRanks(List<RankBean> ranks) {
		this.ranks = ranks;
	}


	public String execute() throws Exception{
		
		ActionContext ctx = ActionContext.getContext();

		
			this.setCustomerBean(bgr.getCustomerBean(getCustomerId()));
			this.setRanks(bgr.getRankBeans());
		
			ctx.put("type", 18);
			return SUCCESS;		
		
	}

}
