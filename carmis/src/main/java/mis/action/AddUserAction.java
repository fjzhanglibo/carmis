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
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		
		
		
		User u = bgr.getUser(this.getUserBean().getUserAccount());
		if(u!=null){
			addActionMessage( "输入的用户名重复！");
			return INPUT;
		}else{	
			bgr.addUser(userBean);
			//获取用户Bean
			List<UserBean> userBean = bgr.getUsers();
			setUsers(userBean);
			//获取用户个数
			Integer userCount = userBean.size();
			//获取部门
			setDepartment(bgr.getDepartment());
			//获取角色
			setPart(bgr.getPart());
		
			ctx.put("type", 2);
			ctx.put("userCount", userCount);
			return SUCCESS;
		}
	}
}
