package mis.dao;

import java.util.List;

import mis.domain.Car;
import mis.domain.CarService;
import mis.domain.Rank;
import mis.domain.Service;
import common.dao.BaseDao;

public interface CarServiceDao extends BaseDao<CarService> {
	public List<CarService> findByCar(Car car);
	
	public List<CarService> findByService(Service service);
	
	public List<CarService> findByRank(Rank rank);
	
	public CarService findById(Integer id);
}
