package mis.action.rank;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import mis.action.base.BaseAction;
import mis.bean.CarBean;
import mis.bean.RankBean;
import mis.bean.UserBean;
import mis.domain.Rank;

public class ShowChangeRankAction extends BaseAction {
	private Integer rankId;
	private RankBean rankBean;
	public Integer getRankId() {
		return rankId;
	}
	public void setRankId(Integer rankId) {
		this.rankId = rankId;
	}
	public RankBean getRankBean() {
		return rankBean;
	}
	public void setRankBean(RankBean rankBean) {
		this.rankBean = rankBean;
	}

	public String execute() throws Exception{
		
		ActionContext ctx = ActionContext.getContext();

		if(this.getRankId()!=null){
			this.setRankBean(bgr.getRankBean(getRankId()));
		
			ctx.put("type",20);
			return SUCCESS;
		}
		
		else {

			ctx.put("type",21 );
			return "add";
			
		}
	}

}
