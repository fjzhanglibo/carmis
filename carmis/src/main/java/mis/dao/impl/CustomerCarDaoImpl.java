package mis.dao.impl;

import java.util.List;

import mis.dao.CustomerCarDao;
import mis.domain.Car;
import mis.domain.Customer;
import mis.domain.CustomerCar;
import common.dao.impl.BaseDaoHibernate4;

public class CustomerCarDaoImpl extends BaseDaoHibernate4<CustomerCar> implements CustomerCarDao {
	public CustomerCar findByCar(Car car){
		List<CustomerCar> l = super.find("select p from CustomerCar p where p.car = ?0" , car);
		if (l!= null && l.size() >= 1)
		{
			return l.get(0);
		}
		return null;
	}
	
	public CustomerCar findByCustomer(Customer customer){
		List<CustomerCar> l = super.find("select p from CustomerCar p where p.customer = ?0" , customer);
		if (l!= null && l.size() >= 1)
		{
			return l.get(0);
		}
		return null;
	}
	
	public CustomerCar findById(Integer id){
		return super.get(CustomerCar.class, id);
	}
	

}
