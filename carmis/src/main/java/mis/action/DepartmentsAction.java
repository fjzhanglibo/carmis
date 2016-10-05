package mis.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.DepartmentBean;
import mis.bean.UserBean;
import mis.domain.Department;

public class DepartmentsAction extends BaseAction {
	private List<DepartmentBean> departments;
	
	public List<DepartmentBean> getDepartments() {
		return departments;
	}
	public void setDepartments(List<DepartmentBean> departments) {
		this.departments = departments;
	}

	public String execute() throws Exception{
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//��ȡ����
		List<DepartmentBean> deps = bgr.getDepartments();
		this.setDepartments(deps);
		//��ȡ���Ÿ���
		Integer departmentCount = deps.size();
		
		ctx.put("departmentCount", departmentCount);
		ctx.put("type", 4);
		
		
		
		return SUCCESS;
	}

}
