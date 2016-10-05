package mis.action.search;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.bean.CarBean;
import mis.bean.CustomerBean;
import mis.action.base.BaseAction;

public class SearchByCustomerAction extends BaseAction {
	List<CustomerBean> customers;
	Integer customerCount;
	String str;


	
	
	public List<CustomerBean> getCustomers() {
		return customers;
	}
	public void setCustomers(List<CustomerBean> customers) {
		this.customers = customers;
	}
	public Integer getCustomerCount() {
		return customerCount;
	}
	public void setCustomerCount(Integer customerCount) {
		this.customerCount = customerCount;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}



	public String execute() throws Exception {
		// ´´½¨ActionContextÊµÀý
		ActionContext ctx = ActionContext.getContext();
		
		List<CustomerBean> cbs = bgr.getCustomerBeans();
		if(this.getStr() != null){

			List<CustomerBean> cs = bgr.searchCustomerBeans(cbs, str);
			this.setCustomers(cs);
			this.setCustomerCount(cs.size());
		}
		
		ctx.put("type", 26);
		
		return SUCCESS;
		
		
		
	}
}
