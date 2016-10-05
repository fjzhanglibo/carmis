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
	//��½ʧ��
	public static final int LOGIN_FAIL = 0;
	//��ǰ̨��ݵ�½
	public static final int LOGIN_FIR = 1;
	//�Ծ������
	public static final int LOGIN_MGR = 2;
	//�Թ���Ա��ݵ�½
	public static final int LOGIN_ADM = 3;
	//����ͨԱ����ݵ�½
	public static final int LOGIN_EMP = 4;
	
	/**
	 * ��֤��½���
	 * @param user ��½��Ա
	 * @return ��¼������ȷ��:0Ϊ��¼ʧ�ܣ�1Ϊ��¼fir 2Ϊ��¼mgr 3Ϊ��½adm 3Ϊ��½ emp
	 */
	public Part validLogin(User user);
/*=================User==========================*/
	/**
	 * �����û�
	 * @param account �˻���
	 * @param name �û�����
	 * @param password ����
	 * @param departmentId ����id
	 * @param partId ��ɫid
	 */
	public void addUser(String account , String name , String password , Integer departmentId , Integer partId);
	/**
	 * �����û�
	 * @param account �˻���
	 * @param name �û�����
	 * @param password ����
	 * @param departmentId ����id
	 */
	public void addUser(String account , String name , String password , Integer departmentId);
	/**
	 * ��ȡ�û�
	 * @return �û�����
	 */
	public List<UserBean> getUsers();
	/**
	 * ��ȡ�û�����
	 * @param user ��½��Ա
	 * @return �û�����
	 */
	public User getUser(User user);
	public User getUser(String userName);
	/**
	 * ��ȡ�û�����
	 * @param user �����û��˻����û�����
	 * @return �û�����
	 */
	public UserBean getUserBean(User user);
	/**
	 * ��ȡ�û�����
	 * @param dep ����
	 * @return �û����󼯺�
	 */
	public List<UserBean> getUserBeansByDepartment(Department dep);
	public List<UserBean> getUserBeansByPart(Part dep);
	/**
	 * �����û�����
	 * @param userBean �����û�����
	 */
	public void changeUser(UserBean userBean);
	/**
	 * ɾ������
	 * @param userAccount �����û�����
	 */
	public void delUser(String userAccount);
	/**
	 * ����û�����
	 * @param userBean �����û�����
	 */
	public void addUser(UserBean userbean);

/*========================Rights====================================*/
	
	/**
	 * ����Ȩ��
	 * @param name Ȩ����
	 */
	public void addRights(String name );
	/**
	 * ����Ȩ��
	 * @param name Ȩ����
	 * @param script ��ע
	 */
	public void addRights(String name , String script);
	/**
	 * ��ȡȨ��
	 * @return Ȩ��
	 */
	public List<Rights> getRights();
			
/*==============================Part===========================================*/
	
	/**
	 * ������ɫ
	 * @param name ��ɫ��
	 */
	public void addPart(String name );
	/**
	 * ������ɫ
	 * @param name ��ɫ��
	 * @param script ��ע
	 */
	public void addPart(String name , String script);
	/**
	 * ��ȡ��ɫ����
	 * @return ��ɫ����
	 */
	public List<Part> getPart();
	/**
	 * ��ȡ��ɫ����
	 * @return ��ɫ����
	 */
	public List<PartBean> getParts();
	/**
	 * ��ȡ��ɫ����
	 * @param part ��ɫ����
	 * @return ��ɫ����
	 */
	public Part getPart(Part part);
	/**
	 * �޸Ľ�ɫ����
	 * @param partName ԭ��ɫ����
	 * @param part ��ɫ����
	 */
	public void changePart(String partName , Part part);
	/**
	 * ������ɫ
	 * @param part ���Ŷ���
	 */
	public void addPart(Part part);
	
	/*================================PartRights==================================*/	
	/**
	 * ��ȡ��ɫId
	 * @param ��ɫ��
	 * @return ��ɫId
	 */
	public Integer getPartId(String partName);
	/**
	 * ��ȡȨ��ID
	 * @param Ȩ����
	 * @return Ȩ��ID
	 */
	public Integer getRightsId(String rightsName);
	
	/**
	 * ������ɫȨ��
	 * @param ��ɫ
	 * @param Ȩ��
	 */
	public void addPartRights(String partName , String rightsName);
	/**
	 * ��ȡ��ɫȨ�޼���
	 * @return ��ɫȨ�޼���
	 */
	public List<PartRightsBean> getPartRights();
	/**
	 * ��ȡ��ɫȨ�޼���
	 * @param ��ɫ
	 * @return ��ɫȨ�޼���
	 */
	public List<PartRights> getPartRights(Part part);
	public void delPartRightsByPart(Part part);
	public void addPartRights(Integer partId , Integer rightsId);
	public void addPartRights(List<PartRights> prs);
	public void changePartRights(String partName , String[] rightsName);

	/*============================Department=========================*/
	/**
	 * ��������
	 * @param ��������
	 * @param ��ע
	 */	
	public void addDepartment(String depName , String depScript);
	/**
	 * ��������
	 * @param ��������
	 */
	public void addDepartment(String depName);
	/**
	 * ��ȡ���ż���
	 * @return ���ż���
	 */
	public List<Department> getDepartment();
	/**
	 * ��ȡ���ż���
	 * @return ���ż���
	 */
	public List<DepartmentBean> getDepartments();
	/**
	 * ��ȡ���Ŷ���
	 * @return ���Ŷ���
	 */
	public Department getDepartment(Department dep);
	/**
	 * �޸Ĳ��Ŷ���
	 * @param depName ԭ��������
	 * @param dep ���Ŷ���
	 */
	public void changeDepartment(String depName , Department dep);
	/**
	 * ɾ�����Ŷ���
	 * @param depName ������
	 */
	public void delDepartment(String depName);
	/**
	 * ��������
	 * @param dep ���Ŷ���
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
