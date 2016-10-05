package mis.action;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.domain.Department;

public class ShowChangeDepartmentAction extends BaseAction {
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}



	public String execute() throws Exception {
		// ´´½¨ActionContextÊµÀý
				ActionContext ctx = ActionContext.getContext();
				
		if( department !=null){

			Department dep = bgr.getDepartment(getDepartment());
			

			this.setDepartment(dep);
		}
		ctx.put("type", 5);
		return SUCCESS;
	}
}
