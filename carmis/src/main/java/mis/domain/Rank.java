package mis.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "rank")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Rank  implements Serializable  {
	private static final long serialVersionUID = 48L;
	// 消息类的标识属性
	//顾客等级ID
	@Id@Column(name="rank_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rankId;
	//等级名称
	@Column(name="rank_name", nullable=false, length=50 , unique=true)
	private String rankName;
	//折扣额
	@Column(name="rank_discount", nullable=false, length=50 )
	private Double rankDiscount;
	//办卡费用
	@Column(name="rank_cost", nullable=false,  length=50 )
	private Double rankCost;
	//备注
	@Column(name="rank_script", length=50 )
	private String rankScript;
	
	public Rank() {
		super();
	}
	public Rank(Integer rankId, String rankName, Double rankDiscount, Double rankCost,
			String rankScript) {
		super();
		this.rankId = rankId;
		this.rankName = rankName;
		this.rankDiscount = rankDiscount;
		this.rankScript = rankScript;
		this.rankCost = rankCost;
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
	public Double getRankCost() {
		return rankCost;
	}
	public void setRankCost(Double rankCost) {
		this.rankCost = rankCost;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rankDiscount == null) ? 0 : rankDiscount.hashCode());
		result = prime * result
				+ ((rankName == null) ? 0 : rankName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rank other = (Rank) obj;
		if (rankDiscount == null) {
			if (other.rankDiscount != null)
				return false;
		} else if (!rankDiscount.equals(other.rankDiscount))
			return false;
		if (rankName == null) {
			if (other.rankName != null)
				return false;
		} else if (!rankName.equals(other.rankName))
			return false;
		return true;
	}
	
	
	
	

}
