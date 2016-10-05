package mis.dao;



import mis.domain.Car;
import mis.domain.Customer;
import mis.domain.CustomerCar;

import common.dao.BaseDao;

public interface CustomerCarDao extends BaseDao<CustomerCar> {
	public CustomerCar findByCar(Car car);
	
	public CustomerCar findByCustomer(Customer customer);
	
	public CustomerCar findById(Integer id);

}
