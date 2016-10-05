package mis.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.UserBean;

public class DelUserAction extends BaseAction {
	private String userAccount;
	private List<UserBean> users;

	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}	
	public List<UserBean> getUsers() {
		return users;
	}
	public void setUsers(List<UserBean> users) {
		this.users = users;
	}
	
	public String execute() throws Exception {
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
				
				
		//����Ƿ����޸��Լ�
		if(ctx.getSession().get("account").equals(userAccount)){
			//��ȡ�û�Bean
			List<UserBean> userBean = bgr.getUsers();
			setUsers(userBean);
			//��ȡ�û�����
			Integer userCount = userBean.size();
			
			ctx.put("type", 1);
			ctx.put("userCount", userCount);
			return ERROR ;
		}
		else{
			bgr.delUser(getUserAccount());
			//��ȡ�û�Bean
			List<UserBean> userBean = bgr.getUsers();
			setUsers(userBean);
			//��ȡ�û�����
			Integer userCount = userBean.size();
			
			ctx.put("type", 2);
			ctx.put("userCount", userCount);
			return SUCCESS;
		}
			
	}
	

}
