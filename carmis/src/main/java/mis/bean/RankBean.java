package mis.bean;

public class RankBean {

	//顾客等级ID
	private Integer rankId;
	//等级名称
	private String rankName;
	//折扣额
	private Double rankDiscount;
	//办卡费用
	private Double rankCost;
	//备注
	private String rankScript;
	//顾客数量
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
