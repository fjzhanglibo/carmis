package mis.dao.impl;

import java.util.List;

import common.dao.impl.BaseDaoHibernate4;
import mis.dao.CustomerRankDao;
import mis.domain.Customer;
import mis.domain.CustomerRank;
import mis.domain.Rank;

public class CustomerRankDaoImpl extends BaseDaoHibernate4<CustomerRank> implements CustomerRankDao {
	public List<CustomerRank> findByRank(Rank rank){
		return find("select p from CustomerRank p where p.rank = ?0" , rank);
	}
	
	public CustomerRank findByCustomer(Customer customer){
		List<CustomerRank> l = super.find("select p from CustomerRank p where p.customer = ?0" , customer);
		if (l!= null && l.size() >= 1)
		{
			return l.get(0);
		}
		return null;
	}
	
	public CustomerRank findById(Integer id){
		return super.get(CustomerRank.class, id);
	}

}
