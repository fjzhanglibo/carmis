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
@Table(name = "carService")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class CarService implements Serializable {
	private static final long serialVersionUID = 48L;
	// 消息类的标识属性
	//ID
	@Id@Column(name="carService_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carServiceId;
	@ManyToOne(targetEntity=Car.class)
	@JoinColumn(name="car_id", nullable=false )
	private Car car;
	@ManyToOne(targetEntity=Service.class)
	@JoinColumn(name="service_id", nullable=false)
	private Service service;
	
	@ManyToOne(targetEntity=Rank.class)
	@JoinColumn(name="rank_id", nullable=false)
	private Rank rank;
	
	public CarService() {
		super();
	}	
	public CarService(Integer carServiceId, Car car, Service service, Rank rank) {
		super();
		this.carServiceId = carServiceId;
		this.car = car;
		this.service = service;
		this.rank = rank;
	}
	
	public Integer getCarServiceId() {
		return carServiceId;
	}
	public void setCarServiceId(Integer carServiceId) {
		this.carServiceId = carServiceId;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((car == null) ? 0 : car.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((service == null) ? 0 : service.hashCode());
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
		CarService other = (CarService) obj;
		if (car == null) {
			if (other.car != null)
				return false;
		} else if (!car.equals(other.car))
			return false;
		if (rank == null) {
			if (other.rank != null)
				return false;
		} else if (!rank.equals(other.rank))
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		return true;
	}
	
	
	
	
	
}
