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
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		
		Department d = bgr.getDepartment(getDep());
		if(d!=null){
			super.addActionMessage("�û����ظ�");
			return INPUT;
		}
		//��Ӳ���
		if(dep.getDepartmentName()!=null){
			bgr.addDepartment(dep);
		}
		//��ȡ����
		List<DepartmentBean> deps = bgr.getDepartments();
		this.setDepartments(deps);
		//��ȡ���Ÿ���
		Integer departmentCount = deps.size();
		
		ctx.put("type", 4);
		ctx.put("departmentCount", departmentCount);
		
		return SUCCESS;
	}
	
}
