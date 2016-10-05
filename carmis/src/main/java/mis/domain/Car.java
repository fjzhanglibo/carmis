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
@Table(name = "car")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Car implements Serializable {
	private static final long serialVersionUID = 48L;
	// 消息类的标识属性
	//ID
	@Id@Column(name="car_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carId;
	//车牌号
	@Column(name="car_number", nullable=false, length=50 , unique=true)
	private String carNumber;
	//品牌
	@Column(name="car_barnd", length=50 )
	private String carBrand;
	//颜色
	@Column(name="car_color", length=50 )
	private String carColor;
	//里程
	@Column(name="car_mileage" )
	private Integer carMileage;
	public Car() {
		super();
	}
	public Car(Integer carId, String carNumber, String carBrand,
			String carColor, Integer carMileage) {
		super();
		this.carId = carId;
		this.carNumber = carNumber;
		this.carBrand = carBrand;
		this.carColor = carColor;
		this.carMileage = carMileage;
	}
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public Integer getCarMileage() {
		return carMileage;
	}
	public void setCarMileage(Integer carMileage) {
		this.carMileage = carMileage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((carNumber == null) ? 0 : carNumber.hashCode());
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
		Car other = (Car) obj;
		if (carNumber == null) {
			if (other.carNumber != null)
				return false;
		} else if (!carNumber.equals(other.carNumber))
			return false;
		return true;
	}
		
	
	

}
