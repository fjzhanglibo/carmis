package mis.action;



import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.UserBean;

public class UsersAction extends BaseAction {
	private List<UserBean> users;
	
	public List<UserBean> getUsers() {
		return users;
	}
	public void setUsers(List<UserBean> users) {
		this.users = users;
	}

	
	public String execute() throws Exception {
			// ����ActionContextʵ��
			ActionContext ctx = ActionContext.getContext();
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
