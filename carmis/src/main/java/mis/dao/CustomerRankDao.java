package mis.dao;

import java.util.List;


import mis.domain.Customer;
import mis.domain.CustomerRank;
import mis.domain.Rank;
import common.dao.BaseDao;

public interface CustomerRankDao extends BaseDao<CustomerRank> {
	
	public List<CustomerRank> findByRank(Rank rank);
	
	public CustomerRank findByCustomer(Customer customer);
	
	public CustomerRank findById(Integer id);
}
