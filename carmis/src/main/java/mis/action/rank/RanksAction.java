package mis.action.rank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.DepartmentBean;
import mis.bean.RankBean;
import mis.bean.UserBean;
import mis.domain.Department;
import mis.domain.Rank;

public class RanksAction extends BaseAction {
	private List<RankBean> ranks;
	private int rankCount;
	public List<RankBean> getRanks() {
		return ranks;
	}
	public void setRanks(List<RankBean> ranks) {
		this.ranks = ranks;
	}
	public int getRankCount() {
		return rankCount;
	}
	public void setRankCount(int rankCount) {
		this.rankCount = rankCount;
	}
	
	public String execute() throws Exception{
		// ´´½¨ActionContextÊµÀý
		ActionContext ctx = ActionContext.getContext();
		
		List<RankBean> rs = bgr.getRankBeans();
		this.setRanks(rs);
	
		this.setRankCount(rs.size());
		

		ctx.put("type", 19);
		
		
		
		return SUCCESS;
	}

}
