package mis.action.car;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.bean.*;
import mis.action.base.BaseAction;

public class CarExpensesAction extends BaseAction {
	List<ExpenseBean> expenses;
	Integer count;
	Integer carId;
	String carNumber;
	public List<ExpenseBean> getExpenses() {
		return expenses;
	}
	public void setExpenses(List<ExpenseBean> expenses) {
		this.expenses = expenses;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
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
				
		if(this.getCarNumber()!=null){
			int i = bgr.getCar(carNumber).getCarId();
			this.setExpenses(bgr.getExpense(i));
			this.setCount(bgr.getExpense(i).size());
		}
		else{
			this.setExpenses(bgr.getExpense(getCarId()));
			this.setCount(bgr.getExpense(getCarId()).size());
		}
		
		ctx.put("type", 12);
		return SUCCESS;
	}
	

}
