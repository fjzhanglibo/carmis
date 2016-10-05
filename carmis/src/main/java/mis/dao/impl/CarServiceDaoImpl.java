package mis.dao.impl;

import java.util.List;

import common.dao.impl.BaseDaoHibernate4;
import mis.dao.CarServiceDao;
import mis.domain.Car;
import mis.domain.CarService;
import mis.domain.Rank;
import mis.domain.Service;

public class CarServiceDaoImpl extends BaseDaoHibernate4<CarService> implements CarServiceDao {
	
	public List<CarService> findByCar(Car car){
		return find("select p from CarService p where p.car=?0" , car);
	}
	
	public List<CarService> findByService(Service service){
		return find("select p from CarService p where p.service=?0" , service);
	}
	
	public List<CarService> findByRank(Rank rank){
		return find("select p from CarService p where p.rank=?0" , rank);
	}
	
	public CarService findById(Integer id){
		return super.get(CarService.class, id);
	}

}
