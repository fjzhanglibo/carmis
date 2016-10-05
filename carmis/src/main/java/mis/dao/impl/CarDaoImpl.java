package mis.dao.impl;

import java.util.List;

import mis.dao.CarDao;
import mis.domain.Car;
import common.dao.impl.BaseDaoHibernate4;

public class CarDaoImpl extends BaseDaoHibernate4<Car> implements CarDao{
	public Car findByNumber(Car car){
		List<Car> cars = find("select p from Car p where p.carNumber = ?0"
				, car.getCarNumber() );
		if (cars!= null && cars.size() >= 1)
		{
			return cars.get(0);
		}
		return null;
	}

	
	public Car findByNumber(String carNumber){
		List<Car> cars = find("select p from Car p where p.carNumber = ?0"
				, carNumber );
		if (cars!= null && cars.size() >= 1)
		{
			return cars.get(0);
		}
		return null;
	}
	
	public List<Car> findByBarnd(String carBarnd){
		return find("select p from Car p where p.carBarnd = 0" , carBarnd);
	}
	
	public Car findById(Integer carId){
		return super.get(Car.class, carId);
	}
}
