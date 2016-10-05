package mis.service.impl;

import mis.service.*;
import mis.bean.PartRightsBean;
import mis.dao.*;
import mis.domain.*;
import mis.exception.*;

import java.text.*;
import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



public class AdmManagerImpl implements AdmManager{
	
	private PartRightsBean partRightsBean;
	
	private RightsDao rightsDao;
	private PartDao partDao;
	private PartRightsDao partRightsDao;
	private DepartmentDao departmentDao;
	private UserDao userDao;
	
	
	
	public void setPartRightsBean(PartRightsBean partRightsBean) {
		this.partRightsBean = partRightsBean;
	}
	public void setRightsDao(RightsDao rightsDao) {
		this.rightsDao = rightsDao;
	}
	public void setPartDao(PartDao partDao) {
		this.partDao = partDao;
	}	
	public void setPartRightsDao(PartRightsDao partRightsDao) {
		this.partRightsDao = partRightsDao;
	}	
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
