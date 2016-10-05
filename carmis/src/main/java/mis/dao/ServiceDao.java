package mis.dao;



import mis.domain.Service;
import common.dao.BaseDao;

public interface ServiceDao extends BaseDao<Service> {
	
	public Service findByNumber(String serviceNumber);
	
	public Service findByName(String serviceName);
		
	public Service findById(Integer serviceId);
}
