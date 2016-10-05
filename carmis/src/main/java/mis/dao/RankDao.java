package mis.dao;

import mis.domain.Rank;

import common.dao.BaseDao;

public interface RankDao extends BaseDao<Rank> {
	
	public Rank findByName(String rankName);
		
	public Rank findById(Integer rankId);
}
