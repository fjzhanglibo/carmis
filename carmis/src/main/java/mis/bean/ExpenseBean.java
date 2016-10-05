package mis.bean;

public class ExpenseBean {
	//车牌号
	private String carNumber;
	//姓名
	private String customerName;
	//服务项目编号
	private String serviceNumber;
	//服务项目名称
	private String serviceName;
	//单价
	private double servicePrice;
	//折扣额
	private Double rankDiscount;
	//实际价格
	private Double price;
	
	public ExpenseBean() {
		super();
	}
	
	public ExpenseBean(String carNumber, String customerName,
			String serviceNumber, String serviceName, double servicePrice,
			Double rankDiscount, Double price) {
		super();
		this.carNumber = carNumber;
		this.customerName = customerName;
		this.serviceNumber = serviceNumber;
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
		this.rankDiscount = rankDiscount;
		this.price = price;
	}

	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public double getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(double servicePrice) {
		this.servicePrice = servicePrice;
	}
	public Double getRankDiscount() {
		return rankDiscount;
	}
	public void setRankDiscount(Double rankDiscount) {
		this.rankDiscount = rankDiscount;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
