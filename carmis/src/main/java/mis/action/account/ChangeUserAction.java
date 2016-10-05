package mis.action.account;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.UserBean;
import mis.domain.User;

public class ChangeUserAction extends BaseAction {
	
	private UserBean userBean;
	private List<UserBean> users;
	
	
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
	
	public String execute() throws Exception {
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		
		bgr.changeUser(getUserBean());
		
		//����Ƿ����޸��Լ�
		if(ctx.getSession().get("account") != null)
			if(ctx.getSession().get("account").equals(userBean.getUserAccount())){
				ctx.getSession().put("name",userBean.getUserName());
			}
		
		//��ȡ�û�Bean
		List<UserBean> userBean = bgr.getUsers();
		setUsers(userBean);
		//��ȡ�û�����
		Integer userCount = userBean.size();
		
		ctx.put("type", 1);
		ctx.put("userCount", userCount);
		return SUCCESS;
	}

}
