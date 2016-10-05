package mis.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.UserBean;
import mis.domain.Department;
import mis.domain.Part;
import mis.domain.Rights;

public class SystemMainAction extends BaseAction {
	private List<UserBean> users;
	private List<Part> partList;
	private List<Department> departmentList;
	private List<Rights> rightsList;
	
	public List<UserBean> getUsers() {
		return users;
	}
	public void setUsers(List<UserBean> users) {
		this.users = users;
	}	
	public List<Part> getPartList() {
		return partList;
	}
	public void setPartList(List<Part> partList) {
		this.partList = partList;
	}	
	public List<Department> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}
	public List<Rights> getRightsList() {
		return rightsList;
	}
	public void setRightsList(List<Rights> rightsList) {
		this.rightsList = rightsList;
	}
	
	public String execute() throws Exception {

		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		
		//获取所有权限
		List<Rights> rights = bgr.getRights();
		setRightsList(rights);
		//获取权限个数
		Integer rightsCount = rights.size();
		
		//获取所有角色
		List<Part> parts = bgr.getPart();
		setPartList(parts);		
		//获取角色个数
		Integer partCount = parts.size();	
		
		//获取部门
		List<Department> deps = bgr.getDepartment();
		setDepartmentList(deps);
		//获取部门个数
		Integer departmentCount = deps.size();
		
		
		//获取用户Bean
		List<UserBean> userBean = bgr.getUsers();
		setUsers(userBean);		
		//获取用户个数
		Integer userCount = userBean.size();
		
		
		ctx.put("rightsCount", rightsCount);
		ctx.put("partCount", partCount);
		ctx.put("departmentCount", departmentCount);
		ctx.put("userCount", userCount);
		ctx.put("type", 1);
		
	
		return SUCCESS;
	}

}
