package mis.bean;

public class DepartmentBean {
	//部门ID
	private Integer departmentId;
	//名称
	private String departmentName;
	//备注
	private String departmentScript;
	//拥有人数
	private Integer userNumber;
	
	
	
	public DepartmentBean() {
		
	}

	public DepartmentBean(Integer departmentId, String departmentName,
			String departmentScript, Integer userNumber) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentScript = departmentScript;
		this.userNumber = userNumber;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentScript() {
		return departmentScript;
	}

	public void setDepartmentScript(String departmentScript) {
		this.departmentScript = departmentScript;
	}

	public Integer getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}
	
}
