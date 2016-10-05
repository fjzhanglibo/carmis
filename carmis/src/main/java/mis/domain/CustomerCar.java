package mis.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "customerCar")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class CustomerCar implements Serializable {
	private static final long serialVersionUID = 48L;
	// 消息类的标识属性
	//ID
	@Id@Column(name="customerCar_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerCarId;
	//customer
	@OneToOne(targetEntity=Customer.class)
	@JoinColumn(name="customer_id", nullable=false )
	private Customer customer;
	//car
	@OneToOne(targetEntity=Car.class)
	@JoinColumn(name="car_id", nullable=false )
	private Car car;
	public CustomerCar() {
		super();
	}
	public CustomerCar(Integer customerCarId, Customer customer, Car car) {
		super();
		this.customerCarId = customerCarId;
		this.customer = customer;
		this.car = car;
	}
	public Integer getCustomerCarId() {
		return customerCarId;
	}
	public void setCustomerCarId(Integer customerCarId) {
		this.customerCarId = customerCarId;
	}
	public Customer getCustomer() {

		return customer;

	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((car == null) ? 0 : car.hashCode());
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
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
		CustomerCar other = (CustomerCar) obj;
		if (car == null) {
			if (other.car != null)
				return false;
		} else if (!car.equals(other.car))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		return true;
	}
	
	
}
