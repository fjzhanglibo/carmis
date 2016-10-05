package mis.service.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mis.bean.CarBean;
import mis.bean.CarServiceBean;
import mis.bean.CustomerBean;
import mis.bean.DepartmentBean;
import mis.bean.ExpenseBean;
import mis.bean.PartBean;
import mis.bean.PartRightsBean;
import mis.bean.RankBean;
import mis.bean.ServiceBean;
import mis.bean.UserBean;
import mis.dao.CarDao;
import mis.dao.CarServiceDao;
import mis.dao.CustomerCarDao;
import mis.dao.CustomerDao;
import mis.dao.CustomerRankDao;
import mis.dao.DepartmentDao;
import mis.dao.PartDao;
import mis.dao.PartRightsDao;
import mis.dao.RankDao;
import mis.dao.RightsDao;
import mis.dao.ServiceDao;
import mis.dao.UserDao;
import mis.domain.Car;
import mis.domain.CarService;
import mis.domain.Customer;
import mis.domain.CustomerCar;
import mis.domain.CustomerRank;
import mis.domain.Department;
import mis.domain.Part;
import mis.domain.PartRights;
import mis.domain.Rank;
import mis.domain.Rights;
import mis.domain.Service;
import mis.domain.User;
import mis.service.BaseManager;

public class BaseManagerImpl implements BaseManager{

	private PartRightsBean partRightsBean;
	private UserBean userBean;
	
	private RightsDao rightsDao;
	private PartDao partDao;
	private PartRightsDao partRightsDao;
	private DepartmentDao departmentDao;
	private UserDao userDao;
	
	private CarDao  carDao;
	private CustomerDao  customerDao;
	private RankDao  rankDao;
	private ServiceDao  serviceDao;
	private CarServiceDao  carServiceDao;
	private CustomerRankDao  customerRankDao;
	private CustomerCarDao  customerCarDao;
	

	
	
	
	public void setPartRightsBean(PartRightsBean partRightsBean) {
		this.partRightsBean = partRightsBean;
	}	
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
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
	
	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	public void setRankDao(RankDao rankDao) {
		this.rankDao = rankDao;
	}
	public void setServiceDao(ServiceDao serviceDao) {
		this.serviceDao = serviceDao;
	}
	public void setCarServiceDao(CarServiceDao carServiceDao) {
		this.carServiceDao = carServiceDao;
	}
	public void setCustomerRankDao(CustomerRankDao customerRankDao) {
		this.customerRankDao = customerRankDao;
	}
	public void setCustomerCarDao(CustomerCarDao customerCarDao) {
		this.customerCarDao = customerCarDao;
	}
	/**
	 * 验证登陆身份
	 * @param user 登陆人员
	 * @return 登录后的身份确认:error登录失败，fir为前台，mgr为经理，amd为管理员，emp为普通员工
	 */
	public Part validLogin(User user){
		
		User u = userDao.findByAccountAndPass(user) ;
		
			if (u != null){
				u.setUserEnterDegree(u.getUserEnterDegree()+1);
				return u.getPart();			
			}
			else{
				return null;
			}
				
	}
/*================================User==================================*/	
	/**
	 * 新增用户
	 * @param account 账户名
	 * @param name 用户姓名
	 * @param password 密码
	 * @param departmentId 部门id
	 * @param partId 角色id
	 */
	public void addUser(String account , String name , String password , Integer departmentId , Integer partId){
		User user = new User();
		Department dep = departmentDao.get(Department.class, departmentId);
		Part part = partDao.get(Part.class, partId);
		
		user.setUserAccount(account);
		user.setUserName(name);
		user.setUserPassword(password);
		user.setDepartment(dep);
		user.setPart(part);		
		user.setUserEnterDegree(0);
		if(user.getUserAccount()!=null && user.getUserName() !=null && user.getUserPassword() !=null && user.getUserEnterDegree() !=null ){
		 userDao.save(user);
		}
		
	}
	/**
	 * 新增用户
	 * @param account 账户名
	 * @param name 用户姓名
	 * @param password 密码
	 * @param departmentId 部门id
	 */
	public void addUser(String account , String name , String password , Integer departmentId){
		User user = new User();
		Department dep = departmentDao.get(Department.class, departmentId);
		
		user.setUserAccount(account);
		user.setUserName(name);
		user.setUserPassword(password);
		user.setDepartment(dep);
		
		user.setUserEnterDegree(0);
		
		userDao.save(user);
	}
	/**
	 * 获取用户
	 * @return 用户集合
	 */
	public List<UserBean> getUsers(){
		List<User> users = userDao.findAll(User.class);
		Iterator<User> it = users.iterator();
		List<UserBean> beans = new ArrayList<UserBean>();
		
		for(int i = 0 ; it.hasNext() ; i++){
			
			UserBean userBean = new UserBean();
			
			User user = it.next();
			userBean.setUserId(user.getUserId());
			userBean.setUserName(user.getUserName());
			userBean.setUserAccount(user.getUserAccount());
			userBean.setUserPassword(user.getUserPassword());
			if(user.getDepartment() != null)
				userBean.setUserDepartment(user.getDepartment().getDepartmentName());
			if(user.getPart() != null)
				userBean.setUserPart(user.getPart().getPartName());
			userBean.setUserEnterDegree(user.getUserEnterDegree());
			beans.add(userBean);
			
		}
		return beans;
	}
	/**
	 * 获取用户对象
	 * @param user 登陆人员
	 * @return 用户对象
	 */
	public User getUser(User user){
		User u = userDao.findByAccountAndPass(user);
		return u;
	}
	public User getUser(String userAccount){
		User u = userDao.findByAccount(userAccount);
		return u;
	}
	/**
	 * 获取用户对象
	 * @param user 包含用户账户的用户对象
	 * @return 用户对象
	 */
	public UserBean getUserBean(User user){

		UserBean userBean = new UserBean();
		if(user.getUserAccount() != null){
		User u = userDao.findByAccount(user.getUserAccount());

		userBean.setUserAccount(u.getUserAccount());

		userBean.setUserId(u.getUserId());
		userBean.setUserName(u.getUserName());
		userBean.setUserPassword(u.getUserPassword());
		userBean.setUserEnterDegree(u.getUserEnterDegree());
		if(u.getDepartment() != null)
			userBean.setUserDepartment(u.getDepartment().getDepartmentName());
		if(u.getPart() != null)
			userBean.setUserPart(u.getPart().getPartName());
		}
		else if(user.getDepartment() != null){
			userBean.setUserDepartment(user.getDepartment().getDepartmentName());
		}
		return userBean;
	}
	/**
	 * 获取用户对象
	 * @param dep 部门
	 * @return 用户对象集合
	 */
	public List<UserBean> getUserBeansByDepartment(Department dep){
		List<UserBean> ubs = new ArrayList<UserBean>();
		List<User> users = userDao.findByDepartment(dep);
		Iterator<User> it = users.iterator();
		while(it.hasNext()){
			UserBean ub = new UserBean();
			ub = this.getUserBean(it.next());
			ubs.add(ub);
		}
		return ubs;
	}
	
	public List<UserBean> getUserBeansByPart(Part dep){
		List<UserBean> ubs = new ArrayList<UserBean>();
		List<User> users = userDao.findByPart(dep);
		Iterator<User> it = users.iterator();
		while(it.hasNext()){
			UserBean ub = new UserBean();
			ub = this.getUserBean(it.next());
			ubs.add(ub);
		}
		return ubs;
	}
	
	/**
	 * 更改用户对象
	 * @param userBean 包含用户对象
	 */
	public void changeUser(UserBean userBean){
		User u = userDao.findByAccount(userBean.getUserAccount());
		if(userBean.getUserName()!=null)
			u.setUserName(userBean.getUserName());
		if(userBean.getUserPassword()!=null)
			u.setUserPassword(userBean.getUserPassword());
		if(userBean.getUserDepartment()!=null)
			u.setDepartment(departmentDao.findByName(userBean.getUserDepartment()));
		if(userBean.getUserPart()!=null)
			u.setPart(partDao.findByName(userBean.getUserPart()));
		
		userDao.update(u);
	}
	/**
	 * 删除对象
	 * @param userId 包含用户对象
	 */
	public void delUser(String userAccount){
		User u = userDao.findByAccount(userAccount);
		if(u != null){
			userDao.delete(u);
		}
	}
	/**
	 * 添加用户对象
	 * @param userBean 包含用户对象
	 */
	public void addUser(UserBean u){
		
		String account = u.getUserAccount();
		String name = u.getUserName();
		String password = u.getUserPassword();
		Integer departmentId = departmentDao.findByName(u.getUserDepartment()).getDepartmentId();
		if(account!=null && name!=null && password!=null && departmentId!=null ){
		if(u.getUserPart()!=null){
			Integer partId = partDao.findByName(u.getUserPart()).getPartId();
			this.addUser(account, name, password, departmentId, partId);
		}
		else{
			this.addUser(account, name, password, departmentId);
		}
		}
		
	}
	
/*================================Rights==================================*/	
	
	/**
	 * 新增权限
	 * @param name 权限名
	 */
	public void addRights(String name )
	{
		Rights rights=new Rights();
		rights.setRightsName(name);
		rightsDao.save(rights);
		
	}
	/**
	 * 新增权限
	 * @param name 权限名
	 * @param script 备注
	 */

	public void addRights(String name , String script)
	{
		Rights rights=new Rights();
		rights.setRightsName(name);
		rights.setRightsScript(script);
		rightsDao.save(rights);
		
	}
	/**
	 * 获取权限
	 * @return 权限
	 */
	public List<Rights> getRights(){
		return rightsDao.findAllRights();
	}
/*================================Part==================================*/		
	/**
	 * 新增角色
	 * @param name 角色名
	 */
	public void addPart(String name){
		Part part=new Part();
		part.setPartName(name);
		partDao.save(part);
	}
	/**
	 * 新增角色
	 * @param name 角色名
	 * @param script 备注
	 */

	public void addPart(String name , String script){
		Part part=new Part();
		part.setPartName(name);
		part.setPartScript(script);
		partDao.save(part);
	}
	/**
	 * 获取角色集合
	 * @return 角色集合
	 */
	public List<Part> getPart(){
		return partDao.findAllPart();
	}
	/**
	 * 获取角色集合
	 * @return 角色集合
	 */
	public List<PartBean> getParts(){
		List<Part> parts = partDao.findAll(Part.class);
		Iterator<Part> it = parts.iterator();
		List<PartBean> beans = new ArrayList<PartBean>();
		
		for(int i = 0 ; it.hasNext() ; i++){
			
			PartBean partBean = new PartBean();
			
			Part part = it.next();
			partBean.setPartId(part.getPartId());
			partBean.setPartName(part.getPartName());
			partBean.setPartScript(part.getPartScript());
			Integer userNumber = userDao.findByPart(part).size();
			partBean.setUserNumber(userNumber);
			Integer rightsNumber = partRightsDao.findByPart(part).size();
			partBean.setRightsNumber(rightsNumber);
			
			beans.add(partBean);
			
		}
		return beans;
	}
	/**
	 * 获取角色对象
	 * @param part 角色对象
	 * @return 角色对象
	 */
	public Part getPart(Part part){
		String partName = part.getPartName();
		Part p = partDao.findByName(partName);
		return p;
	}
	/**
	 * 修改角色对象
	 * @param partName 原角色名称
	 * @param part 角色对象
	 */
	public void changePart(String partName , Part part){
		Part d = partDao.findByName(partName);
		if(part.getPartName() != null){
			d.setPartName(part.getPartName());
		}
		if(part.getPartScript() != null){
			d.setPartScript(part.getPartScript());
		}
	}
	
	/**
	 * 新增角色
	 * @param part 部门对象
	 */
	public void addPart(Part part){
		String name = part.getPartName();
		String script = part.getPartScript();
		
		if(part.getPartName() != null){
			if(part.getPartScript() != null){
				this.addPart(name, script);
			}
			else{
				this.addPart(name);
			}
		}
	}
	
/*================================PartRights==================================*/		
	/**
	 * 获取角色Id
	 * @param 角色名
	 * @return 角色Id
	 */
	public Integer getPartId(String partName){
		Part part = partDao.findByName(partName);
		return part.getPartId();
	}
	
	/**
	 * 获取权限ID
	 * @param 权限名
	 * @return 权限ID
	 */
	public Integer getRightsId(String rightsName){
		Rights rights = rightsDao.findByName(rightsName);
		return rights.getRightsId();
	}
	
	/**
	 * 新增角色权限
	 * @param 角色
	 * @param 权限
	 */
	public void addPartRights(String partName , String rightsName){
		PartRights pr = new PartRights();
		Integer partId = getPartId(partName);
		Integer rightsId = getRightsId(rightsName);

		
		Part part = partDao.get(Part.class, partId);
		Rights rights = rightsDao.get(Rights.class, rightsId);
				
		pr.setPart(part);
		pr.setRights(rights);
		
		partRightsDao.save(pr);
				
	}
	/**
	 * 获取角色权限集合
	 * @return 角色权限集合
	 */
	public List<PartRightsBean> getPartRights(){
		List<PartRights> prs = partRightsDao.findAll(PartRights.class);
		Iterator<PartRights> iprs = prs.iterator();
		List<PartRightsBean> prbs = new ArrayList<PartRightsBean>();


		for(; iprs.hasNext() ;){
			
			PartRightsBean partRightsBean = new PartRightsBean();
			
			PartRights partRights = iprs.next();
			Integer partRightsId = partRights.getPartRightsId();
			String rightName = partRights.getRights().getRightsName();

			String partName = partRights.getPart().getPartName();
			partRightsBean.setId(partRightsId);
			partRightsBean.setPart(partName);
			partRightsBean.setRights(rightName);
			prbs.add(partRightsBean);


		}

		return prbs;
	}
	/**
	 * 获取角色权限集合
	 * @param 角色
	 * @return 角色权限集合
	 */
	public List<PartRights> getPartRights(Part part){
		List<PartRights> prs = partRightsDao.findByPart(part);
		return prs;
	}
	public void delPartRightsByPart(Part part){
		List<PartRights> prs = this.getPartRights(part);
		if (prs !=null){
			Iterator<PartRights> it = prs.iterator();
			while(it.hasNext()){
				PartRights pr = new PartRights();
				pr = it.next();
				partRightsDao.delete(pr);
			}
		}
	}
	public void addPartRights(Integer partId , Integer rightsId){
		PartRights pr = new PartRights();
		

		
		Part part = partDao.get(Part.class, partId);
		Rights rights = rightsDao.get(Rights.class, rightsId);
				
		pr.setPart(part);
		pr.setRights(rights);
		
		partRightsDao.save(pr);
				
	}
	public void addPartRights(List<PartRights> prs){
		Iterator<PartRights> it = prs.iterator();
		while(it.hasNext()){
			PartRights pr = new PartRights();
			pr = it.next();
			Integer p = new Integer(pr.getPart().getPartId());
			Integer r = new Integer(pr.getRights().getRightsId());
			this.addPartRights(p, r);
		}
	}
	public void changePartRights(String partName , String[] rightsName){
		Part p = partDao.findByName(partName);
		
		
		this.delPartRightsByPart(p);
		
		
		List<PartRights> ps = new ArrayList<PartRights>();
		for(int i=0; i<rightsName.length;i++){
			PartRights pr =new PartRights();
			Rights r = rightsDao.findByName(rightsName[i]);
			pr.setPart(p);
			pr.setRights(r);
			ps.add(pr);
		}
		
		this.addPartRights(ps);
	}

/*================================Department==================================*/		
	
	/**
	 * 新增部门
	 * @param 部门名称
	 * @param 备注
	 */
	public void addDepartment(String depName , String depScript){
		Department dep=new Department();
		dep.setDepartmentName(depName);
		dep.setDepartmentScript(depScript);
		
		departmentDao.save(dep);
		
	}
	/**
	 * 新增部门
	 * @param 部门名称
	 */
	public void addDepartment(String depName){
		Department dep=new Department();
		dep.setDepartmentName(depName);
		
		departmentDao.save(dep);
	}
	/**
	 * 获取部门集合
	 * @return 部门集合
	 */
	public List<Department> getDepartment(){
		List<Department> ld = departmentDao.findAll(Department.class);
		return ld;
	}
	/**
	 * 获取部门集合
	 * @return 部门集合
	 */
	public List<DepartmentBean> getDepartments(){
		List<Department> deps = departmentDao.findAll(Department.class);
		Iterator<Department> it = deps.iterator();
		List<DepartmentBean> beans = new ArrayList<DepartmentBean>();
		
		for(int i = 0 ; it.hasNext() ; i++){
			
			DepartmentBean depBean = new DepartmentBean();
			
			Department dep = it.next();
			depBean.setDepartmentId(dep.getDepartmentId());
			depBean.setDepartmentName(dep.getDepartmentName());
			depBean.setDepartmentScript(dep.getDepartmentScript());
			Integer userNumber = userDao.findByDepartment(dep).size();
			depBean.setUserNumber(userNumber);
			
			beans.add(depBean);
			
		}
		return beans;
	}
	/**
	 * 获取部门对象
	 * @return 部门对象
	 */
	public Department getDepartment(Department dep){
		String depName = dep.getDepartmentName();
		Department department = departmentDao.findByName(depName);
		return department;
	}
	/**
	 * 修改部门对象
	 * @param depName 原部门名称
	 * @param dep 部门对象
	 */
	public void changeDepartment(String depName , Department dep){
		Department d = departmentDao.findByName(depName);
		if(dep.getDepartmentName() != null){
			d.setDepartmentName(dep.getDepartmentName());
		}
		if(dep.getDepartmentScript() != null){
			d.setDepartmentScript(dep.getDepartmentScript());
		}		
	}
	/**
	 * 删除部门对象
	 * @param depName 部门名
	 */
	public void delDepartment(String depName){
		Department dep = departmentDao.findByName(depName);
		List<User> users = userDao.findByDepartment(dep);
		Iterator<User> it = users.iterator();
		while(it.hasNext()){
			User u = it.next();

			u.setDepartment(null);
			userDao.update(u);
			
		}
		if(dep != null){
			departmentDao.delete(dep);}
		
	}
	/**
	 * 新增部门
	 * @param dep 部门对象
	 */
	public void addDepartment(Department dep){
		String name = dep.getDepartmentName();
		String script = dep.getDepartmentScript();
		
		if(dep.getDepartmentName() != null){
			if(dep.getDepartmentScript() != null){
				this.addDepartment(name, script);
			}
			else{
				this.addDepartment(name);
			}
		}
	}
	

/*================================ Car  ==================================*/
	public Integer addCar(Car car){
		Car c = new Car();
		if(car.getCarNumber()!=null){
			c.setCarNumber(car.getCarNumber());
			if(car.getCarBrand()!=null){
				c.setCarBrand(car.getCarBrand());
			}
			if(car.getCarColor()!= null){
				c.setCarColor(car.getCarColor());
			}
			if(car.getCarMileage()!= null){
				c.setCarMileage(car.getCarMileage());
			}
			carDao.save(c);
			return carDao.findByNumber(car.getCarNumber()).getCarId();
		}else return 0;
	}
	
	public Car getCar(String carNumber){
		return carDao.findByNumber(carNumber);
	}
	public Car getCar(Integer carId){
		return carDao.findById(carId);
	}
	public List<Car> getCarByBrand(String carBrand){
		return carDao.findByBarnd(carBrand);
	}
	
	public CarBean getCarBean(Integer id){
		Car car = carDao.findById(id);
		if(car != null){
			CarBean carBean = new CarBean();
			carBean.setCarId(car.getCarId());
			carBean.setCarNumber(car.getCarNumber());
			if(car.getCarBrand() != null){
				carBean.setCarBrand(car.getCarBrand());				
			}else{}
			if(car.getCarColor() != null){
				carBean.setCarColor(car.getCarColor());
			}else{}
			if(car.getCarMileage() != null){
				carBean.setCarMileage(car.getCarMileage()); 
			}else{}
			
			CustomerCar cc = customerCarDao.findByCar(car);
			if(cc != null){				
				carBean.setCustomer(cc.getCustomer().getCustomerName());
				CustomerRank cr = customerRankDao.findByCustomer(cc.getCustomer());
				carBean.setRankName(cr.getRank().getRankName());
				carBean.setCustomerTel(cr.getCustomer().getCustomerTel());
			}
			else{}
			
			List<CarService> css = carServiceDao.findByCar(car);
			if (css!= null && css.size() >= 1){
				carBean.setServiceCount(css.size());
				
				carBean.setExpense(this.getCarExpense(css));
			}else {}
			
			return carBean;
			
		}
		else{
			return null;
		}
	}
	
	public List<CarBean> getCarBeans(){
		List<Car>  cs = carDao.findAll(Car.class);
		if(cs != null && cs.size() >= 0){
			List<CarBean> cbs = new ArrayList<CarBean>();
			Iterator<Car> it = cs.iterator();
			while(it.hasNext()){			
				CarBean cb = new CarBean();
				cb = this.getCarBean(it.next().getCarId());
				cbs.add(cb);
			}
			return cbs;
		}else{
			return null;
		}
	}
	
	public List<CarBean> searchCarBeans(List<CarBean> carBeans, String str){

		if(carBeans != null){
			List<CarBean> cbs = new ArrayList<CarBean>();
			Iterator<CarBean> it = carBeans.iterator();
			while(it.hasNext()){
				CarBean cb = new CarBean();
				cb = it.next();
				
				if(cb.getCarNumber().equals(str)){
					cbs.add(cb);
					continue;
				}
				if(cb.getCustomer()!=null)
				if(cb.getCustomer().equals(str)){
					cbs.add(cb);
					
				}
				if(cb.getCustomerTel()!=null)
				if(cb.getCustomerTel().equals(str)){
					cbs.add(cb);
					
				}
			}
			return cbs;
		}
		else {
			return null;
		}
	}
	
	public CarBean getCarBeanById(Integer id){
		List<CarBean> cbs = this.getCarBeans();
		if(cbs!=null&& cbs.size()>=1){
			Iterator<CarBean> it = cbs.iterator();
			CarBean cb = new CarBean();
			while(it.hasNext()){				
				CarBean c = it.next();
				if(c.getCarId()==id){
					cb=c;
					break;
				}				
			}
			return cb;			
		}
		else return null;
	}
	
	public void changeCar(CarBean carBean){
		Car car = carDao.findById(carBean.getCarId());
		if (car!=null){
			car.setCarBrand(carBean.getCarBrand());
			car.setCarColor(carBean.getCarColor());
			car.setCarMileage(car.getCarMileage());
			carDao.update(car);
		}
		
	}
	
/*================================ Customer  ==================================*/
	public void addCustomer(Customer customer){
		customerDao.save(customer);		
	}
	public Customer getCustomer(Integer i){
		return customerDao.findById(i);
	}
	public Customer getCustomerByTel(String str){
		return customerDao.findByTel(str);
	}
	public Customer getCustomer(String customerIdCard){
		return customerDao.findByIdCard(customerIdCard);
	}
	public CustomerBean getCustomerBean(Integer id){
		Customer cur = customerDao.findById(id);
		if(cur!=null){
			CustomerBean cb = new CustomerBean();
			cb.setCustomerId(cur.getCustomerId());
			cb.setCustomerName(cur.getCustomerName());
			cb.setCustomerAddress(cur.getCustomerAddress());
			cb.setCustomerScript(cur.getCustomerScript());
			cb.setCustomerSex(cur.getCustomerSex());
			cb.setCustomerTel(cur.getCustomerTel());
			cb.setCustomerIdCard(cur.getCustomerIdCard());
			
			CustomerRank cr = customerRankDao.findByCustomer(cur);
			if(cr != null){
				cb.setRank(cr.getRank().getRankName());
			}
			
		
			
			CustomerCar cc = customerCarDao.findByCustomer(cur);
			if(cc!=null){
				Car c = cc.getCar();
				cb.setCarNumber(c.getCarNumber());
				List<CarService> css = carServiceDao.findByCar(c);
				if(css != null && css.size() >=1){
					cb.setServiceCount(css.size());
					cb.setExpense(this.getCarExpense(css));
				}				
			}
			return cb;
		}
		else{
			return null;
		}
	}
	
	public List<CustomerBean> getCustomerBeans(){
		List<Customer>  cs = customerDao.findAll(Customer.class);
		if(cs != null && cs.size() >= 0){
			List<CustomerBean> cbs = new ArrayList<CustomerBean>();
			Iterator<Customer> it = cs.iterator();
			while(it.hasNext()){			
				CustomerBean cb = new CustomerBean();
				cb = this.getCustomerBean(it.next().getCustomerId());
				cbs.add(cb);
			}
			return cbs;
		}else{
			return null;
		}
	}
	
	public void addCustomer(CustomerBean cb, Integer carId){
		Customer cus = new Customer();
	if(cb.getCustomerIdCard()!=null){
		if(cb.getCustomerAddress()!=null){
			cus.setCustomerAddress(cb.getCustomerAddress());
		}
		if(cb.getCustomerIdCard()!=null){
			cus.setCustomerIdCard(cb.getCustomerIdCard());
		}
		if(cb.getCustomerName()!=null){
			cus.setCustomerName(cb.getCustomerName());
		}
		if(cb.getCustomerScript()!=null){
			cus.setCustomerScript(cb.getCustomerScript());
		}
		if(cb.getCustomerSex()!=null){
			cus.setCustomerSex(cb.getCustomerSex());
		}
		if(cb.getCustomerTel()!=null){
			cus.setCustomerTel(cb.getCustomerTel());
		}
		this.addCustomer(cus);
		
		if(carId!=0){
			CustomerCar cc= new CustomerCar();
			cc.setCustomer(cus);
			cc.setCar(carDao.findById(carId));
			this.addCustomerCar(cc);
		}
		CustomerRank cr = new CustomerRank();
		cr.setCustomer(cus);
		cr.setRank(rankDao.findByName(cb.getRank()));
		this.addCustomerRank(cr);
	}
	}
	
	public void changeCustomer(CustomerBean cb){
		Customer cus = customerDao.findById(cb.getCustomerId());
		if (cus!=null){
			cus.setCustomerAddress(cb.getCustomerAddress());
			cus.setCustomerId(cb.getCustomerId());
			cus.setCustomerIdCard(cb.getCustomerIdCard());
			cus.setCustomerName(cb.getCustomerName());
			cus.setCustomerScript(cb.getCustomerScript());
			cus.setCustomerSex(cb.getCustomerSex());
			cus.setCustomerTel(cb.getCustomerTel());
			customerDao.update(cus);
			
			
			Rank rank = rankDao.findByName(cb.getRank());
			if(rank!=null){
				CustomerRank cr = customerRankDao.findByCustomer(cus);
				cr.setRank(rank);
				customerRankDao.update(cr);
			}
		}
	}

	public List<CustomerBean> searchCustomerBeans(List<CustomerBean> customerBeans, String str){

		if(customerBeans != null){
			List<CustomerBean> cbs = new ArrayList<CustomerBean>();
			Iterator<CustomerBean> it = customerBeans.iterator();
			while(it.hasNext()){
				CustomerBean cb = new CustomerBean();
				cb = it.next();
				
				if(cb.getCarNumber().equals(str)){
					cbs.add(cb);
					continue;
				}
				
				if(cb.getCustomerIdCard().equals(str)){
					cbs.add(cb);
					continue;
					
				}

				if(cb.getCustomerTel().equals(str)){
					cbs.add(cb);
					continue;					
				}
				if(cb.getCustomerName().equals(str)){
					cbs.add(cb);
					continue;
				}
			}
			return cbs;
		}
		else {
			return null;
		}
	}
/*================================ Rank  ==================================*/
	public void addRank(Rank rank){
		rankDao.save(rank);
	}
	public Rank getRank(Integer i){
		return rankDao.findById(i);
	}
	public Rank getRank(String rankName){
		return rankDao.findByName(rankName);
	}
	
	public RankBean getRankBean(Integer id){
		Rank r = rankDao.findById(id);
		if(r != null){
			RankBean rb = new RankBean();
			rb.setRankId(r.getRankId());
			rb.setRankName(r.getRankName());
			rb.setRankDiscount(r.getRankDiscount());
			rb.setRankCost(r.getRankCost());
			rb.setRankScript(r.getRankScript());
			List<CustomerRank> li = customerRankDao.findByRank(r);
			if(li != null && li.size()>=1)
				rb.setUserCount(li.size());	
			return rb;
		}
		else{
			return null;
		}
	}
	
	public List<RankBean> getRankBeans(){
		List<Rank>  cs = rankDao.findAll(Rank.class);
		if(cs != null && cs.size() >= 0){
			List<RankBean> cbs = new ArrayList<RankBean>();
			Iterator<Rank> it = cs.iterator();
			while(it.hasNext()){			
				RankBean cb = new RankBean();
				cb = this.getRankBean(it.next().getRankId());
				cbs.add(cb);
			}
			return cbs;
		}else{
			return null;
		}
	}
	
	public void changeRank(RankBean rb){
		Rank r = rankDao.findById(rb.getRankId());
		if (rb!=null){
			r.setRankCost(rb.getRankCost());
			r.setRankDiscount(rb.getRankDiscount());
			r.setRankId(rb.getRankId());
			r.setRankName(rb.getRankName());
			r.setRankScript(rb.getRankScript());
			rankDao.update(r);
		}
	}
	
	
/*================================  Service ==================================*/
	public void addService(Service service){
		serviceDao.save(service);
	}
	
	public Service getService(Integer i){
		return serviceDao.findById(i);
	}
	public Service getService(String serviceNumber){
		return serviceDao.findByNumber(serviceNumber);
	}
	public ServiceBean getServiceBean(Integer i){
		Service s = serviceDao.findById(i);
		if(s!=null){
			ServiceBean sd = new ServiceBean();
			sd.setServiceId(s.getServiceId());
			sd.setServiceName(s.getServiceName());
			sd.setServiceNumber(s.getServiceNumber());
			sd.setServicePrice(s.getServicePrice());
			sd.setServiceUnit(s.getServiceUnit());
			List<CarService> css = carServiceDao.findByService(s);
			if(css != null && css.size()>=1){
				sd.setCount(css.size());
			}
			return sd;
			
		}
		return null;
	}
	
	public List<ServiceBean> getServiceBeans(){
		List<Service>  cs = serviceDao.findAll(Service.class);
		if(cs != null && cs.size() >= 0){
			List<ServiceBean> cbs = new ArrayList<ServiceBean>();
			Iterator<Service> it = cs.iterator();
			while(it.hasNext()){			
				ServiceBean cb = new ServiceBean();
				cb = this.getServiceBean(it.next().getServiceId());
				cbs.add(cb);
			}
			return cbs;
		}else{
			return null;
		}
	}
	
	public List<Service> getServices(){
		List<Service> cs = serviceDao.findAll(Service.class);
		return cs;
	}
	public void changeService(Service service){
		if(service.getServiceId()!=null){
			serviceDao.update(service);
		}
	}
	
/*================================ CarService  ==================================*/
	public void addCarService(CarService carService){
		carServiceDao.save(carService);
	}
	public CarService getCarService(Integer i){
		return carServiceDao.findById(i);
	}
	
	public double getCarExpense(List<CarService> css){
		
		Iterator<CarService> it = css.iterator();
		double sum = 0.0;
		
		while(it.hasNext()){
			CarService cs = it.next();
			sum = sum + (cs.getService().getServicePrice()*cs.getRank().getRankDiscount());
		}
		return sum;
	}
	
	public List<ExpenseBean> getExpense(Integer carId){
		List<ExpenseBean> ebs = new ArrayList<ExpenseBean>();
		Car car = carDao.findById(carId);
		CustomerCar cc = customerCarDao.findByCar(car);
		Customer cus =new Customer();
		if(cc!=null){
			cus = cc.getCustomer();
		}
				
		List<CarService> css = carServiceDao.findByCar(car);
		if(css!=null&&css.size()>=1){
			Iterator<CarService> it = css.iterator();
			while(it.hasNext()){
				CarService cs = it.next();
				ExpenseBean eb = new ExpenseBean();
				eb.setCarNumber(car.getCarNumber());
				if(cus!=null)
					eb.setCustomerName(cus.getCustomerName());
				double price = cs.getService().getServicePrice();
				eb.setServicePrice(price);
			
				eb.setServiceNumber(cs.getService().getServiceNumber());
				eb.setServiceName(cs.getService().getServiceName());
			
				if(cs.getRank()!=null){
					double discount = cs.getRank().getRankDiscount();
					eb.setRankDiscount(discount);
				}
				else eb.setRankDiscount(1.0);
				eb.setPrice(price*eb.getRankDiscount());
				ebs.add(eb);
			}
			return ebs;
			
		}
		else return null;
		
	}
	
/*================================ CustomerRank  ==================================*/
	public void addCustomerRank(CustomerRank customerRank){
		customerRankDao.save(customerRank);
	}
	public  CustomerRank getCustomerRank(Integer i){
		return customerRankDao.findById(i);
	}
/*================================ CustomerCar  ==================================*/
	public void addCustomerCar(CustomerCar customerCar){
		customerCarDao.save(customerCar);
	}
	public CustomerCar getCustomerCar(Integer i){
		return customerCarDao.findById(i);
	}

	public boolean hasCustomer(Integer i){
		if(customerCarDao.findByCar(carDao.findById(i))==null){
			return false;
		}
		else return true;
	}
	
	/*================================ checkout  ==================================*/
	public Rank getCarRank(Integer carId){
		Car car = carDao.findById(carId);	
			//获取rank
			Rank rank;
			CustomerCar cc = customerCarDao.findByCar(car);
			if(cc!=null){
				Customer cus = cc.getCustomer();
				rank = customerRankDao.findByCustomer(cus).getRank();
			}else rank = rankDao.findById(1);
			return rank;
	
	}
	
	public List<CarServiceBean> getCarServices(Integer carId){
		Car car = carDao.findById(carId);
		
		if(car!=null){
			//获取rank
			Rank rank;
			CustomerCar cc = customerCarDao.findByCar(car);
			if(cc!=null){
				Customer cus = cc.getCustomer();
				rank = customerRankDao.findByCustomer(cus).getRank();
			}else rank = rankDao.findById(1);
		
			//创建List<CarServiceBean>
			List<CarServiceBean> csbs = new ArrayList<CarServiceBean>();
			//获取List<Service>
			List<Service> services = serviceDao.findAll(Service.class);
			Iterator<Service> it = services.iterator();
			while(it.hasNext()){
				Service s = it.next();
				CarServiceBean csb = new CarServiceBean();
				//设置Rank
				double discount = rank.getRankDiscount();
				csb.setRankDiscount(discount);
				csb.setRankName(rank.getRankName());
				//设置Service
				csb.setServiceId(s.getServiceId());
				csb.setServiceName(s.getServiceName());
				csb.setServiceNumber(s.getServiceNumber());
				double p = s.getServicePrice();
				csb.setServicePrice(p);
				csb.setServiceUnit(s.getServiceUnit());
				//设置价格
				csb.setPrice(p*discount);
				csbs.add(csb);
			}
			return csbs;
		
		}else return null;
		
	}
	
	public double addCarService(Integer[] serviceIds, Integer carId){
		Car car = carDao.findById(carId);
		double sum = 0.0;
		if(car!=null){
			
			Rank rank= this.getCarRank(carId);
			double discount = rank.getRankDiscount();
			
			for(int i=0 ; i<serviceIds.length ; i++){
				Service s=null;
				s = serviceDao.findById(serviceIds[i]);
				if(s!=null){
					double price = s.getServicePrice();
					
					CarService cs = new CarService();
					cs.setCar(car);
					cs.setService(s);
					cs.setRank(rank);
					this.addCarService(cs);
					sum = sum + discount*price;
				}
			}
		}
		return sum;
	}
	public List<CarServiceBean> getCarServices(Integer[] serviceIds, Integer carId){
		Car car = carDao.findById(carId);
		
		if(car!=null){
			//获取rank
			Rank rank;
			CustomerCar cc = customerCarDao.findByCar(car);
			if(cc!=null){
				Customer cus = cc.getCustomer();
				rank = customerRankDao.findByCustomer(cus).getRank();
			}else rank = rankDao.findById(1);
		
			//创建List<CarServiceBean>
			List<CarServiceBean> csbs = new ArrayList<CarServiceBean>();
			//获取List<Service>
			List<Service> services = new ArrayList<Service>();
			for(int i=0;i<serviceIds.length;i++){
				services.add(serviceDao.findById(serviceIds[i]));
			}
			Iterator<Service> it = services.iterator();
			while(it.hasNext()){
				Service s = it.next();
				CarServiceBean csb = new CarServiceBean();
				//设置Rank
				double discount = rank.getRankDiscount();
				csb.setRankDiscount(discount);
				csb.setRankName(rank.getRankName());
				//设置Service
				csb.setServiceId(s.getServiceId());
				csb.setServiceName(s.getServiceName());
				csb.setServiceNumber(s.getServiceNumber());
				double p = s.getServicePrice();
				csb.setServicePrice(p);
				csb.setServiceUnit(s.getServiceUnit());
				//设置价格
				csb.setPrice(p*discount);
				csbs.add(csb);
			}
			return csbs;
		
		}else return null;
	}
	
}
