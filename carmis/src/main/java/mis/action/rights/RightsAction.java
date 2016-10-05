package mis.action.rights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.DepartmentBean;
import mis.bean.PartBean;
import mis.bean.UserBean;
import mis.domain.Department;
import mis.domain.Rights;

public class RightsAction extends BaseAction {
	private List<Rights> rights;
	
	public List<Rights> getRights() {
		return rights;
	}
	public void setRights(List<Rights> rights) {
		this.rights = rights;
	}




	public String execute() throws Exception{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		//获取部门
		List<Rights> rights = bgr.getRights();
		this.setRights(rights);
		//获取部门个数
		Integer rightsCount = rights.size();
		
		ctx.put("rightsCount", rightsCount);
		ctx.put("type", 9);
		
		
		
		return SUCCESS;
	}

}
