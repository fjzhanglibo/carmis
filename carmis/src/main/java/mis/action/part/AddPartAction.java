package mis.action.part;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.DepartmentBean;
import mis.bean.PartBean;
import mis.domain.Department;
import mis.domain.Part;

public class AddPartAction extends BaseAction {
	private Part part;
	private List<PartBean> parts;
	
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	public List<PartBean> getParts() {
		return parts;
	}
	public void setParts(List<PartBean> parts) {
		this.parts = parts;
	}



	public String execute() throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		//添加部门
		if(part.getPartName()!=null){
			bgr.addPart(part);
		}
		//获取角色
				List<PartBean> parts = bgr.getParts();
				this.setParts(parts);
				//获取部门个数
				Integer partCount = parts.size();
				
				ctx.put("partCount", partCount);
				ctx.put("type", 7);
				
				
				
				return SUCCESS;
	}
	
}
