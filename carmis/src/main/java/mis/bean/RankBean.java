package mis.bean;

public class RankBean {

	//�˿͵ȼ�ID
	private Integer rankId;
	//�ȼ�����
	private String rankName;
	//�ۿ۶�
	private Double rankDiscount;
	//�쿨����
	private Double rankCost;
	//��ע
	private String rankScript;
	//�˿�����
	private Integer userCount;
	public RankBean() {
		super();
	}
	public RankBean(Integer rankId, String rankName, Double rankDiscount,Double rankCost,
			String rankScript, Integer userCount) {
		super();
		this.rankId = rankId;
		this.rankName = rankName;
		this.rankDiscount = rankDiscount;
		this.rankCost = rankCost;
		this.rankScript = rankScript;
		this.userCount = userCount;
	}
	public Integer getRankId() {
		return rankId;
	}
	public void setRankId(Integer rankId) {
		this.rankId = rankId;
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
	public String getRankScript() {
		return rankScript;
	}
	public void setRankScript(String rankScript) {
		this.rankScript = rankScript;
	}
	public Integer getUserCount() {
		return userCount;
	}
	public void setUserCount(Integer userCount) {
		this.userCount = userCount;
	}
	public Double getRankCost() {
		return rankCost;
	}
	public void setRankCost(Double rankCost) {
		this.rankCost = rankCost;
	}
	
	
}
