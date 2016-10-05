package mis.domain;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name = "part")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)

public class Part implements Serializable{
	
	private static final long serialVersionUID = 48L;
	// 消息类的标识属性
	//角色ID
	@Id@Column(name="part_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer partId;
	
	//角色名称
	@Column(name="part_name", nullable=false, length=50 , unique=true)
	private String partName;
	
	//角色备注
	@Column(name="part_script", nullable=true, length=50 )
	private String partScript;
	
	
	
	public Part() {
		
	}
	
	
	
	public Part(Integer partId, String partName, String partScript) {
		super();
		this.partId = partId;
		this.partName = partName;
		this.partScript = partScript;
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((partName == null) ? 0 : partName.hashCode());
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
		Part other = (Part) obj;
		if (partName == null) {
			if (other.partName != null)
				return false;
		} else if (!partName.equals(other.partName))
			return false;
		return true;
	}
	
	
}
