package mis.bean;

public class DepartmentBean {
	//����ID
	private Integer departmentId;
	//����
	private String departmentName;
	//��ע
	private String departmentScript;
	//ӵ������
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
