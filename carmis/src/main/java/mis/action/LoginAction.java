package mis.action;


import java.util.Arrays;
import java.util.Iterator;
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
import mis.domain.PartRights;
import mis.domain.Rights;
import mis.domain.User;
import mis.service.BaseManager;
import mis.service.impl.BaseManagerImpl;
import mis.action.base.BaseAction;
import mis.bean.UserBean;

public class LoginAction extends BaseAction {
	
	// 封装请求参数
	private User user;
	
	private List<UserBean> users;
	private List<Part> partList;
	private List<Department> departmentList;
	private List<Rights> rightsList;


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
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

		// 调用业务逻辑方法来处理登录请求
		Part part = bgr.validLogin(user);
		
		

		
		
		if (part==null) {
			addActionMessage("用户名/密码不匹配");
			return ERROR;
		}else{
		List<PartRights> prs = bgr.getPartRights(part);
		Iterator<PartRights> it = prs.iterator();
		int[] p = new int[prs.size()+1];
		p[prs.size()] = 9;
		int i = 0;
		while(it.hasNext()){
			PartRights pr = it.next();
			p[i] = pr.getRights().getRightsId();
			i=i+1;
		}
		Arrays.sort(p);

		int k=0;
		if(p[k]==1){
			ctx.getSession().put("system", 1);
			k=k+1;
		}
		if(p[k]==2){
			ctx.getSession().put("count", 1);
			k=k+1;
		}
		if(p[k]==3){
			ctx.getSession().put("car", 1);
			k=k+1;
		}
		if(p[k]==4){
			ctx.getSession().put("customer", 1);
			k=k+1;
		}
		if(p[k]==5){
			ctx.getSession().put("checkout", 1);
			k=k+1;
		}
		if(p[k]==6){
			ctx.getSession().put("rank", 1);
			k=k+1;
		}
		if(p[k]==7){
			ctx.getSession().put("service", 1);
			k=k+1;
		}
		if(p[k]==8){
			ctx.getSession().put("search", 1);
			k=k+1;
		}
		
		if(p[0]==1){
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
			
			ctx.getSession().put("user", getUser());
			ctx.getSession().put("account", user.getUserAccount());
			ctx.getSession().put("name",bgr.getUser(user).getUserName());
			ctx.getSession().put(WebConstant.LEVEL, part.getPartName());
			ctx.put("rightsCount", rightsCount);
			ctx.put("partCount", partCount);
			ctx.put("departmentCount", departmentCount);
			ctx.put("userCount", userCount);
			
			
			addActionMessage("您已经成功登录系统");
			return SUCCESS;
		}
						
		// 用户名和密码不匹配
		else {
			ctx.getSession().put("account", user.getUserAccount());
			ctx.getSession().put("name", bgr.getUser(user).getUserName());
			ctx.getSession().put(WebConstant.LEVEL, part.getPartName());
			addActionMessage("您已经成功登录系统");
			return SUCCESS;
		}
	}
	}

}
