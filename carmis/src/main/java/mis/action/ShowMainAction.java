package mis.action;


import java.util.List;
import java.util.ListIterator;

import mis.action.WebConstant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;

import org.apache.struts2.interceptor.*;

import mis.domain.Department;
import mis.domain.Part;
import mis.domain.Rights;
import mis.domain.User;
import mis.service.BaseManager;
import mis.service.impl.BaseManagerImpl;
import mis.action.base.BaseAction;
import mis.bean.UserBean;

public class ShowMainAction extends BaseAction {
	
	// ��װ�������

	
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
			
			
			addActionMessage("���Ѿ��ɹ���¼ϵͳ");
			return SUCCESS;
	
	}

}

