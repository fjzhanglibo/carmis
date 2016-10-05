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

public class DepUsersAction extends BaseAction {
	private Map<String, List<UserBean>> map;
	
	public Map<String, List<UserBean>> getMap() {
		return map;
	}
	public void setMap(Map<String, List<UserBean>> map) {
		this.map = map;
	}

	public String execute() throws Exception{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		//获取部门
		List<Department> deps = bgr.getDepartment();		
		Iterator<Department> itd = deps.iterator();
		
		Map<String, List<UserBean>> m = new HashMap<String, List<UserBean>>();
		
		while(itd.hasNext()){
			
			List<UserBean> user = new ArrayList<UserBean>();
			String depName = new String();
			
			Department dep=new Department();
			dep = itd.next();			
			user = bgr.getUserBeansByDepartment(dep);
			
			depName = dep.getDepartmentName();
			
			m.put(depName, user);		
			this.setMap(m);
			ctx.put(depName, user.size());
			
		}
		
		ctx.put("type", 6);
		
		return SUCCESS;
	

	}

}
