package mis.action.customer;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarBean;
import mis.bean.CustomerBean;
import mis.domain.Customer;

public class ChangeCustomerAction extends BaseAction {
	private CustomerBean customerBean;
	private List<CustomerBean> customers;
	private Integer customerCount;

	public CustomerBean getCustomerBean() {
		return customerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}
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

	public String execute() throws Exception {
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		

		Customer c = bgr.getCustomer(this.getCustomerBean().getCustomerIdCard());
		if(c!=null&&c.getCustomerId()!=this.getCustomerBean().getCustomerId()){
			super.addActionMessage("���֤�����ظ������������룡");
			
			
			return INPUT;
		}
		c = bgr.getCustomerByTel(this.getCustomerBean().getCustomerTel());
		if(c!=null&&c.getCustomerId()!=this.getCustomerBean().getCustomerId()){
			super.addActionMessage("�绰�����ظ������������룡");
			return INPUT;
		}
		
		
		bgr.changeCustomer(getCustomerBean());
		
		List<CustomerBean> cbs = bgr.getCustomerBeans();
		this.setCustomers(cbs);
		this.setCustomerCount(cbs.size());
		ctx.put("type", 17);
		return SUCCESS;
		
	}
}
