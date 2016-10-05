package mis.bean;

public class CustomerBean {
	private Integer customerId;
	//���֤����
	private String customerIdCard;
	//����
	private String customerName;
	//�Ա�
	private String customerSex;
	//�绰
	private String customerTel;
	//��ַ
	private String customerAddress;
	//��ע
	private String customerScript;
	//ӵ�г���
	private String carNumber;
	//���Ѵ���
	private Integer serviceCount;
	//���ѽ��
	private double expense;
	//�˿͵ȼ�
	private String rank;
	public CustomerBean() {
		super();
	}
	public CustomerBean(Integer customerId, String customerIdCard,
			String customerName, String customerSex, String customerTel,
			String customerAddress, String customerScript, String carNumber,
			Integer serviceCount, double expense, String rank) {
		super();
		this.customerId = customerId;
		this.customerIdCard = customerIdCard;
		this.customerName = customerName;
		this.customerSex = customerSex;
		this.customerTel = customerTel;
		this.customerAddress = customerAddress;
		this.customerScript = customerScript;
		this.carNumber = carNumber;
		this.serviceCount = serviceCount;
		this.expense = expense;
		this.rank = rank;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerIdCard() {
		return customerIdCard;
	}
	public void setCustomerIdCard(String customerIdCard) {
		this.customerIdCard = customerIdCard;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerSex() {
		return customerSex;
	}
	public void setCustomerSex(String customerSex) {
		this.customerSex = customerSex;
	}
	public String getCustomerTel() {
		return customerTel;
	}
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerScript() {
		return customerScript;
	}
	public void setCustomerScript(String customerScript) {
		this.customerScript = customerScript;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
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
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
