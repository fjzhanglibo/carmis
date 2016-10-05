package mis.action.rank;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarBean;
import mis.bean.CustomerBean;
import mis.bean.RankBean;
import mis.domain.Rank;

public class ChangeRankAction extends BaseAction {
	private RankBean rankBean;
	private List<RankBean> ranks;
	private Integer rankCount;
	public RankBean getRankBean() {
		return rankBean;
	}
	public void setRankBean(RankBean rankBean) {
		this.rankBean = rankBean;
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
		
		
		Rank r = bgr.getRank(this.getRankBean().getRankName());
		Rank r1 = bgr.getRank(this.getRankBean().getRankId());
		if(r!=null&&r.getRankId()!=r1.getRankId()){
			super.addActionMessage("等级名称重复，请重新输入！");
			return INPUT;
		}
		
		bgr.changeRank(getRankBean());
		
		List<RankBean> rs = bgr.getRankBeans();
		this.setRanks(rs);
	
		Integer rankCount = rs.size();
		

		ctx.put("type", 19);
		return SUCCESS;
		
	}
}
