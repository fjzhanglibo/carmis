package mis.action.part;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.PartBean;
import mis.domain.Part;
import mis.domain.PartRights;

public class ChangePartRightsAction extends BaseAction {
	private String partName;
	private String[] rightsName;
	private List<PartBean> parts;
	
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String[] getRightsName() {
		return rightsName;
	}
	public void setRightsName(String[] rightsName) {
		this.rightsName = rightsName;
	}
	public List<PartBean> getParts() {
		return parts;
	}
	public void setParts(List<PartBean> parts) {
		this.parts = parts;
	}
	public String execute() throws Exception {
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		bgr.changePartRights(getPartName(), getRightsName());
		
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
