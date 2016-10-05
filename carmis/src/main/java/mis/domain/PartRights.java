package mis.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



@Entity
@Table(name = "partRights")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class PartRights implements Serializable {
	private static final long serialVersionUID = 48L;
// 消息类的标识属性
	@Id@Column(name="partRights_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer partRightsId;
	
	//Part
	@ManyToOne(targetEntity=Part.class)
	@JoinColumn(name="part_id", nullable=false)
	private Part part;

	//Rights
	@ManyToOne(targetEntity=Rights.class)
	@JoinColumn(name="rights_id", nullable=false)
	private Rights rights;
	
	//构造函数
	public PartRights() {
	
	}

	public PartRights(Integer partRightsId, Part part, Rights rights) {
		super();
		this.partRightsId = partRightsId;
		this.part = part;
		this.rights = rights;
	}

	//getter和setter
	public Integer getPartRightsId() {
		return partRightsId;
	}

	public void setPartRightsId(Integer partRightsId) {
		this.partRightsId = partRightsId;
	}

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	public Rights getRights() {
		return rights;
	}

	public void setRights(Rights rights) {
		this.rights = rights;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((partRightsId == null) ? 0 : partRightsId.hashCode());
		result = prime * result + ((rights == null) ? 0 : rights.hashCode());
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
		PartRights other = (PartRights) obj;
		if (partRightsId == null) {
			if (other.partRightsId != null)
				return false;
		} else if (!partRightsId.equals(other.partRightsId))
			return false;
		if (rights == null) {
			if (other.rights != null)
				return false;
		} else if (!rights.equals(other.rights))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
