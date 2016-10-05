package mis.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.DepartmentBean;

public class DelDepartmentAction extends BaseAction {
	private String depName;
	private List<DepartmentBean> departments;

	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public List<DepartmentBean> getDepartments() {
		return departments;
	}
	public void setDepartments(List<DepartmentBean> departments) {
		this.departments = departments;
	}
	
	public String execute() throws Exception{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		
		bgr.delDepartment(getDepName());
		//获取部门
		List<DepartmentBean> deps = bgr.getDepartments();
		this.setDepartments(deps);
		//获取部门个数
		Integer departmentCount = deps.size();
		
		ctx.put("type", 4);
		ctx.put("departmentCount", departmentCount);
		
		return SUCCESS;
	}
	
}
