package mis.action.part;

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

public class PartsAction extends BaseAction {
	private List<PartBean> parts;
	
	public List<PartBean> getParts() {
		return parts;
	}
	public void setParts(List<PartBean> parts) {
		this.parts = parts;
	}



	public String execute() throws Exception{
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//��ȡ����
		List<PartBean> parts = bgr.getParts();
		this.setParts(parts);
		//��ȡ���Ÿ���
		Integer partCount = parts.size();
		
		ctx.put("partCount", partCount);
		ctx.put("type", 7);
		
		
		
		return SUCCESS;
	}

}
