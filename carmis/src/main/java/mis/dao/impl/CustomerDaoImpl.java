package mis.dao.impl;

import java.util.List;

import mis.dao.CustomerDao;
import mis.domain.Customer;
import common.dao.impl.BaseDaoHibernate4;

public class CustomerDaoImpl extends BaseDaoHibernate4<Customer> implements CustomerDao {
	
	public Customer findByIdCard(String customerIdCard){
		List<Customer> l = find("select p from Customer p where p.customerIdCard = ?0" , customerIdCard);
		if (l!= null && l.size() >= 1)
		{
			return l.get(0);
		}
		return null;
	}
	
	public Customer findByTel(String customerTel){
		List<Customer> l = find("select p from Customer p where p.customerTel = ?0" , customerTel);
		if (l!= null && l.size() >= 1)
		{
			return l.get(0);
		}
		return null;
	}
	
	public List<Customer> findBySex(String customerSex){
		List<Customer> l = find("select p from Customer p where p.customerSex = ?0" , customerSex);
		return l;
	}
	
	public List<Customer> findByName(String customerName){
		List<Customer> l = find("select p from Customer p where p.customerName = ?0" , customerName);
		return l;
	}
	
	public Customer findById(Integer customerId){
		return super.get(Customer.class, customerId);
	}
}
