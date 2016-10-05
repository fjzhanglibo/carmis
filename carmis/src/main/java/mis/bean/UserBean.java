package mis.bean;

public class UserBean {
	//id
	private Integer userId;
	// 用户账户名
	private String userAccount;
	//用户姓名
	private String userName;
	//用户密码
	private String userPassword;
	//用户登陆次数
	private Integer userEnterDegree;
	//用户所属部门
	private String userDepartment;
	//用户所属角色
	private String userPart;
	
	
	public UserBean() {
		
	}
	public UserBean(Integer userId, String userAccount, String userName,
			String userPassword, Integer userEnterDegree,
			String userDepartment, String userPart) {
		super();
		this.userId = userId;
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEnterDegree = userEnterDegree;
		this.userDepartment = userDepartment;
		this.userPart = userPart;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getUserEnterDegree() {
		return userEnterDegree;
	}
	public void setUserEnterDegree(Integer userEnterDegree) {
		this.userEnterDegree = userEnterDegree;
	}
	public String getUserDepartment() {
		return userDepartment;
	}
	public void setUserDepartment(String userDepartment) {
		this.userDepartment = userDepartment;
	}
	public String getUserPart() {
		return userPart;
	}
	public void setUserPart(String userPart) {
		this.userPart = userPart;
	}
	
	
	
	
	

}
