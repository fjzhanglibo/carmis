package mis.dao;

import java.util.List;

import mis.domain.Customer;
import common.dao.BaseDao;

public interface CustomerDao extends BaseDao<Customer> {
	public Customer findByIdCard(String customerIdCard);
	
	public Customer findByTel(String customerTel);
	
	public List<Customer> findBySex(String customerSex);
	
	public List<Customer> findByName(String customerName);
	
	public Customer findById(Integer customerId);
}
