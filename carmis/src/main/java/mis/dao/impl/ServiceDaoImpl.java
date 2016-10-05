package mis.dao.impl;

import java.util.List;

import mis.dao.ServiceDao;
import mis.domain.Service;
import common.dao.impl.BaseDaoHibernate4;

public class ServiceDaoImpl extends BaseDaoHibernate4<Service> implements ServiceDao{
	public Service findByNumber(String serviceNumber){
		List<Service> l = find("select p from Service p where p.serviceNumber = ?0" , serviceNumber);
		if (l!= null && l.size() >= 1)
		{
			return l.get(0);
		}
		return null;
	}
	
	public Service findByName(String serviceName){
		List<Service> l = find("select p from Service p where p.serviceName = ?0" , serviceName);
		if (l!= null && l.size() >= 1)
		{
			return l.get(0);
		}
		return null;
	}
	
		
	public Service findById(Integer serviceId){
		return super.get(Service.class, serviceId);
	}

}
