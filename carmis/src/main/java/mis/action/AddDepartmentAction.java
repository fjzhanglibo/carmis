package mis.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.DepartmentBean;
import mis.domain.Department;

public class AddDepartmentAction extends BaseAction {
	private Department dep;
	private List<DepartmentBean> departments;

	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	public List<DepartmentBean> getDepartments() {
		return departments;
	}
	public void setDepartments(List<DepartmentBean> departments) {
		this.departments = departments;
	}
	
	public String execute() throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		
		Department d = bgr.getDepartment(getDep());
		if(d!=null){
			super.addActionMessage("用户名重复");
			return INPUT;
		}
		//添加部门
		if(dep.getDepartmentName()!=null){
			bgr.addDepartment(dep);
		}
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
