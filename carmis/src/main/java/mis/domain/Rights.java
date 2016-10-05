package mis.domain;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name = "rights")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Rights implements Serializable {
	private static final long serialVersionUID = 48L;
	// 消息类的标识属性
	@Id@Column(name="rights_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//权限ID
	private Integer rightsId;
	
	//权限名称
	@Column(name="rights_name", nullable=false, length=50 , unique=true)
	private String rightsName;
	
	//权限备注
	@Column(name="rights_script", nullable=true, length=100 )
	private String rightsScript;
	
	//无参构造函数
	public Rights() {
		
	}
	
	//构造函数
	public Rights(Integer rightsId, String rightsName, String rightsScript) {
		this.rightsId = rightsId;
		this.rightsName = rightsName;
		this.rightsScript = rightsScript;
	}
	
	//getter和setter
	public Integer getRightsId() {
		return rightsId;
	}

	public void setRightsId(Integer rightsId) {
		this.rightsId = rightsId;
	}

	public String getRightsName() {
		return rightsName;
	}

	public void setRightsName(String rightsName) {
		this.rightsName = rightsName;
	}

	public String getRightsScript() {
		return rightsScript;
	}

	public void setRightsScript(String rightsScript) {
		this.rightsScript = rightsScript;
	}

	
	//根据rightsName来重写hashCode()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rightsName == null) ? 0 : rightsName.hashCode());
		return result;
	}
	
	//根据rightsName来重写equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rights other = (Rights) obj;
		if (rightsName == null) {
			if (other.rightsName != null)
				return false;
		} else if (!rightsName.equals(other.rightsName))
			return false;
		return true;
	}

		
}
