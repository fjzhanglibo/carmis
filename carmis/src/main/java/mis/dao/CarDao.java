package mis.dao;



import java.util.List;

import mis.domain.Car;

import common.dao.BaseDao;

public interface CarDao extends BaseDao<Car> {
	public Car findByNumber(Car car);

	
	public Car findByNumber(String carNumber);
	
	public List<Car> findByBarnd(String carBarnd);
	
	public Car findById(Integer carId);
}
