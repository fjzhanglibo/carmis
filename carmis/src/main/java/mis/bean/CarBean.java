package mis.bean;

public class CarBean {
	private Integer carId;
	//���ƺ�
	private String carNumber;
	//Ʒ��
	private String carBrand;
	//��ɫ
	private String carColor;
	//���
	private Integer carMileage;
	//�����˿�
	private String customer;
	//�˿͵ȼ�
	private String rankName;
	//���Ѵ���
	private Integer serviceCount;
	//���ѽ��
	private double expense;
	//�˿͵绰
	private String customerTel;
	public CarBean() {
		super();
	}
	public CarBean(Integer carId, String carNumber, String carBrand,
			String carModel, Integer carMileage, String customer,
			String rankName, Integer serviceCount, double expense, String customerTel) {
		super();
		this.carId = carId;
		this.carNumber = carNumber;
		this.carBrand = carBrand;
		this.carColor = carModel;
		this.carMileage = carMileage;
		this.customer = customer;
		this.rankName = rankName;
		this.serviceCount = serviceCount;
		this.expense = expense;
		this.customerTel = customerTel;
	}
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	public Integer getCarMileage() {
		return carMileage;
	}
	public void setCarMileage(Integer carMileage) {
		this.carMileage = carMileage;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}
	public Integer getServiceCount() {
		return serviceCount;
	}
	public void setServiceCount(Integer serviceCount) {
		this.serviceCount = serviceCount;
	}
	public double getExpense() {
		return expense;
	}
	public void setExpense(double expense) {
		this.expense = expense;
	}
	public String getCustomerTel() {
		return customerTel;
	}
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}
	
	

}
