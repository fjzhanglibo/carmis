package mis.action.rank;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.DepartmentBean;
import mis.bean.PartBean;
import mis.bean.RankBean;
import mis.domain.Department;
import mis.domain.Part;
import mis.domain.Rank;

public class AddRankAction extends BaseAction {
	private Rank rank;
	private List<RankBean> ranks;
	private Integer rankCount;
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	public List<RankBean> getRanks() {
		return ranks;
	}
	public void setRanks(List<RankBean> ranks) {
		this.ranks = ranks;
	}
	public Integer getRankCount() {
		return rankCount;
	}
	public void setRankCount(Integer rankCount) {
		this.rankCount = rankCount;
	}
	public String execute() throws Exception {
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		
		Rank r = bgr.getRank(this.getRank().getRankName());
		if(r!=null){
			super.addActionMessage("等级名称重复，请重新输入！");
			return INPUT;
		}
		
		
		if(rank.getRankName()!=null){
			bgr.addRank(getRank());
		}
		
		List<RankBean> rs = bgr.getRankBeans();
		this.setRanks(rs);
	
		this.setRankCount(rs.size());
		

		ctx.put("type", 19);		
				
				
		return SUCCESS;
	}
	
}
