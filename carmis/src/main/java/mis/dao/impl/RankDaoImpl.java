package mis.dao.impl;

import java.util.List;

import mis.dao.RankDao;
import mis.domain.Rank;
import common.dao.impl.BaseDaoHibernate4;

public class RankDaoImpl extends BaseDaoHibernate4<Rank> implements RankDao {
	public Rank findByName(String rankName){
		List<Rank> l = find("select p from Rank p where p.rankName = ?0" , rankName);
		if (l!= null && l.size() >= 1)
		{
			return l.get(0);
		}
		return null;
	}
	
	public Rank findById(Integer rankId){
		return super.get(Rank.class, rankId);
	}
	

}
