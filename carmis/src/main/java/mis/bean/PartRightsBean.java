package mis.bean;

public class PartRightsBean {
	private Integer id;
	private String part;
	private String rights;
	public PartRightsBean() {
		
	}
	public PartRightsBean(Integer id, String part, String rights) {
		super();
		this.id = id;
		this.part = part;
		this.rights = rights;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getRights() {
		return rights;
	}
	public void setRights(String rights) {
		this.rights = rights;
	}
	
	
	
}
