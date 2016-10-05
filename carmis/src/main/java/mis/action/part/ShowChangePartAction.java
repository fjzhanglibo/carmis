package mis.action.part;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.UserBean;
import mis.dao.PartRightsDao;
import mis.domain.Department;
import mis.domain.Part;
import mis.domain.PartRights;
import mis.domain.Rights;

class ABean extends Rights{
	private boolean b;
	
	public ABean() {
		super();
	}
	public ABean(boolean b) {
		super();
		this.b = b;
	}
	public boolean getB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	
	
}

public class ShowChangePartAction extends BaseAction {
	private Part part;
	private List<Rights> listRights;
	private List<UserBean> users;
	private List<ABean> lists;
	
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	public List<Rights> getListRights() {
		return listRights;
	}
	public void setListRights(List<Rights> listRights) {
		this.listRights = listRights;
	}
	public List<UserBean> getUsers() {
		return users;
	}
	public void setUsers(List<UserBean> users) {
		this.users = users;
	}		
	public List<ABean> getLists() {
		return lists;
	}
	public void setLists(List<ABean> lists) {
		this.lists = lists;
	}
	
	static boolean haveId(Integer[] id, Integer i){
		boolean b = false;
		for(int l=0; l<id.length ; l++){
			if(id[l]==i){
				b = true;
				break;
			}
			else b = false;
		}
		return b;
	}
	
	public String execute() throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		//获取角色权限
		
		
		List<PartRights> prs = bgr.getPartRights(bgr.getPart(getPart()));
		Iterator<PartRights> its = prs.iterator();
		Integer[] id =new Integer[prs.size()];
		for(int i=0;its.hasNext();i++){
			PartRights pr = new PartRights();
			pr = its.next();
			id[i] = pr.getRights().getRightsId();	

		}
		
		listRights = bgr.getRights();
		Iterator<Rights> it = listRights.iterator();
		List<ABean> ab = new ArrayList<ABean>();
		while(it.hasNext()){
			ABean a = new ABean();
			Rights r = new Rights();
			r = it.next();
			Integer ri = r.getRightsId();
			a.setRightsId(r.getRightsId());
			a.setRightsName(r.getRightsName());
			a.setRightsScript(r.getRightsScript());
			if(haveId(id , ri)){
				a.setB(true);
			}else a.setB(false);
			ab.add(a);
		}
		this.setLists(ab);
		
		
		//获取用户Bean
		List<UserBean> userBean = bgr.getUserBeansByPart(bgr.getPart(getPart()));
		setUsers(userBean);	
		//获取用户个数
		Integer userCount = userBean.size();
		
		
		ctx.put("userCount", userCount);
		
		ctx.put("rightsCount", listRights.size());
		ctx.put("type", 8);
		return SUCCESS;
	}
}
