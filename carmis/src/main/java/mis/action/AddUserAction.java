package mis.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.UserBean;
import mis.domain.Department;
import mis.domain.Part;
import mis.domain.User;

public class AddUserAction extends BaseAction{
	private UserBean userBean;
	private List<UserBean> users;
	private List<Department> department;
	private List<Part> part;
	
	
	public UserBean getUserBean() {
		return userBean;
	}
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	public List<UserBean> getUsers() {
		return users;
	}
	public void setUsers(List<UserBean> users) {
		this.users = users;
	}
	public List<Department> getDepartment() {
		return department;
	}
	public void setDepartment(List<Department> department) {
		this.department = department;
	}
	public List<Part> getPart() {
		return part;
	}
	public void setPart(List<Part> part) {
		this.part = part;
	}
	public String execute() throws Exception {
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		
		
		
		User u = bgr.getUser(this.getUserBean().getUserAccount());
		if(u!=null){
			addActionMessage( "������û����ظ���");
			return INPUT;
		}else{	
			bgr.addUser(userBean);
			//��ȡ�û�Bean
			List<UserBean> userBean = bgr.getUsers();
			setUsers(userBean);
			//��ȡ�û�����
			Integer userCount = userBean.size();
			//��ȡ����
			setDepartment(bgr.getDepartment());
			//��ȡ��ɫ
			setPart(bgr.getPart());
		
			ctx.put("type", 2);
			ctx.put("userCount", userCount);
			return SUCCESS;
		}
	}
}
