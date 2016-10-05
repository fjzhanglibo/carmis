package mis.action.car;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarBean;
import mis.bean.CustomerBean;
import mis.domain.Customer;

public class AddCustomerAction extends BaseAction {
	private CustomerBean customerBean;
	private Integer carId;
	private Integer checkout;

	

	public CustomerBean getCustomerBean() {
		return customerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public Integer getCheckout() {
		return checkout;
	}
	public void setCheckout(Integer checkout) {
		this.checkout = checkout;
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
		
		
		
		if(!this.getCustomerBean().getCustomerName().equals("")){
			bgr.addCustomer(getCustomerBean(), getCarId());
		}
		ctx.put("type", 0);
		if(this.getCheckout()!=null){
			return "checkout";
		}
		else return SUCCESS;
		
	}
}
