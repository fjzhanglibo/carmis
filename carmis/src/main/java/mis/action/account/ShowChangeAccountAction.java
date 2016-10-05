package mis.action.account;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.UserBean;
import mis.domain.Department;
import mis.domain.Part;
import mis.domain.Rights;
import mis.domain.User;

public class ShowChangeAccountAction extends BaseAction {
	// 封装请求参数
	private User user;
	
	private UserBean userBean;
	private List<Department> department;
	private List<Part> part;


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
	public UserBean getUserBean() {
		return userBean;
	}
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
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
		if(user != null){
		//获取用户Bean
		UserBean userBean = bgr.getUserBean(user);
		setUserBean(userBean);
		}
		//获取部门
		setDepartment(bgr.getDepartment());
		//获取角色
		setPart(bgr.getPart());
		
		ctx.put("type", 10);
		return SUCCESS;
		
	}
		
}
