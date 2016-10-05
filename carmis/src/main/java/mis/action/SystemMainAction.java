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

		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		
		//��ȡ����Ȩ��
		List<Rights> rights = bgr.getRights();
		setRightsList(rights);
		//��ȡȨ�޸���
		Integer rightsCount = rights.size();
		
		//��ȡ���н�ɫ
		List<Part> parts = bgr.getPart();
		setPartList(parts);		
		//��ȡ��ɫ����
		Integer partCount = parts.size();	
		
		//��ȡ����
		List<Department> deps = bgr.getDepartment();
		setDepartmentList(deps);
		//��ȡ���Ÿ���
		Integer departmentCount = deps.size();
		
		
		//��ȡ�û�Bean
		List<UserBean> userBean = bgr.getUsers();
		setUsers(userBean);		
		//��ȡ�û�����
		Integer userCount = userBean.size();
		
		
		ctx.put("rightsCount", rightsCount);
		ctx.put("partCount", partCount);
		ctx.put("departmentCount", departmentCount);
		ctx.put("userCount", userCount);
		ctx.put("type", 1);
		
	
		return SUCCESS;
	}

}
