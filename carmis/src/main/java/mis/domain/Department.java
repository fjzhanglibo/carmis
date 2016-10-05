package mis.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "department")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Department implements Serializable {
	private static final long serialVersionUID = 48L;
	
	// 消息类的标识属性
	//部门ID
	@Id@Column(name="department_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer departmentId;
	//名称
	@Column(name="department_name", nullable=false, length=50 , unique=true)
	private String departmentName;
	//备注
	@Column(name="department_script", nullable=true, length=50 )
	private String departmentScript;
	
	//构造函数
	public Department() {
		super();
	}

	public Department(Integer departmentId, String departmentName,
			String departmentScript) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentScript = departmentScript;
	}
	
	//setter&getter
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

	//hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((departmentName == null) ? 0 : departmentName.hashCode());
		return result;
	}
	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		return true;
	}
	
	
	
	
}
