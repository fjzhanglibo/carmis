package mis.bean;

public class CarServiceBean extends ServiceBean{

	//服务项目标识
	private Integer serviceId;
	//服务项目编号
	private String serviceNumber;
	//服务项目名称
	private String serviceName;
	//单价
	private double servicePrice;
	//等级名称
	private String rankName;
	//折扣额
	private Double rankDiscount;
	//折扣后价格
	private double price;
	
	public CarServiceBean() {
		super();
	}
	
	public CarServiceBean(Integer serviceId, String serviceNumber,
			String serviceName, double servicePrice, String rankName,
			Double rankDiscount, double price) {
		super();
		this.serviceId = serviceId;
		this.serviceNumber = serviceNumber;
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
		this.rankName = rankName;
		this.rankDiscount = rankDiscount;
		this.price = price;
	}

	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
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
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}
	public Double getRankDiscount() {
		return rankDiscount;
	}
	public void setRankDiscount(Double rankDiscount) {
		this.rankDiscount = rankDiscount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
