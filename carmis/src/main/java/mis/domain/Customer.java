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
@Table(name = "customer")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Customer  implements Serializable {
	private static final long serialVersionUID = 48L;
	// 消息类的标识属性
	//ID
	@Id@Column(name="customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	//身份证号码
	@Column(name="customer_idCard", nullable=false, length=50 , unique=true)
	private String customerIdCard;
	//姓名
	@Column(name="customer_name", nullable=false, length=50)
	private String customerName;
	//性别
	@Column(name="customer_sex", nullable=false, length=10 )
	private String customerSex;
	//电话
	@Column(name="customer_tel",  nullable=false,length=20 , unique=true)
	private String customerTel;
	//地址
	@Column(name="customer_address", length=50 )
	private String customerAddress;
	//备注
	@Column(name="customer_script", length=50 )
	private String customerScript;
	public Customer() {
		super();
	}
	public Customer(Integer customerId, String customerIdCard,
			String customerName, String customerSex, String customerTel,
			String customerAddress, String customerScript) {
		super();
		this.customerId = customerId;
		this.customerIdCard = customerIdCard;
		this.customerName = customerName;
		this.customerSex = customerSex;
		this.customerTel = customerTel;
		this.customerAddress = customerAddress;
		this.customerScript = customerScript;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerIdCard() {
		return customerIdCard;
	}
	public void setCustomerIdCard(String customerIdCard) {
		this.customerIdCard = customerIdCard;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerSex() {
		return customerSex;
	}
	public void setCustomerSex(String customerSex) {
		this.customerSex = customerSex;
	}
	public String getCustomerTel() {
		return customerTel;
	}
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerScript() {
		return customerScript;
	}
	public void setCustomerScript(String customerScript) {
		this.customerScript = customerScript;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customerIdCard == null) ? 0 : customerIdCard.hashCode());
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
		Customer other = (Customer) obj;
		if (customerIdCard == null) {
			if (other.customerIdCard != null)
				return false;
		} else if (!customerIdCard.equals(other.customerIdCard))
			return false;
		return true;
	}
	
	
	
	

}
