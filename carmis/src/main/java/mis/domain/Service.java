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
@Table(name = "service")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Service  implements Serializable {
	private static final long serialVersionUID = 48L;
	// 消息类的标识属性
	//服务项目标识
	@Id@Column(name="service_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer serviceId;
	//服务项目编号
	@Column(name="service_number", nullable=false, length=50 , unique=true)
	private String serviceNumber;
	//服务项目名称
	@Column(name="service_name", nullable=false, length=50 )
	private String serviceName;
	//单位
	@Column(name="service_Unit", nullable=false, length=20)
	private String serviceUnit;
	//单价
	@Column(name="service_price", nullable=false )
	private Double servicePrice;
	
	public Service() {
		super();
	}
	public Service(Integer serviceId, String serviceNumber, String serviceName,
			String serviceUnit, Double servicePrice) {
		super();
		this.serviceId = serviceId;
		this.serviceNumber = serviceNumber;
		this.serviceName = serviceName;
		this.serviceUnit = serviceUnit;
		this.servicePrice = servicePrice;
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceUnit() {
		return serviceUnit;
	}
	public void setServiceUnit(String serviceUnit) {
		this.serviceUnit = serviceUnit;
	}
	public Double getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(Double servicePrice) {
		this.servicePrice = servicePrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((serviceName == null) ? 0 : serviceName.hashCode());
		result = prime * result
				+ ((serviceNumber == null) ? 0 : serviceNumber.hashCode());
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
		Service other = (Service) obj;
		if (serviceName == null) {
			if (other.serviceName != null)
				return false;
		} else if (!serviceName.equals(other.serviceName))
			return false;
		if (serviceNumber == null) {
			if (other.serviceNumber != null)
				return false;
		} else if (!serviceNumber.equals(other.serviceNumber))
			return false;
		return true;
	}
	
	
	
	
}
