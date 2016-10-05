package mis.bean;

public class PartBean {
	private Integer partId;
	private String partName;
	private String partScript;
	private Integer userNumber;
	private Integer rightsNumber;
	public PartBean() {
		
	}
	public PartBean(Integer partId, String partName, String partScript,
			Integer userNumber, Integer rightsNumber) {
		super();
		this.partId = partId;
		this.partName = partName;
		this.partScript = partScript;
		this.userNumber = userNumber;
		this.rightsNumber = rightsNumber;
	}
	public Integer getPartId() {
		return partId;
	}
	public void setPartId(Integer partId) {
		this.partId = partId;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartScript() {
		return partScript;
	}
	public void setPartScript(String partScript) {
		this.partScript = partScript;
	}
	public Integer getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}
	public Integer getRightsNumber() {
		return rightsNumber;
	}
	public void setRightsNumber(Integer rightsNumber) {
		this.rightsNumber = rightsNumber;
	}
	
	
	
	
}
