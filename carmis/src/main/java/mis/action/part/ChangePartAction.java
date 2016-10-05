package mis.action.part;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.DepartmentBean;
import mis.domain.Department;

public class ChangePartAction extends BaseAction {
	private Department department;
	private List<DepartmentBean> departments;
	private String depName;

	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<DepartmentBean> getDepartments() {
		return departments;
	}
	public void setDepartments(List<DepartmentBean> departments) {
		this.departments = departments;
	}	
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	public String execute() throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		
		bgr.changeDepartment(getDepName() , getDepartment());
		
		//获取部门
		List<DepartmentBean> deps = bgr.getDepartments();
		this.setDepartments(deps);
		//获取部门个数
		Integer departmentCount = deps.size();
		
		ctx.put("type", 7);
		ctx.put("departmentCount", departmentCount);
		
		return SUCCESS;
	}
	
}
