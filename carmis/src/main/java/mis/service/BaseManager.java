package mis.service;

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

public interface BaseManager {
	//登陆失败
	public static final int LOGIN_FAIL = 0;
	//以前台身份登陆
	public static final int LOGIN_FIR = 1;
	//以经理身份
	public static final int LOGIN_MGR = 2;
	//以管理员身份登陆
	public static final int LOGIN_ADM = 3;
	//以普通员工身份登陆
	public static final int LOGIN_EMP = 4;
	
	/**
	 * 验证登陆身份
	 * @param user 登陆人员
	 * @return 登录后的身份确认:0为登录失败，1为登录fir 2为登录mgr 3为登陆adm 3为登陆 emp
	 */
	public Part validLogin(User user);
/*=================User==========================*/
	/**
	 * 新增用户
	 * @param account 账户名
	 * @param name 用户姓名
	 * @param password 密码
	 * @param departmentId 部门id
	 * @param partId 角色id
	 */
	public void addUser(String account , String name , String password , Integer departmentId , Integer partId);
	/**
	 * 新增用户
	 * @param account 账户名
	 * @param name 用户姓名
	 * @param password 密码
	 * @param departmentId 部门id
	 */
	public void addUser(String account , String name , String password , Integer departmentId);
	/**
	 * 获取用户
	 * @return 用户集合
	 */
	public List<UserBean> getUsers();
	/**
	 * 获取用户对象
	 * @param user 登陆人员
	 * @return 用户对象
	 */
	public User getUser(User user);
	public User getUser(String userName);
	/**
	 * 获取用户对象
	 * @param user 包含用户账户的用户对象
	 * @return 用户对象
	 */
	public UserBean getUserBean(User user);
	/**
	 * 获取用户对象
	 * @param dep 部门
	 * @return 用户对象集合
	 */
	public List<UserBean> getUserBeansByDepartment(Department dep);
	public List<UserBean> getUserBeansByPart(Part dep);
	/**
	 * 更改用户对象
	 * @param userBean 包含用户对象
	 */
	public void changeUser(UserBean userBean);
	/**
	 * 删除对象
	 * @param userAccount 包含用户对象
	 */
	public void delUser(String userAccount);
	/**
	 * 添加用户对象
	 * @param userBean 包含用户对象
	 */
	public void addUser(UserBean userbean);

/*========================Rights====================================*/
	
	/**
	 * 新增权限
	 * @param name 权限名
	 */
	public void addRights(String name );
	/**
	 * 新增权限
	 * @param name 权限名
	 * @param script 备注
	 */
	public void addRights(String name , String script);
	/**
	 * 获取权限
	 * @return 权限
	 */
	public List<Rights> getRights();
			
/*==============================Part===========================================*/
	
	/**
	 * 新增角色
	 * @param name 角色名
	 */
	public void addPart(String name );
	/**
	 * 新增角色
	 * @param name 角色名
	 * @param script 备注
	 */
	public void addPart(String name , String script);
	/**
	 * 获取角色集合
	 * @return 角色集合
	 */
	public List<Part> getPart();
	/**
	 * 获取角色集合
	 * @return 角色集合
	 */
	public List<PartBean> getParts();
	/**
	 * 获取角色对象
	 * @param part 角色对象
	 * @return 角色对象
	 */
	public Part getPart(Part part);
	/**
	 * 修改角色对象
	 * @param partName 原角色名称
	 * @param part 角色对象
	 */
	public void changePart(String partName , Part part);
	/**
	 * 新增角色
	 * @param part 部门对象
	 */
	public void addPart(Part part);
	
	/*================================PartRights==================================*/	
	/**
	 * 获取角色Id
	 * @param 角色名
	 * @return 角色Id
	 */
	public Integer getPartId(String partName);
	/**
	 * 获取权限ID
	 * @param 权限名
	 * @return 权限ID
	 */
	public Integer getRightsId(String rightsName);
	
	/**
	 * 新增角色权限
	 * @param 角色
	 * @param 权限
	 */
	public void addPartRights(String partName , String rightsName);
	/**
	 * 获取角色权限集合
	 * @return 角色权限集合
	 */
	public List<PartRightsBean> getPartRights();
	/**
	 * 获取角色权限集合
	 * @param 角色
	 * @return 角色权限集合
	 */
	public List<PartRights> getPartRights(Part part);
	public void delPartRightsByPart(Part part);
	public void addPartRights(Integer partId , Integer rightsId);
	public void addPartRights(List<PartRights> prs);
	public void changePartRights(String partName , String[] rightsName);

	/*============================Department=========================*/
	/**
	 * 新增部门
	 * @param 部门名称
	 * @param 备注
	 */	
	public void addDepartment(String depName , String depScript);
	/**
	 * 新增部门
	 * @param 部门名称
	 */
	public void addDepartment(String depName);
	/**
	 * 获取部门集合
	 * @return 部门集合
	 */
	public List<Department> getDepartment();
	/**
	 * 获取部门集合
	 * @return 部门集合
	 */
	public List<DepartmentBean> getDepartments();
	/**
	 * 获取部门对象
	 * @return 部门对象
	 */
	public Department getDepartment(Department dep);
	/**
	 * 修改部门对象
	 * @param depName 原部门名称
	 * @param dep 部门对象
	 */
	public void changeDepartment(String depName , Department dep);
	/**
	 * 删除部门对象
	 * @param depName 部门名
	 */
	public void delDepartment(String depName);
	/**
	 * 新增部门
	 * @param dep 部门对象
	 */
	public void addDepartment(Department dep);
	
	/*================================ Car  ==================================*/
		
		
		public Integer addCar(Car car);
		public Car getCar(String carNumber);
		public Car getCar(Integer carId);
		public List<Car> getCarByBrand(String carBrand);
		public CarBean getCarBean(Integer id);
		public List<CarBean> getCarBeans();
		public List<CarBean> searchCarBeans(List<CarBean> carBeans, String str);
		public CarBean getCarBeanById(Integer id);
		public void changeCar(CarBean carBean);

	/*================================ Customer  ==================================*/
		public void addCustomer(Customer customer);
		public Customer getCustomer(Integer i);
		public Customer getCustomerByTel(String str);
		public Customer getCustomer(String customerIdCard);
		public CustomerBean getCustomerBean(Integer id);
		public List<CustomerBean> getCustomerBeans();
		public void addCustomer(CustomerBean cb, Integer carId);
		public void changeCustomer(CustomerBean cb);
		public List<CustomerBean> searchCustomerBeans(List<CustomerBean> CustomerBean, String str);
	/*================================ Rank  ==================================*/
		public void addRank(Rank rank);
		public Rank getRank(Integer i);
		public Rank getRank(String rankName);
		public RankBean getRankBean(Integer id);
		public List<RankBean> getRankBeans();
		public void changeRank(RankBean rb);
	/*================================  Service ==================================*/
		public void addService(Service service);
		public Service getService(Integer i);
		public Service getService(String serviceNumber);
		public ServiceBean getServiceBean(Integer i);
		public List<ServiceBean> getServiceBeans();
		public List<Service> getServices();
		public void changeService(Service service);
	/*================================ CarService  ==================================*/
		public void addCarService(CarService carService);
		public CarService getCarService(Integer i);
		public List<ExpenseBean> getExpense(Integer carId);
	
	/*================================ CustomerRank  ==================================*/
		public void addCustomerRank(CustomerRank customerRank);
		public CustomerRank getCustomerRank(Integer i);
	/*================================ CustomerCar  ==================================*/	
		public void addCustomerCar(CustomerCar customerCar);
		public CustomerCar getCustomerCar(Integer i);
		public boolean hasCustomer(Integer i);
	
	/*================================ checkout  ==================================*/
		public List<CarServiceBean> getCarServices(Integer carId);
		public double addCarService(Integer[] serviceIds, Integer carId);
		public List<CarServiceBean> getCarServices(Integer[] serviceIds, Integer carId);
		
		
		
		
		
		
		
		

}
