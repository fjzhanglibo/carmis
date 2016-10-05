package mis.domain;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



@Entity
@Table(name = "user")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class User implements Serializable {
	private static final long serialVersionUID = 48L;
	
	// 消息类的标识属性
	// 用户ID
	@Id@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	// 用户账户名
	@Column(name="user_account", nullable=false, length=20 , unique=true)
	private String userAccount;
	
	//用户姓名
	@Column(name="user_name", nullable=false, length=50 )
	private String userName;
	
	//用户密码
	@Column(name="user_password", nullable=false, length=20 )
	private String userPassword;
	
	//用户登陆次数
	@Column(name="user_enterDegree", nullable=false )
	private Integer userEnterDegree;
	
	//用户所属部门
	@ManyToOne(targetEntity=Department.class)
	@JoinColumn(name="department_id")
	private Department department;
	
	//用户所属角色
	@ManyToOne(targetEntity=Part.class)
	@JoinColumn(name="part_id")
	private Part part;

	//构造函数
	public User() {
		
	}
	public User(Integer userId, String userAccount, String userName,
			String userPassword, Integer userEnterDegree,
			Department department, Part part) {
		super();
		this.userId = userId;
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEnterDegree = userEnterDegree;
		this.department = department;
		this.part = part;
	}
	
	//getter&setter
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	
	//根据userAccount和userPassword来重写hashCode()和equals()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userAccount == null) ? 0 : userAccount.hashCode());
		result = prime * result
				+ ((userPassword == null) ? 0 : userPassword.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userAccount == null) {
			if (other.userAccount != null)
				return false;
		} else if (!userAccount.equals(other.userAccount))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
