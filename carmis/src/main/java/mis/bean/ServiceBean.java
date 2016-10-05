package mis.bean;

public class ServiceBean {
	//服务项目标识
	private Integer serviceId;
	//服务项目编号
	private String serviceNumber;
	//服务项目名称
	private String serviceName;
	//单位
	private String serviceUnit;
	//单价
	private double servicePrice;
	//次数
	private Integer count;
	public ServiceBean() {
		super();
	}
	public ServiceBean(Integer serviceId, String serviceNumber,
			String serviceName, String serviceUnit, double servicePrice,
			Integer count) {
		super();
		this.serviceId = serviceId;
		this.serviceNumber = serviceNumber;
		this.serviceName = serviceName;
		this.serviceUnit = serviceUnit;
		this.servicePrice = servicePrice;
		this.count = count;
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
	public String getServiceUnit() {
		return serviceUnit;
	}
	public void setServiceUnit(String serviceUnit) {
		this.serviceUnit = serviceUnit;
	}
	
	public double getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(double servicePrice) {
		this.servicePrice = servicePrice;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
}
